package com.lgy.spring_Service;

import java.util.ArrayList;


import org.springframework.ui.Model;

import com.lgy.spring_DAO.itemDAO;
import com.lgy.spring_DTO.itemDTO;

public class ItemContentService implements ItemService {

	@Override
	public void excute(Model model) {
		// TODO Auto-generated method stub
		itemDAO dao = new itemDAO();
		ArrayList<itemDTO> items = dao.list();
		model.addAttribute("list",items);
	}
	
}
