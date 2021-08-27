package com.flores.DojoOverflow.models;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import javax.validation.constraints.Pattern;

@Entity
@Table(name="tags")
public class Tags {
	

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long tID;

	@Pattern(regexp="^(([a-zA-Z\\s])+$|([a-zA-Z\\s]+,)[a-zA-Z\\s]+){1,2}$",message="Tags must be separated by commas, max 3")
	private String tDesc;
	
	@ManyToMany(fetch=FetchType.LAZY)
	@JoinTable(
			name="tagscon",
			joinColumns=@JoinColumn(name="tagid"),
			inverseJoinColumns = @JoinColumn(name="questionid")
			
			)
	private List<Questions> ques;

	public Tags() {
	
	}
	
	
	
	

	public Tags(
			@Pattern(regexp = "^(([a-zA-Z\\s])+$|([a-zA-Z\\s]+,)[a-zA-Z\\s]+){1,2}$", message = "Tags must be separated by commas, max 3") String tDesc) {

		this.tDesc = tDesc;
	}





	public long gettID() {
		return tID;
	}

	public void settID(long tID) {
		this.tID = tID;
	}

	public String gettDesc() {
		return tDesc;
	}

	public void settDesc(String tDesc) {
		this.tDesc = tDesc;
	}

	public List<Questions> getQuestions() {
		return ques;
	}

	public void setQuestions(List<Questions> tags) {
		this.ques = tags;
	}
	
	
	
}
