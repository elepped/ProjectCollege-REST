package gr.codehub.ProjectCollege.REST.services;


import gr.codehub.ProjectCollege.REST.models.Student;
import gr.codehub.ProjectCollege.REST.repositories.ModuleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ModuleService {

    @Autowired
    private ModuleRepository moduleRepository;

    //"college/student/{id}/modules}"
    public List<Module> getModulesPerStudent(String name) {
        List<Student> students = new ArrayList<>();

//        for (Student s : students)
//                    moduleRepository
//                    .findAll()
//                    .stream()
//                    .filter(module -> module.getName().equals(name))
//                    .collect(Collectors.toList());
//        return ;

    }
}

