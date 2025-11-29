package in.arunIt.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.arunIt.binding.Course;
import in.arunIt.repo.CourseRepository;


@Service
public class CourseServiceImpl implements CourseService {
	
	@Autowired
	private CourseRepository courseRepository;
	
	

	@Override
	public String upsert(Course course) {
		courseRepository.save(course);
		return "Success";
	}

	@Override
	public Course getById(Integer cid) {
		Optional<Course> findById = courseRepository.findById(cid);
		if(findById.isPresent()) {
			return findById.get();
		}
		
		return null;
	}

	@Override
	public List<Course> getAllCourses() {
		return courseRepository.findAll();
		
	}

	@Override
	public String deleteById(Integer cid) {
		
		if(courseRepository.existsById(cid)) {
			courseRepository.deleteById(cid);
			return "Delete Success";
		}else {
			return "No record Found";
		}
		
	}

}
