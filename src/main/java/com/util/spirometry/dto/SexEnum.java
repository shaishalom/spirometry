package com.util.spirometry.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;


@AllArgsConstructor
public enum SexEnum {
	MALE(0),FEMALE(1);
	
	@Getter
	public final Integer value;
	
}
