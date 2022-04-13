package com.app.dto;

import lombok.*;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class EnquiryResponseDto {
	
    private String response;
    public EnquiryResponseDto() {
		super();
	}
	public EnquiryResponseDto(String response, int custId) {
		super();
		this.response = response;
		this.custId = custId;
	}
	public String getResponse() {
		return response;
	}
	public void setResponse(String response) {
		this.response = response;
	}
	public int getCustId() {
		return custId;
	}
	public void setCustId(int custId) {
		this.custId = custId;
	}
	private int custId;
     
}
