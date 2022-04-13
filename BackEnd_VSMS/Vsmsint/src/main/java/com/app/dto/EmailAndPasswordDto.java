package com.app.dto;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;

import lombok.*;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Data
public class EmailAndPasswordDto {
	@NotBlank(message = "email field cannot be blank!")
	@Email(message = "provide valid email id")
	private String email;
	
	@Override
	public String toString() {
		return "EmailAndPasswordDto [email=" + email + ", password=" + password + "]";
	}

	public EmailAndPasswordDto() {
		super();
	}

	public EmailAndPasswordDto(
			@NotBlank(message = "email field cannot be blank!") @Email(message = "provide valid email id") String email,
			@NotBlank(message = "provide valid password") @Pattern(regexp = "((?=.*\\d)(?=.*[a-z])(?=.*[#@$*]).{6,20})", message = "Invalid password") String password) {
		super();
		this.email = email;
		this.password = password;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@NotBlank(message = "provide valid password")
	@Pattern(regexp = "((?=.*\\d)(?=.*[a-z])(?=.*[#@$*]).{6,20})", message = "Invalid password")
	private String password;

}
