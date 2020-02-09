package gr.codehub.ProjectCollege.REST.repositories;

import gr.codehub.ProjectCollege.REST.models.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface StudentRepository extends JpaRepository<Student, Integer> {
        }