package com.lgy.member_std_oracle.dao;

import java.util.ArrayList;
import java.util.HashMap;

import com.lgy.member_std_oracle.dto.MemDTO;

public interface MemDAO {
	public ArrayList<MemDTO> loginYn(HashMap<String, String> param);
	public void write(HashMap<String, String> param);
}







