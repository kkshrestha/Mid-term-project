package com.texas.Miniproject.services;

import com.texas.Miniproject.entity.Course;
import com.texas.Miniproject.repository.CourseRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CourseServiceImpl implements CourseService{

    private final CourseRepository courseRepository;

    public CourseServiceImpl(CourseRepository courseRepository) {
        this.courseRepository = courseRepository;
    }

    @Override
    public Course save(Course course) {
        return courseRepository.save(course);
    }

    @Override
    public List<Course> listAll() {
        return courseRepository.findAll();
    }

    @Override
    public Course updateCourse(Course course) {
        return null;
    }

    @Override
    public void deleteCourse(Long id) {

    }

    @Override
    public Optional<Course> getCourseById(Long id) {
        return Optional.empty();
    }
}
