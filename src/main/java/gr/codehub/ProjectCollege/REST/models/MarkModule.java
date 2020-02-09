package gr.codehub.ProjectCollege.REST.models;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
@AllArgsConstructor

public class MarkModule {
    private Module module;
    private List<AchievedMark> achievedMarks;

    public MarkModule() {
        achievedMarks = new ArrayList<>();
    }
}
