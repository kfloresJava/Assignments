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
@Table(name="categories")
public class Categories {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long cID;
	
	private String cName;
	
	@Column(updatable=false)
	@DateTimeFormat(pattern="yyyy-MM-dd")
	private Date createdAt;
	@DateTimeFormat(pattern="yyyy-MM-dd")
	private Date updatedAt;
	
	
	@ManyToMany(fetch = FetchType.LAZY)
    @JoinTable(
        name = "categories_products", 
        joinColumns = @JoinColumn(name = "category_id"), 
        inverseJoinColumns = @JoinColumn(name = "product_id")
    )
	private List<Product> products; 
	
	public List<Product> getproducts() {
		return products;
	}

	public void setProdList(List<Product> products) {
		this.products = products;
	}

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


	public List<Product> getProducts() {
		return products;
	}

	public void setProducts(List<Product> products) {
		this.products = products;
	}

	public Categories() {
		
	}

	public long getcID() {
		return cID;
	}

	public void setcID(long cID) {
		this.cID = cID;
	}

	public String getcName() {
		return cName;
	}

	public void setcName(String cName) {
		this.cName = cName;
	}
	
	
}
