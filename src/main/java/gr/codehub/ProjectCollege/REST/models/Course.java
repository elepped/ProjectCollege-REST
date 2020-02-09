package gr.codehub.ProjectCollege.REST.models;

import gr.codehub.ProjectCollege.REST.models.enums.Cohort;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class Course {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private static String name;
    private Cohort cohort;

    public static String getName() {
        return name;
    }
}
