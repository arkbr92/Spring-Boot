package in.arunIt.repo;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;

import in.arunIt.binding.Course;

public interface CourseRepository extends JpaRepository<Course, Serializable> {

}
