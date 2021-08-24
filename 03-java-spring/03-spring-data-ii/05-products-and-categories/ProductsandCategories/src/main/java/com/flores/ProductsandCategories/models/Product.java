package com.flores.ProductsandCategories.models;

import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.PrePersist;
import javax.persistence.PreUpdate;
import javax.persistence.Table;

import org.springframework.format.annotation.DateTimeFormat;



@Entity
@Table(name="products")
public class Product {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long pID; 
	
	private String pName;
	private String description;
	private double price;
	
	@Column(updatable=false)
	@DateTimeFormat(pattern="yyyy-MM-dd")
	private Date createdAt;
	@DateTimeFormat(pattern="yyyy-MM-dd")
	private Date updatedAt;
	
	
	 @ManyToMany(fetch = FetchType.LAZY)
	    @JoinTable(
	        name = "categories_products", 
	        joinColumns = @JoinColumn(name = "product_id"), 
	        inverseJoinColumns = @JoinColumn(name = "category_id")
	        )
	private List<Categories> categories; 
	
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
	
	
	
	public List<Categories> getCategories() {
		return categories;
	}

	public void setCategories(List<Categories> categories) {
		this.categories = categories;
	}

	public List<Categories> getcategories() {
		return categories;
	}
	
	

	public void setCatList(List<Categories> categories) {
		this.categories = categories;
	}

	public Product() {
		
	}

	public long getpID() {
		return pID;
	}

	public void setpID(long pID) {
		this.pID = pID;
	}

	public String getpName() {
		return pName;
	}

	public void setpName(String pName) {
		this.pName = pName;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}
	
	
	
}
