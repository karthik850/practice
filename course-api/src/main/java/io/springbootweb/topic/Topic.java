package io.springbootweb.topic;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Topic {
	
	@Id
	private String ID;
	private String Name;
	private String description;
	
	
	public Topic() {
	}
	
	public Topic(String iD, String name, String description) {
		super();
		ID = iD;
		Name = name;
		this.description = description;
	}
	
	
	public String getID() {
		return ID;
	}
	public void setID(String iD) {
		ID = iD;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
}
