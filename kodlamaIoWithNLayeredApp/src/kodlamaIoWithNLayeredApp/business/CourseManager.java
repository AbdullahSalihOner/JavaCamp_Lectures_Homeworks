package kodlamaIoWithNLayeredApp.business;

import kodlamaIoWithNLayeredApp.core.logging.Logger;
import kodlamaIoWithNLayeredApp.dataAccess.CourseDao;
import kodlamaIoWithNLayeredApp.entities.Category;
import kodlamaIoWithNLayeredApp.entities.Course;

public class CourseManager {
	private CourseDao courseDao;
	private Logger[] loggers;

	public CourseManager(CourseDao courseDao,Logger[] loggers) {
		this.courseDao = courseDao;
		this.loggers = loggers;
	}
	
	public void add(Course course) throws Exception
	{
		// I will refactor this code
		Course[] courses = {
				new Course(1,"C#","Free"),
				new Course(2,"Go","5"),
				new Course(3,"ReactJs","10")
		};
		
		for (Course crs : courses) {
			if (crs.getCourseName().equals(course.getCourseName())) {
				
				System.out.println("*****Course name cannot be repeated*****");
				throw new Exception("*****Course name cannot be repeated*****");
			}
		}
		
		if (Integer.parseInt(course.getPrice())<0) {
			System.out.println("The price of the course cannot be less than 0.");
			throw new Exception("*****The price of the course cannot be less than 0*****");
		}
		//Business Rules
		//Kurs ismi tekrar edemez
		//kursun fiyatı 0 dan küçük olamaz.
		courseDao.add(course);
		
		for (Logger logger : loggers) { 
			logger.log(course.getCourseName());
		}
		
	}
	

}
