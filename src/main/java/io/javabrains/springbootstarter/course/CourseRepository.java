package io.javabrains.springbootstarter.course;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface CourseRepository extends CrudRepository<Course, String> {

	// Finds courses by name
	//public List<Course> findByName(String name);
	// Finds courses which matches the description
	//public List<Course> findByDescription(String description);
	
	public List<Course> findByTopicId(String topicId);
	
}
