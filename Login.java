package com.example.Mentscape.Logindomain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
 
@Entity
@Table(name="mentscape_login")
public class Login {
	@Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long mentscape_Userid;
	private String mentscape_username;
    private String mentscape_Emailid;
    private String mentscape_password;
 
    
public Login()
{
}
 
public Login(Long mentscape_Userid, String mentscape_username,String mentscape_Emailid ,String mentscape_password) 
{
	this.mentscape_Userid = mentscape_Userid;
	this.mentscape_username =mentscape_username;
	this.mentscape_Emailid = mentscape_Emailid;
	this.mentscape_password = mentscape_password;
}




public Long getId() 
{
	return mentscape_Userid;
}
public void setId(Long id) 
{
	this.mentscape_Userid = id;
}
public String getUsername() 
{
	return mentscape_username;
}
public void setUsername(String username) 
{
	this.mentscape_username = username;
}
public String getEmailid() 
{
	return mentscape_Emailid;
}
public void setEmailid(String Emailid) 
{
	this.mentscape_Emailid = Emailid;
}

public String getPassword() 
{
	return mentscape_password;
}
public void setPassword(String password) 
{
	this.mentscape_password = password;
}
}


