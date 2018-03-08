package com.jpa.springboot;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.jpa.springboot.repository.CourseRepository;
import com.jpa.springboot.repository.StudentRepository;

@SpringBootApplication
public class SpringBootJpah21Application implements CommandLineRunner {
	
	private Logger log = (Logger) LoggerFactory.getLogger(this.getClass());

	@Autowired
	private CourseRepository courseRepository;
	@Autowired
	private StudentRepository studentRepository;

	public static void main(String[] args) {
		SpringApplication.run(SpringBootJpah21Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		studentRepository.saveStudentWithPassport();
	}

}
