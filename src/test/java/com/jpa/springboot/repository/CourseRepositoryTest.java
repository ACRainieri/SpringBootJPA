/*package com.jpa.springboot.repository;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.DirtiesContext;
import org.springframework.test.context.junit4.SpringRunner;

import com.jpa.springboot.SpringBootJpah21Application;
import com.jpa.springboot.entity.Course;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = SpringBootJpah21Application.class) // Launch the entire context of SpringBootJpah21Application
public class CourseRepositoryTest {

	private Logger log = (Logger) LoggerFactory.getLogger(this.getClass());

	@Autowired
	CourseRepository repository;

	*//**
	 * The context is launched, the test is executed, and the context is killed.
	 * @see CourseRepositoryTest
	 *//*
	@Test
	public void contextLoad() {
		log.info("Test is running...");
	}

	@Test
	public void findByIdBasicTest() {
		Course course = repository.findById(10003L);
		log.info("Test is running...");
		assertEquals("Spring Boot tests 1", course.getName());
	}

	@Test
	@DirtiesContext // Spring reset the data to the original state
	public void deleteByIdBasic() {
		repository.deleteById(10002L);
		assertNull(repository.findById(10002L)); // Test if is deleted
	}

	@Test
	@DirtiesContext // Spring reset the data to the original state
	public void saveBasic() {
		// get a course
		Course course = repository.findById(10001L);
		assertEquals("JPA tests 1", course.getName());

		// update details
		course.setName("JPA in 50 steps - Updated");
		repository.save(course);

		// check the value
		Course course2 = repository.findById(10001L);
		assertEquals("JPA in 50 steps - Updated", course2.getName());
	}

	@Test
	@DirtiesContext // Spring reset the data to the original state
	public void playWithEntityManager() {
		repository.playWithEntityManager();
	}

	@Test
	@DirtiesContext // Spring reset the data to the original state
	public void playWithEntityManager2() {
		repository.playWithEntityManager2();
	}

}
*/