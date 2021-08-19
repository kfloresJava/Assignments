package com.flores.OurDojos.models;

import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.PrePersist;
import javax.persistence.PreUpdate;
import javax.persistence.Table;

@Entity
@Table(name="dojo")
public class Dojo {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long dID;
	
	private String dName;
	
	@OneToMany(mappedBy = "mDojo",cascade = CascadeType.ALL, fetch=FetchType.LAZY)
	private List<Ninja> ninjas;

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
	
	
	
	public Dojo() {
		
	}
	
	

	public Dojo(String dName) {
		this.dName = dName;
	}

	public long getdID() {
		return dID;
	}

	public void setnID(long dID) {
		this.dID = dID;
	}

	public String getdName() {
		return dName;
	}

	public void setdName(String dName) {
		this.dName = dName;
	}

	public List<Ninja> getNinjas() {
		return ninjas;
	}

	public void setNinjas(List<Ninja> ninjas) {
		this.ninjas = ninjas;
	}

	
	
}
