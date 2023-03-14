package io.springbootweb.course;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import io.springbootweb.topic.Topic;

@Entity
public class Course {
	
	@Id
	private String ID;
	private String Name;
	private String description;
	@ManyToOne
	private Topic topic;
	
	

	public Course(String iD, String name, String description, Topic topic) {
		super();
		ID = iD;
		Name = name;
		this.description = description;
		this.topic = topic;
	}

	public Course() {
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
	public Topic getTopic() {
		return topic;
	}

	public void setTopic(Topic topic) {
		this.topic = topic;
	}
}
