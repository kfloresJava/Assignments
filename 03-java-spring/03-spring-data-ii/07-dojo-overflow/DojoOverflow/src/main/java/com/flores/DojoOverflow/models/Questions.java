package com.flores.DojoOverflow.models;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Table;



@Entity
@Table(name="questions")
public class Questions {
	

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long qID;

	private String qDesc;
	
	@OneToMany(mappedBy="question",cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	private List<Answers> answers;
	
	@ManyToMany(fetch=FetchType.LAZY)
	@JoinTable(
			name="tagscon",
			joinColumns=@JoinColumn(name="questionid"),
			inverseJoinColumns = @JoinColumn(name="tagid")
			
			)
	private List<Tags> tags;

	
	
	public Questions() {
	
	}

	public Questions(String qDesc) {

		this.qDesc = qDesc;
	}

	public long getqID() {
		return qID;
	}

	public void setqID(long qID) {
		this.qID = qID;
	}

	public String getqDesc() {
		return qDesc;
	}

	public void setqDesc(String qDesc) {
		this.qDesc = qDesc;
	}

	public List<Answers> getAnswers() {
		return answers;
	}

	public void setAnswers(List<Answers> answers) {
		this.answers = answers;
	}

	public List<Tags> getTags() {
		return tags;
	}

	public void setTags(List<Tags> tags) {
		this.tags = tags;
	}
	
	
	

}
