package kodlamaIoWithNLayeredApp.dataAccess;

import kodlamaIoWithNLayeredApp.entities.Course;

public class HibernateCourseDao implements CourseDao {

	@Override
	public void add(Course course) {
		System.out.println("Course added to database with Hibernate ");
		
	}

}
