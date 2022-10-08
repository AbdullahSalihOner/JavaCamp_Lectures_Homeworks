package kodlamaIoWithNLayeredApp.dataAccess;

import kodlamaIoWithNLayeredApp.entities.Category;

public class JdbcCategoryDao implements CategoryDao{

	@Override
	public void add(Category category) {
		System.out.println("Category added to database with Jdbc ");
		
	}

}
