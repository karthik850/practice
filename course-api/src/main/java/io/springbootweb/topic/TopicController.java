package io.springbootweb.topic;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Controller class to point out the request urls from network to perform operfrations from topic 
 * @author karthik
 *
 */
@RestController
public class TopicController {
	//Initialize the service class
	@Autowired
	private topicservice topicService;
	
	/**
	 * to get all available topics
	 * @return list of topics
	 */
	@RequestMapping("/topics")
	public List<Topic> getAllTopics() {
		return topicService.getAllTopics();
	}
	/**
	 * Request to get one topic based on the id(path param)
	 * @param id
	 * @return
	 */
	@RequestMapping("/topics/{id}")
	public Optional<Topic> getOneTopic(@PathVariable String id) {
		return topicService.getTopic(id);
	}
	
	/**
	 * Request to add one topic to database
	 * @param id
	 * @return
	 */
	@RequestMapping(method=RequestMethod.POST,value="/topics")
	public void addTopic(@RequestBody Topic topic) {
		topicService.addTopic(topic);
	}
	
	/**
	 * Request to update one topic to database based on Topic ID value
	 * @param id
	 * @return
	 */
	@RequestMapping(method=RequestMethod.PUT,value="/topics/{id}")
	public void updateTopic(@RequestBody Topic topic,@PathVariable String id) {
		topicService.updateTopic(topic,id);
	}
	
	/**
	 * Request to delete specific Topic from database
	 * @param id
	 */
	@RequestMapping(method=RequestMethod.DELETE,value="/topics/{id}")
	public void deleteTopic(@PathVariable String id) {
		topicService.deleteTopic(id);
	}


}
