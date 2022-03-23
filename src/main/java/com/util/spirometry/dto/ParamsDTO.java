package com.util.spirometry.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@Data
@AllArgsConstructor
@Builder
public class ParamsDTO {

	public SexEnum sex; //mail
	public double fev1;
	public double fvc;
	
//	public double pfvc;
	public double age;
//	public double ppefr;
	public double height;
	public double pefr;
	
	
}
