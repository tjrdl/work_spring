package com.lgy.board_mysql.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Timestamp;
import java.util.ArrayList;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.sql.DataSource;

import com.lgy.board_mysql.dto.BoardDTO;

import lombok.extern.slf4j.Slf4j;

//DB SQL 처리
@Slf4j
public class BoardDAO {
	DataSource dataSource;

	public BoardDAO() {
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

	// 게시판 목록 조회(type parameter : 게시글 객체)
	public ArrayList<BoardDTO> list() {
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		String sql = "select boardNo, boardName, boardTitle, boardContent, boardDate, boardHit from tbl_board";
		ArrayList<BoardDTO> dtos = new ArrayList<BoardDTO>();

		try {
			conn = dataSource.getConnection();
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();

			while (rs.next()) {
				int boardNo = rs.getInt("boardNo");
				String boardName = rs.getString("boardName");
				String boardTitle = rs.getString("boardTitle");
				String boardContent = rs.getString("boardContent");
				Timestamp boardDate = rs.getTimestamp("boardDate");
				int boardHit = rs.getInt("boardHit");
				// 하나의 게시글 객체
				BoardDTO dto = new BoardDTO(boardNo, boardName, boardTitle, boardContent, boardDate, boardHit);

				// 게시글 추가
				dtos.add(dto);
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
		return dtos;
	}

	public void write(String boardName, String boardTitle, String boardContent) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		String sql = "insert into tbl_board(boardName, boardTitle, boardContent) values(?,?,?)";
		ArrayList<BoardDTO> dtos = new ArrayList<BoardDTO>();

		try {
			conn = dataSource.getConnection();
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, boardName);
			pstmt.setString(2, boardTitle);
			pstmt.setString(3, boardContent);
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

	// 게시글 하나를 리턴하기 위해서 BoardDTO 사용 (strID : 글번호)
	   public BoardDTO contentView(String strID) {
	      upHit(strID);
	      Connection conn = null;
	      PreparedStatement pstmt = null;
	      ResultSet rs = null;
	      String sql = "select boardNo, boardName, boardTitle, boardContent, boardDate, boardHit from tbl_board where boardNo=?";

	      BoardDTO dto = null;

	      try {
	         conn = dataSource.getConnection();
	         pstmt = conn.prepareStatement(sql);
	         pstmt.setInt(1, Integer.parseInt(strID));
	         rs = pstmt.executeQuery();

	         if (rs.next()) {
	            int boardNo = rs.getInt("boardNo");
	            String boardName = rs.getString("boardName");
	            String boardTitle = rs.getString("boardTitle");
	            String boardContent = rs.getString("boardContent");
	            Timestamp boardDate = rs.getTimestamp("boardDate");
	            int boardHit = rs.getInt("boardHit");

	            dto = new BoardDTO(boardNo, boardName, boardTitle, boardContent, boardDate, boardHit);
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
	      return dto;
	   }

	   public void upHit(String boardNo) {
	      Connection conn = null;
	      PreparedStatement pstmt = null;
	      String sql = "update tbl_board set boardHit=boardHit+1" + " where boardNo=?";

	      try {
	         conn = dataSource.getConnection();
	         pstmt = conn.prepareStatement(sql);
	         pstmt.setInt(1, Integer.parseInt(boardNo));
	         pstmt.executeUpdate();
	      } catch (Exception e) {
	         e.printStackTrace();
	      } finally {
	         try {
	            if (pstmt != null)
	               pstmt.close();
	            if (conn != null)
	               conn.close();
	         } catch (Exception e2) {
	            e2.printStackTrace();
	         }
	      }
	   }
	   
	   public void modify(String boardNo, String boardName, String boardTitle, String boardContent) {
		      Connection conn = null;
		      PreparedStatement pstmt = null;
		      String sql = "update tbl_board set boardName=?, boardTitle=?, boardContent=? where boardNo=?";

		      try {
		         conn = dataSource.getConnection();
		         pstmt = conn.prepareStatement(sql);
		         pstmt.setString(1, boardName);
		         pstmt.setString(2, boardTitle);
		         pstmt.setString(3, boardContent);
		         pstmt.setInt(4, Integer.parseInt(boardNo));
		         pstmt.executeUpdate();
		      } catch (Exception e) {
		         e.printStackTrace();
		      } finally {
		         try {
		            if (pstmt != null)
		               pstmt.close();
		            if (conn != null)
		               conn.close();
		         } catch (Exception e2) {
		            e2.printStackTrace();
		         }
		      }
	   }
	  
	   public void delete(String boardNo) {
		   log.info("777");
		   Connection conn = null;
		      PreparedStatement pstmt = null;
		      String sql = "delete from tbl_board where boardNo=?";

		      try {
		         conn = dataSource.getConnection();
		         pstmt = conn.prepareStatement(sql);
		         pstmt.setInt(1, Integer.parseInt(boardNo));
		         log.info(sql);
		         pstmt.executeUpdate();
		         
		      } catch (Exception e) {
		         e.printStackTrace();
		      } finally {
		         try {
		            if (pstmt != null)
		               pstmt.close();
		            if (conn != null)
		               conn.close();
		         } catch (Exception e2) {
		            e2.printStackTrace();
		         }
		      }
	   }
	}
