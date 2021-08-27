package com.flores.ControlsWithViews.models;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;

@Entity
@Table(name="users")
public class Users {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long uID;
	
	private String uEmail;
	private String uPass;
	@Transient
	private String uPass2;
	
	
	
	public Users() {
		
	}
	public Long getuID() {
		return uID;
	}
	public void setuID(Long uID) {
		this.uID = uID;
	}
	public String getuEmail() {
		return uEmail;
	}
	public void setuEmail(String uEmail) {
		this.uEmail = uEmail;
	}
	public String getuPass() {
		return uPass;
	}
	public void setuPass(String uPass) {
		this.uPass = uPass;
	}
	public String getuPass2() {
		return uPass2;
	}
	public void setuPass2(String uPass2) {
		this.uPass2 = uPass2;
	}

	
	
}
