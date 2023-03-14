package io.springbootweb.course;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface CourseRepository extends CrudRepository<Course,String>{

	public List<Course> findByTopicID(String topicid);
	
	Course FindByIDAndNameAndDescription(String ID,String Name, String description);
	 
}
