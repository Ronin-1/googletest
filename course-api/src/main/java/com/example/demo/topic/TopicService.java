package com.example.demo.topic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;

@Service
public class TopicService {

	List<Topic> topics = new ArrayList<>(Arrays.asList (
				new Topic("spring", "framew", "asdfasf"),
				new Topic("sdfds", "fdsad", "dfsasdaf"),
				new Topic("safewfwafs", "fdsasd", "daewiojsda")		
				));	

	public List<Topic> getAllTopics(){
		return topics;
	}
	
	public Topic getTopic(String id) {
		return topics.stream().filter(t -> t.getId().equals(id)).findFirst().get();
	}
	public void addTopic(Topic topic) {
		topics.add(topic);
	}
	public void updateTopic(String id, Topic topic) {
		for (int i = 0; i < topics.size(); i ++) {
			Topic t = topics.get(i);
			if(t.getId().equals(id)) {
				topics.set(i, topic);
			}
		}
	}
	public void deleteTopic(String id) {
	topics.removeIf(t -> t.getId().equals(id));
		}
		
	}
 