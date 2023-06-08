package com.cg.springboot.jpaandhibernate.course;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.cg.springboot.jpaandhibernate.course.Course;
import com.cg.springboot.jpaandhibernate.course.jpa.CourseJpaRepository;
import com.cg.springboot.jpaandhibernate.course.springdatajpa.CourseSpringDataJpaRepository;

@Component
public class CourseCommandLineRunner implements CommandLineRunner{

	//@Autowired
	//private CourseJdbcRepository repository;
	
	//@Autowired
	//private CourseJpaRepository repository;
	
	@Autowired
	private CourseSpringDataJpaRepository repository;
	
	@Override
	public void run(String... args) throws Exception {
	
		repository.save(new Course(1,"Aws","sunil"));
		repository.save(new Course(2,"Azure","sunil"));
		repository.save(new Course(3,"DevOps","sunil"));
		
		repository.deleteById(1l);
		
		System.out.println(repository.findById(2l));
		System.out.println(repository.findById(3l));
		
	}
}
