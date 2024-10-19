package mx.edu.itspa.SpringVerano2023.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Subject {
	@Id
	private String key;
	@Column
	private String name;
	
	public Subject() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	public Subject(String key, String name) {
		super();
		this.key = key;
		this.name = name;
	}


	public String getKey() {
		return key;
	}
	public void setKey(String key) {
		this.key = key;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
}
