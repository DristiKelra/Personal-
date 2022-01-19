package com.example.Mentscape.Logindomain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
 
@Entity
@Table(name="login")
public class Login 
{
	@Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long userid;
	 @Column(name = "Username", nullable = false, length = 50)
	private String username;
	@Column(nullable = false, unique = true, length = 100)
    private String emailid;
	@Column(nullable = false, length = 50)
    private String password;
 
    
public Login()
{
}
 
public Login(Long Userid, String Username,String Emailid ,String Password) 
{
	this.userid = Userid;
	this.username =Username;
	this.emailid = Emailid;
	this.password = Password;
}




public Long getId() 
{
	return userid;
}
public void setId(Long id) 
{
	this.userid = id;
}
public String getUsername() 
{
	return username;
}
public void setUsername(String Username) 
{
	this.username = Username;
}
public String getEmailid() 
{
	return emailid;
}
public void setEmailid(String Emailid) 
{
	this.emailid = Emailid;
}

public String getPassword() 
{
	return password;
}
public void setPassword(String Password) 
{
	this.password = Password;
}
}


