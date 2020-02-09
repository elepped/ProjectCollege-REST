package gr.codehub.ProjectCollege.REST.controllers;

import gr.codehub.ProjectCollege.REST.models.Student;
import gr.codehub.ProjectCollege.REST.services.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class StudentController {
    @Autowired
    private StudentService studentService;

    @GetMapping("college/students")
    public List<Student> getAllStudentsController() {
        return studentService.getAllStudents();
    }

    @GetMapping("college/students/{id}")
    public Student getStudentByIdController(@PathVariable int id) {
        return studentService.getStudentById(id);
    }
}
