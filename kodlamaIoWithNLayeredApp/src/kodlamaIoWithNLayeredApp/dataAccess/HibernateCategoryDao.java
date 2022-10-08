package kodlamaIoWithNLayeredApp.dataAccess;

import kodlamaIoWithNLayeredApp.entities.Category;

public class HibernateCategoryDao implements CategoryDao{

	@Override
	public void add(Category category) {
		System.out.println("Category added to database with Hibernate ");
		
	}

}
