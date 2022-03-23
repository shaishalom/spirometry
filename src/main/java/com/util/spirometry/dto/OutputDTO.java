package com.util.spirometry.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

@Data
@AllArgsConstructor
@Builder
@ToString
public class OutputDTO {

	
	public double ppefr;
	public double ratio;
	public double pratio;
	public String cratio;
	public double cfev1;
	public double cfvc;
	public double cpefr;
	
	
}
