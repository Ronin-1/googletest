package com.example.demo.course;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;

@Service
public class CourseService {
	
	@Autowired
	private CourseRepository courseRepository;


	public List<Course> getAllCourses(String topicId){
		List<Course> courses = new ArrayList<>();
		courseRepository.findByTopicId(topicId)
		.forEach(courses::add); 
		return courses;
	}
	
	public Course getCourse(String id) {
		return courseRepository.findOne(id); 
		//return topics.stream().filter(t -> t.getId().equals(id)).findFirst().get();
	}
	public void addCourse(Course course) {
		//topics.add(topic);
		courseRepository.save(course);
	}
	public void updateCourse(Course course ) {		
		courseRepository.save(course);

	}
	public void deleteCourse(String id) {
	courseRepository.delete(id);
		//topics.removeIf(t -> t.getId().equals(id));
		}
	
		
	}
 