package kodlamaIoWithNLayeredApp.dataAccess;

import kodlamaIoWithNLayeredApp.entities.Instructor;

public class JdbcInstructorDao implements InstructorDao{

	@Override
	public void add(Instructor instructor) {
		System.out.println("Instructor added to database with Jdbc ");
		
	}

}
