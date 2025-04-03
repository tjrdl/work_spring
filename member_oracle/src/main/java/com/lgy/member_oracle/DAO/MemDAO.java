package com.lgy.member_oracle.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.sql.DataSource;

import org.springframework.util.ExceptionTypeFilter;

public class MemDAO {
	DataSource dataSource;
	public MemDAO() {

		try {
			Context ctx = new InitialContext();

			dataSource = (DataSource) ctx.lookup("java:comp/env/jdbc/oracle");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public int login(String id, String pw) {
		int re = -1;
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		String sql = "select mem_pwd from mvc_member where mem_uid=?";
		try {
			conn = dataSource.getConnection();
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, id);
			rs = pstmt.executeQuery();
			
			if(rs.next()) {
				String pwd = rs.getString("mem_pwd");
				if(pwd.equals(pw)) {
					re=1;
				}
				else {
					re=0;
				}
			}
			else {
				re=-1;
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
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
		return re;
	}
}
