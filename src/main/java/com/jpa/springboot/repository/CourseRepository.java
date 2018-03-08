package com.jpa.springboot.repository;

import javax.persistence.EntityManager;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.jpa.springboot.entity.Course;

@Repository
@Transactional // For delete - needs a transaction
public class CourseRepository {

	// private Logger log = (Logger) LoggerFactory.getLogger(this.getClass());

	@Autowired
	EntityManager em;

	public Course findById(Long id) {
		return em.find(Course.class, id);
	}

	public void deleteById(Long id) {
		Course course = em.find(Course.class, id);
		em.remove(course);
	}

	public Course save(Course course) {
		if (course.getId() == null) {
			em.persist(course);
		} else {
			em.merge(course);
		}

		return null;
	}

	/**
	 * Everything inside this method is in a transaction - until the end of the
	 * transaction Entity Manager will update this: - course.setName("Web Services
	 * in 100 Steps - Updated XX");
	 */
	public void playWithEntityManager() {
		// log.debug("PlayWithEntityManager - start");
		Course course = new Course("Web Services in 100 steps");
		em.persist(course);
		course.setName("Web Services in 100 Steps - Updated XX");
	}

	public void playWithEntityManager2() {

		Course course1 = new Course("Web Services in 100 steps - before detach()");
		em.persist(course1);

		Course course2 = new Course("Angular JS in 100 steps - before detach()");
		em.persist(course2);

		em.flush();

		em.clear(); // remove all from EntityManager - after clear() method not reflect in database

		// The entity Manager do not track after detach() method
		em.detach(course1);
		em.detach(course2);

		em.refresh(course1); // Keep the last database state to course1

		course1.setName("Web Services in 100 Steps - Updated - After flush()-1 - after detach()");
		em.flush(); // changes made are send out to database

		course2.setName("Angular JS in 100 steps - Updated- After flush()-1 - after detach()");
		em.flush();
	}

	public void playWithEntityManager3() {

		Course course1 = new Course("Web Services in 100 Steps");
		em.persist(course1);

		Course course2 = findById(10001L);
		course2.setName("Jpa in 50 Steps - Updated");
	}
}
