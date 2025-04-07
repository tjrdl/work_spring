package com.lgy.item_std_oracle.service;

import java.util.ArrayList;
import java.util.HashMap;

import org.springframework.ui.Model;

import com.lgy.item_std_oracle.dto.itemDTO;

public interface ItemService {
	public void write(HashMap<String, String> param);
	public ArrayList<itemDTO> list();
}
