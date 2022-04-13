package com.app.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class GetEmailDto {
	private String email;


	public String getEmail() {
		return email;
	}
	public GetEmailDto() {
		super();
	}
	public GetEmailDto(String email) {
		super();
		this.email = email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	
}
