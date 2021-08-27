package com.flores.DojoOverflow.models;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="answers")
public class Answers {
	

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long aID;

	private String aDesc;
	
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="question_id")
	private Questions question;

	
	
	public Answers() {
	
	}



	public Answers(String aDesc) {
		this.aDesc = aDesc;
	}
	
	

	public long getaID() {
		return aID;
	}

	public void setaID(long aID) {
		this.aID = aID;
	}

	public String getaDesc() {
		return aDesc;
	}

	public void setaDesc(String aDesc) {
		this.aDesc = aDesc;
	}

	public Questions getQuestion() {
		return question;
	}

	public void setQuestion(Questions question) {
		this.question = question;
	}

	
}
