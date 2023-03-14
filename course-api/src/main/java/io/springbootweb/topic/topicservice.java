package io.springbootweb.topic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
/**
 * Business class logic to perform CRUD operations
 * @author karth
 *
 */
@Service
public class topicservice {
	
	@Autowired
	private Topicrepository topicRepository;
	
	// Mock data of topics
	private List<Topic> topics = new ArrayList<>(Arrays.asList(
			new Topic("Spring1","SpringFrame","my first spring"),
			new Topic("java","SpringFrame","my first spring1"),
			new Topic("python","SpringFrame","my first spring1")
			));
	
	public List<Topic>getAllTopics(){
		List<Topic> topics=new ArrayList<>();
		topicRepository.findAll().forEach(topics::add);
		return topics;
	}
	
	public Optional<Topic> getTopic(String id) {
		return topicRepository.findById(id);
	}
	public void addTopic(Topic topic) {
		topicRepository.save(topic);
	}
	
	public void updateTopic(Topic topic,String id) {
		topicRepository.save(topic);
	}
	
	public void deleteTopic(String id) {
		topicRepository.deleteById(id);
	}
}
