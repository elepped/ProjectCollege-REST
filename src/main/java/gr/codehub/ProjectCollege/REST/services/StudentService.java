package gr.codehub.ProjectCollege.REST.services;

import gr.codehub.ProjectCollege.REST.models.Student;
import gr.codehub.ProjectCollege.REST.repositories.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {

    @Autowired
    private StudentRepository studentRepository;


    public List<Student> getAllStudents() {
        return studentRepository.findAll();
    }

    public Student getStudentById(int id) {
        return studentRepository.findById(id).get();
    }


}