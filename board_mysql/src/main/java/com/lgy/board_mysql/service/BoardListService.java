package com.lgy.board_mysql.service;

import java.util.ArrayList;

import org.springframework.ui.Model;

import com.lgy.board_mysql.dao.BoardDAO;
import com.lgy.board_mysql.dto.BoardDTO;

// �Խ��� ��� ��ȸ
public class BoardListService implements BoardService {
	@Override
	//dao �� ȣ��
	public void excute(Model model) {
		BoardDAO dao = new BoardDAO();
		// �Խñ۵��� dtos ��ü�� ����
		ArrayList<BoardDTO> dtos = dao.list();
		model.addAttribute("list",dtos);
	}
}
