package gr.codehub.ProjectCollege.REST.controllers;

import gr.codehub.ProjectCollege.REST.models.Course;
import gr.codehub.ProjectCollege.REST.services.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CourseController {
    @Autowired
    private CourseService courseService;

    @GetMapping("college/courses")
    public List<Course> getAllCoursesController() {
        return courseService.getAllCourses();
    }

    @GetMapping("college/courses/{id}")
    public Course getCourseByIdController(@PathVariable int id) {
        return courseService.getCourseById(id);
    }
}
