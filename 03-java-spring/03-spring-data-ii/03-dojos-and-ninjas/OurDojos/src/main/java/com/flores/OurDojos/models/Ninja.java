package com.flores.OurDojos.models;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.PrePersist;
import javax.persistence.PreUpdate;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;

import com.sun.istack.NotNull;

@Entity
@Table(name="ninja")
public class Ninja {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long nID;
	
	@NotEmpty
	private String firstName;
	@NotEmpty
	private String lastName;
	@NotNull
	private int age;
	
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="dojo_id")
	private Dojo mDojo;
	
	@Column(updatable=false)
	private Date createdAt;
	private Date updatedAt;
	
	@PrePersist
	protected void onCreate()
	{
		this.createdAt=new Date();
	}
	
	@PreUpdate
	protected void onUpdate()
	{
		this.updatedAt=new Date();
	}
	
	
	public Ninja() {
		
	}

	public long getnID() {
		return nID;
	}

	public void setnID(long nID) {
		this.nID = nID;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public Dojo getmDojo() {
		return mDojo;
	}

	public void setmDojo(Dojo mDojo) {
		this.mDojo = mDojo;
	}
	
	
	
}
