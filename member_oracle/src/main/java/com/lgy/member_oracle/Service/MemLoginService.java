package com.lgy.member_oracle.Service;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.ui.Model;

import com.lgy.member_oracle.DAO.MemDAO;
import com.lgy.member_oracle.DTO.MemDTO;

public class MemLoginService implements MemService {

	@Override
	public int excute(Model model) {
		Map<String, Object> map = model.asMap();
		HttpServletRequest request = (HttpServletRequest) map.get("request");
		String id = request.getParameter("mem_uid");
		String pw = request.getParameter("mem_pwd");
		
		MemDAO dao = new MemDAO();
		int re = dao.login(id, pw);
		
		return re;
	}
	
}
