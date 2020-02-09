package gr.codehub.ProjectCollege.REST.controllers;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class CollegeController {

    //    ENDPOINTS
//    college/
//    college/courses
//    college/students
//    college/student/{id}
//    college/student/{id}/modules
//    college/students/{id}/module/{moduleName}/marks

    @GetMapping("college/")
    public String getIntroduction() {

        return "WELCOME"; //IntroductionMessageHTML?
    }


    ///////////////////
    @GetMapping("college/student/{id}/modules}")
    public String getStudents() {
        return
    }

    //////////////////
    @GetMapping("college/students/{id}/module/{moduleName}/marks")
    public String getStudents() {
        return
    }


}
