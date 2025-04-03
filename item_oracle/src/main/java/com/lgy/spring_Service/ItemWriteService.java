package com.lgy.spring_Service;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.ui.Model;

import com.lgy.spring_DAO.itemDAO;

public class ItemWriteService implements ItemService {

	@Override
	public void excute(Model model) {
		// TODO Auto-generated method stub
		Map<String, Object>map = model.asMap();
		
		HttpServletRequest request = (HttpServletRequest) map.get("request");
		String name = request.getParameter("name");
		String price = request.getParameter("price");
		String description = request.getParameter("description");
		
		itemDAO dao = new itemDAO();
		dao.write_item(name, price, description);
	}
	
}
