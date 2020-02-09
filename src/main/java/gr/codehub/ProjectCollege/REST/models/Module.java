package gr.codehub.ProjectCollege.REST.models;

import gr.codehub.ProjectCollege.REST.models.enums.ModuleType;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class Module {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String name;
    private String course;
    private ModuleType moduleType;

}
