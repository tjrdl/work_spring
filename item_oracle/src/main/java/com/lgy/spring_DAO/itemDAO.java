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
		// dbcp ������� db ����
		try {
			Context ctx = new InitialContext();
			// context.xml �� ���� (server.xml �� �޸� �ѹ� �������� ��� ������Ʈ���� ��밡��)
			// dataSource : ��ȸ, ����, ����, ���� ������ ��� ��� ����
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
		// �ڿ� �ݳ�
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
	
	// �Խ��� ��� ��ȸ(type parameter : �Խñ� ��ü)
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
					
					// �ϳ��� �Խñ� ��ü
					itemDTO item = new itemDTO(name,price,description );

					// �Խñ� �߰�
					items.add(item);
				}

			} catch (Exception e) {
				// TODO: handle exception
			} finally
			// �ڿ� �ݳ�
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