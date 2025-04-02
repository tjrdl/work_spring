package com.lgy.board_mysql.service;

import java.util.ArrayList;

import org.springframework.ui.Model;

import com.lgy.board_mysql.dao.BoardDAO;
import com.lgy.board_mysql.dto.BoardDTO;

// 게시판 목록 조회
public class BoardListService implements BoardService {
	@Override
	//dao 단 호출
	public void excute(Model model) {
		BoardDAO dao = new BoardDAO();
		// 게시글들을 dtos 객체로 받음
		ArrayList<BoardDTO> dtos = dao.list();
		model.addAttribute("list",dtos);
	}
}
