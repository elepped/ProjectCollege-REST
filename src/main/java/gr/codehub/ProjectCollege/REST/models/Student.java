package gr.codehub.ProjectCollege.REST.models;

import lombok.AllArgsConstructor;
import lombok.Data;

import org.springframework.data.annotation.Id;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

import java.util.ArrayList;
import java.util.List;

@Data
@AllArgsConstructor
@Entity

public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private Course course;
    private List<MarkModule> markModules;

    public Student() {
        markModules = new ArrayList<>();
    }

    public int getId() {
        return id;
    }
}

