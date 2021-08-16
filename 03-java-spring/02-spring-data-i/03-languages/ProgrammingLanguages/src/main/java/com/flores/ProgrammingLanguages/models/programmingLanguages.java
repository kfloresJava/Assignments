package com.flores.ProgrammingLanguages.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

@Entity
//name of your table
@Table(name="mypls")
public class programmingLanguages {
		
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long pID;
	//Attributes
	@Size(min=2,max=20)
	private String languageName;
	@Size(min=2,max=20)
	private String languageCreator;
	@NotEmpty
	private String version;
	
	
	
	
	
	public programmingLanguages() {
	
	}
	
	public programmingLanguages(String languageName, String languageCreator, String version) {
		this.languageName = languageName;
		this.languageCreator = languageCreator;
		this.version = version;
	}
	
	public long getpID() {
		return pID;
	}
	public void setpID(long pID) {
		this.pID = pID;
	}
	public String getLanguageName() {
		return languageName;
	}
	public void setLanguageName(String languageName) {
		this.languageName = languageName;
	}
	public String getLanguageCreator() {
		return languageCreator;
	}
	public void setLanguageCreator(String languageCreator) {
		this.languageCreator = languageCreator;
	}
	public String getVersion() {
		return version;
	}
	public void setVersion(String version) {
		this.version = version;
	}

	
}
