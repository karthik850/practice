package io.springbootweb.course;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import io.springbootweb.topic.Topic;

/**
 * Rest Controller class to map request to service
 * @author karthik
 *
 */
@RestController
public class CourseController {
	
	@Autowired
	private CourseService courseService;
	
	@RequestMapping("/topics/{topicid}/courses")
	public List<Course> getAllCourses(@PathVariable String topicid) {
		return courseService.getAllCourses(topicid);
	}
	
	@RequestMapping("/topics/{id}/{name}/{description}")
	public Course getOneCourse1(@PathVariable String id, @PathVariable String name, @PathVariable String description){
		return courseService.getcoursewithname(id,name,description);
	}
	
	@RequestMapping(method=RequestMethod.POST,value="/topics/{topicid}/courses")
	public void addTCourse(@RequestBody Course course,@PathVariable String topicid) {
		course.setTopic(new Topic(topicid,"",""));
		courseService.addCourse(course);
	}
	
	@RequestMapping(method=RequestMethod.PUT,value="/topics/{topicid}/courses/{id}")
	public void updateTopic(@RequestBody Course course,@PathVariable String id,@PathVariable String topicid) {
		course.setTopic(new Topic(topicid,"",""));
		courseService.updateCourse(course,id);
	}
	
	@RequestMapping(method=RequestMethod.DELETE,value="/topics/{topicid}/courses/{id}")
	public void deleteTopic(@PathVariable String id) {
		courseService.deleteCourse(id);
	}


}
