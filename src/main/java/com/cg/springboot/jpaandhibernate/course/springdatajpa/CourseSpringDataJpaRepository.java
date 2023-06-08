package com.cg.springboot.jpaandhibernate.course.springdatajpa;

import org.springframework.data.jpa.repository.JpaRepository;
import com.cg.springboot.jpaandhibernate.course.Course;

public interface CourseSpringDataJpaRepository extends JpaRepository<Course, Long> {

}
