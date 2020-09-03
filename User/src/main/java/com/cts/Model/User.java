package com.cts.Model;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

@Entity
@Table(name = "User")


public  class User {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	
    private Long  user_id;
	@NotEmpty(message = " name must not be empty")
	@Size(min=2,message = " name must not be less than 2 characters")
	private String name;
	@NotEmpty(message = "Email must not be empty")
	@Email(message = "Email must be a valid email address")
	private String email;
	@NotEmpty(message = "   password must not be empty")
	@Size(min=5,message = " password must not be less than 2 characters")
	private String password;
	@NotEmpty(message = "mobile must not be empty") 
	private String mobile;
	private Long   role_id;
	public Long getUser_id() {
		return user_id;
	}
	public void setUser_id(Long user_id) {
		this.user_id = user_id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
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
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	public Long getRole_id() {
		return role_id;
	}
	public void setRole_id(Long role_id) {
		this.role_id = role_id;
	}
	
	
	
	
	
}
