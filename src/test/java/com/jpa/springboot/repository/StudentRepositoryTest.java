package com.jpa.springboot.repository;

import javax.persistence.EntityManager;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.jpa.springboot.SpringBootJpah21Application;
import com.jpa.springboot.entity.Student;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = SpringBootJpah21Application.class) // Launch the entire context of SpringBootJpah21Application
public class StudentRepositoryTest {

	private Logger log = (Logger) LoggerFactory.getLogger(this.getClass());

	@Autowired
	StudentRepository repository;

	@Autowired
	EntityManager em;




	@Test
	public void retrieveStudentAndPassportDetails() {
		Student student = em.find(Student.class, 20001L);
		log.info("student -> {}", student);
		log.info("passport -> {}", student.getPassport());
	}
}
