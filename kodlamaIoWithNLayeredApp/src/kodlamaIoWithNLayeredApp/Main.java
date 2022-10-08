package kodlamaIoWithNLayeredApp;

import kodlamaIoWithNLayeredApp.business.CategoryManager;
import kodlamaIoWithNLayeredApp.business.CourseManager;
import kodlamaIoWithNLayeredApp.business.InstructorManager;
import kodlamaIoWithNLayeredApp.core.logging.Logger;
import kodlamaIoWithNLayeredApp.dataAccess.HibernateCourseDao;
import kodlamaIoWithNLayeredApp.dataAccess.JdbcCategoryDao;
import kodlamaIoWithNLayeredApp.dataAccess.JdbcInstructorDao;
import kodlamaIoWithNLayeredApp.entities.Category;
import kodlamaIoWithNLayeredApp.entities.Course;
import kodlamaIoWithNLayeredApp.entities.Instructor;
import kodlamaIoWithNLayeredApp.core.logging.DatabaseLogger;
import kodlamaIoWithNLayeredApp.core.logging.FileLogger;
import kodlamaIoWithNLayeredApp.core.logging.MailLogger;



public class Main{

	public static void main(String[] args) throws Exception {
		
	
		Logger[] loggers = {new DatabaseLogger(),new FileLogger(), new MailLogger()};
		
		
		Instructor instructor1 = new Instructor(1,"Salih","Öner");
		
		InstructorManager instructorManager = new InstructorManager(new JdbcInstructorDao(),loggers);
		instructorManager.add(instructor1);
		System.out.println("*******************\n");
		
		
		
		Course course = new Course(4,"JAVA","0");
		
		CourseManager courseManager = new CourseManager(new HibernateCourseDao(),loggers);
		courseManager.add(course);
		System.out.println("*******************\n");
		
		
		Category category = new Category(2,"Programming");
		
		CategoryManager categoryManager = new CategoryManager(new JdbcCategoryDao(),loggers);
		categoryManager.add(category);
		System.out.println("*******************\n");

	}

}
