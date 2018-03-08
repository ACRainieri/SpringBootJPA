/*package com.jpa.springboot.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.transaction.annotation.Transactional;

import com.jpa.springboot.SpringBootJpah21Application;
import com.jpa.springboot.entity.Course;
*//**
 * For native Queries we cannot use Persistence Context
 *//*
@RunWith(SpringRunner.class)
@SpringBootTest(classes = SpringBootJpah21Application.class) // Launch the entire context of SpringBootJpaH2Application
public class NativeQueriesTest {

	private Logger log = (Logger) LoggerFactory.getLogger(this.getClass());

	@Autowired
	EntityManager em;

	// -NativeQueries-//////////////////////////////////////////////////////////////////////////////////////////////////////

	@Test
	public void nativeQueryBasic() {
		Query query = em.createNativeQuery("select * from course");
		List resultList = query.getResultList();
		log.info("select * from course -> {}", resultList);
	}

	@Test
	public void nativeQueryWithEntity() {
		Query query = em.createNativeQuery("select * from course", Course.class);
		List resultList = query.getResultList();
		log.info("select * from course -> {}", resultList);
	}


	@Test
	public void nativeQueryWithParameter() {
		Query query = em.createNativeQuery("select * from course where id = ?", Course.class);
		query.setParameter(1, 10001L); //1 is position
		List resultList = query.getResultList();
		log.info("select * from course -> {}", resultList);
	}


	@Test
	public void nativeQueryWithNamedParameter() {
		Query query = em.createNativeQuery("select * from course where id = :id", Course.class);
		query.setParameter("id", 10001L); //using field name
		List resultList = query.getResultList();
		log.info("select * from course where id = :id -> {}", resultList);
	}

	*//**
	 * Need a transaction in this case @Transaction
	 *//*
	@Test
	@Transactional
	public void nativeQueryToUpdate() {
		Query query = em.createNativeQuery("update course set las_updated_date = sysdate()", Course.class);
		int numberOfRowsUpdated= query.executeUpdate();
		log.info("numberOfRowsUpdated -> {}", numberOfRowsUpdated);
	}

	// -NativeQueries-//////////////////////////////////////////////////////////////////////////////////////////////////////
}
*/