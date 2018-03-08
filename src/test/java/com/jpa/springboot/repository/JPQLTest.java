/*package com.jpa.springboot.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;
import javax.persistence.TypedQuery;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.jpa.springboot.SpringBootJpah21Application;
import com.jpa.springboot.entity.Course;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = SpringBootJpah21Application.class) // Launch the entire context of SpringBootJpaH2Application
public class JPQLTest {

	private Logger log = (Logger) LoggerFactory.getLogger(this.getClass());

	@Autowired
	EntityManager em;

//-JPQL-/////////////////////////////////////////////////////////////////////////////////////////////////////////////
	@Test
	public void jpqlBasic() {
		Query query = em.createQuery("select c from Course c");
		List resultList = query.getResultList();
		log.info("select c from course c -> {}", resultList);
	}

	@Test
	public void jpqlTyped() {
		TypedQuery<Course> query = em.createQuery("select c from Course c", Course.class);
		List<Course> resultList = query.getResultList();
		log.info("select c from course c -> {}", resultList);
	}

	@Test
	public void jpqlWhere() {
		TypedQuery<Course> query = em.createQuery("select c from Course c where name like '%100 Steps'", Course.class);
		List<Course> resultList = query.getResultList();
		log.info("select c from Course c where name like '%100 Steps' -> {}", resultList);
	}
//-JPQL-////////////////////////////////////////////////////////////////////////////////////////////////////////////
//-NamedQuery-//////////////////////////////////////////////////////////////////////////////////////////////////////

	@Test
	public void namedQueryBasic() {
		Query query = em.createNamedQuery("query_get_all_courses");
		List resultList = query.getResultList();
		log.info("select c from course c -> {}", resultList);
	}

	@Test
	public void namedQueryTyped() {
		Query query = em.createNamedQuery("query_get_all_courses");
		List resultList = query.getResultList();
		log.info("select c from course c -> {}", resultList);
	}

	@Test
	public void namedQueryWhere() {
		TypedQuery<Course> query = em.createNamedQuery("query_get_100_step_courses", Course.class);
		List<Course> resultList = query.getResultList();
		log.info("select c from Course c where name like '%100 Steps' -> {}", resultList);
	}

//-NamedQuery-////////////////////////////////////////////////////////////////////////////////////////////////////////

}
*/