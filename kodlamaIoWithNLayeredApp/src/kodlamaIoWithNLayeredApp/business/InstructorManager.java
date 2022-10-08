package kodlamaIoWithNLayeredApp.business;

import kodlamaIoWithNLayeredApp.core.logging.Logger;
import kodlamaIoWithNLayeredApp.dataAccess.InstructorDao;
import kodlamaIoWithNLayeredApp.entities.Instructor;

public class InstructorManager {
	private InstructorDao instructorDao;
	private Logger[] loggers;

	public InstructorManager(InstructorDao instructorDao,Logger[] loggers) {
		this.instructorDao = instructorDao;
		this.loggers = loggers;
	}
	
	public void add(Instructor instructor) throws Exception
	{
		//business ruless
		instructorDao.add(instructor);
		
		
		for (Logger logger : loggers) { 
			logger.log(instructor.getFirstName());
		}
	}
	
	

}
