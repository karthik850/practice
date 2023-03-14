package io.springbootweb.course;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
/**
 * Business class logic to perform CRUD operations
 * @author karthik
 *
 */
@Service
public class CourseService {
	
	@Autowired
	private CourseRepository courseRepository;
	
	public List<Course> getAllCourses(String id){
		List<Course> courses=new ArrayList<>();
		courseRepository.findByTopicID(id).forEach(courses::add);
		return courses;
	}
	

	public void addCourse(Course course) {
		courseRepository.save(course);
		
	}
	public Course getcoursewithname(String ID,String Name, String description) {
		
		return courseRepository.FindByIDAndNameAndDescription(ID, Name, description);
	}
	public void updateCourse(Course course,String id) {
		courseRepository.save(course);	
	}
	
	public void deleteCourse(String id) {
		courseRepository.deleteById(id);
	}
}
