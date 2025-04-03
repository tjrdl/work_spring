package com.lgy.board_jdbc_mysql.service;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.ui.Model;

import com.lgy.board_jdbc_mysql.dao.BoardDAO;
import com.lgy.board_jdbc_mysql.dto.BoardDTO;

public class BoardContentService implements BoardService{

	@Override
	public void excute(Model model) {
		Map<String, Object> map = model.asMap();
		HttpServletRequest request = (HttpServletRequest) map.get("request");
		String boardNo = request.getParameter("boardNo");
		
		BoardDAO dao=new BoardDAO();
//		게시글 하나의 내용을 BoardDTO 객체로 받음(boardNo(글번호) 를 넘겨서 select 쿼리 처리)
		BoardDTO dto = dao.contentView(boardNo);
//		dto 객체를 모델에 추가(뷰에서 꺼내 사용할수 있음)
		model.addAttribute("content_view", dto);
	}

}













