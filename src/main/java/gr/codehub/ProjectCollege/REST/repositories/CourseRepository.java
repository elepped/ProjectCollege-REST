package gr.codehub.ProjectCollege.REST.repositories;

import gr.codehub.ProjectCollege.REST.models.Course;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CourseRepository extends JpaRepository<Course, Integer> {

}
