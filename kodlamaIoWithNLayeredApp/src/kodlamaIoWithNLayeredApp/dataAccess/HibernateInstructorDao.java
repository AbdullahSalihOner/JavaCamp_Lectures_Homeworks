package kodlamaIoWithNLayeredApp.dataAccess;

import kodlamaIoWithNLayeredApp.entities.Instructor;

public class HibernateInstructorDao implements InstructorDao {

	@Override
	public void add(Instructor instructor) {
		System.out.println("Instructor added to database with Hibernate ");
		
	}

}
