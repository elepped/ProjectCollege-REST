package gr.codehub.ProjectCollege.REST.models;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.List;

@Data
@AllArgsConstructor

public class College {

    private List<Student> students;

}
