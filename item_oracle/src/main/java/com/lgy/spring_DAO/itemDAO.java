package com.lgy.spring_DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.sql.DataSource;


import com.lgy.spring_DTO.itemDTO;


public class itemDAO {
	DataSource dataSource;
	public itemDAO() {
		// dbcp 방식으로 db 연결
		try {
			Context ctx = new InitialContext();
			// context.xml 에 설정 (server.xml 과 달리 한번 설정으로 모든 프로젝트에서 사용가능)
			// dataSource : 조회, 저장, 수정, 삭제 퀘리에 모두 사용 가능
			dataSource = (DataSource) ctx.lookup("java:comp/env/jdbc/mysql");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public void write_item(String name, String price, String description) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		String sql = "insert into item_table(name, price, description) values(?,?,?)";
		

		try {
			conn = dataSource.getConnection();
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, name);
			pstmt.setInt(2, Integer.parseInt(price));
			pstmt.setString(3, description);
			pstmt.executeUpdate();

		} catch (Exception e) {
			// TODO: handle exception
		} finally
		// 자원 반납
		{
			try {
				if (rs != null)
					rs.close();
				if (pstmt != null)
					pstmt.close();
				if (conn != null)
					conn.close();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
	}
	
	// 게시판 목록 조회(type parameter : 게시글 객체)
		public ArrayList<itemDTO> list() {
			Connection conn = null;
			PreparedStatement pstmt = null;
			ResultSet rs = null;
			String sql = "select name, price, description from item_table";
			ArrayList<itemDTO> items = new ArrayList<itemDTO>();

			try {
				conn = dataSource.getConnection();
				pstmt = conn.prepareStatement(sql);
				rs = pstmt.executeQuery();

				while (rs.next()) {
					String name = rs.getString("name");
					int price = rs.getInt("price");
					String description = rs.getString("description");
					
					// 하나의 게시글 객체
					itemDTO item = new itemDTO(name,price,description );

					// 게시글 추가
					items.add(item);
				}

			} catch (Exception e) {
				// TODO: handle exception
			} finally
			// 자원 반납
			{
				try {
					if (rs != null)
						rs.close();
					if (pstmt != null)
						pstmt.close();
					if (conn != null)
						conn.close();
				} catch (Exception e2) {
					e2.printStackTrace();
				}
			}
			return items;
		}
	
	
	}