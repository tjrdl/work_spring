package com.lgy.board_mysql.service;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.ui.Model;

import com.lgy.board_mysql.dao.BoardDAO;
import com.lgy.board_mysql.dto.BoardDTO;

public class BoardContentService implements BoardService {
	@Override
	public void excute(Model model) {
		Map<String, Object>map = model.asMap();
		
		HttpServletRequest request =(HttpServletRequest)map.get("request");
		String boardNo = request.getParameter("boardNo");
		BoardDAO dao = new BoardDAO();
		// �Խñ� �ϳ��� ������ BoardDTO ��ü�� ����(����ó��)
		BoardDTO dto = dao.contentView(boardNo);
		// dto ��ü�� �𵨿� �߰�(�信�� ��� ����)
		model.addAttribute("content_view",dto);
	}
}
