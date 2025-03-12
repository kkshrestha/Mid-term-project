package com.texas.Miniproject.services;

import com.texas.Miniproject.entity.Course;

import java.util.List;
import java.util.Optional;

public interface CourseService {
    Course save(Course course);

    List<Course> listAll();

    Course updateCourse(Course course);

    void deleteCourse(Long id);

    Optional<Course> getCourseById(Long id);
}
