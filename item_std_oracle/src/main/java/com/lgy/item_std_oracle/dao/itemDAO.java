package com.lgy.item_std_oracle.dao;

import java.util.ArrayList;
import java.util.HashMap;

import com.lgy.item_std_oracle.dto.itemDTO;



public interface itemDAO {
	public void write(HashMap<String, String> param);
	public ArrayList<itemDTO> list();
}
