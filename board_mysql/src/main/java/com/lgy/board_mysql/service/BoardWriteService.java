package com.lgy.board_mysql.service;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.ui.Model;

import com.lgy.board_mysql.dao.BoardDAO;

// �Խñ� ����
public class BoardWriteService implements BoardService {
	
	@Override
	public void excute(Model model) {
		// Dao �� �ִ� boardName, boardTitle, boardContent ������ �ʿ�
		Map<String,Object>map = model.asMap();
		// request: ��Ʈ�ѷ��ܿ��� �����ִ� �̸�
		HttpServletRequest request =(HttpServletRequest)map.get("request");
		String boardName = request.getParameter("boardName");
		String boardTitle = request.getParameter("boardTitle");
		String boardContent = request.getParameter("boardContent");
		
		BoardDAO dao = new BoardDAO();
		dao.write(boardName,boardTitle,boardContent);
	}
}
