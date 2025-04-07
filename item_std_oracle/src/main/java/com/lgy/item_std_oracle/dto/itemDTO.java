package com.lgy.item_std_oracle.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class itemDTO {
	private String name;
	private int price;
	private String description;
}
