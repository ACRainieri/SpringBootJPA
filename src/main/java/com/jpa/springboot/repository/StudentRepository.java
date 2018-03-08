package com.jpa.springboot.repository;

import javax.persistence.EntityManager;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.jpa.springboot.entity.Passport;
import com.jpa.springboot.entity.Student;

@Repository
@Transactional // For delete/update - needs a transaction annotation
public class StudentRepository {

	@Autowired
	EntityManager em;

	public Student findById(Long id) {
		return em.find(Student.class, id);
	}

	public void deleteById(Long id) {
		Student student = em.find(Student.class, id);
		em.remove(student);
	}

	public Student save(Student student) {
		if (student.getId() == null) {
			em.persist(student);
		} else {
			em.merge(student);
		}

		return student;
	}

	/**
	 * Everything inside this method is in a transaction - until the end of the
	 * transaction Entity Manager will update this: - student.setName("Web Services
	 * in 100 Steps - Updated XX");
	 */
	// public void playWithEntityManager() {
	// // log.debug("PlayWithEntityManager - start");
	// Student student = new Student("Web Services in 100 steps");
	// em.persist(student);
	// student.setName("Web Services in 100 Steps - Updated XX");
	// }

	public void saveStudentWithPassport() {

		Passport passport = new Passport("Z123456");
		Student student = new Student("Mike");
		em.persist(passport); // Persist passport first - It is a FK in Student need to be persisted first

		student.setPassport(passport);

		em.persist(student);
	}
}
