package gr.codehub.ProjectCollege.REST.models;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.sql.Date;


@Data
@AllArgsConstructor

public class AchievedMark {

    private Date date;
    private int mark;
}
