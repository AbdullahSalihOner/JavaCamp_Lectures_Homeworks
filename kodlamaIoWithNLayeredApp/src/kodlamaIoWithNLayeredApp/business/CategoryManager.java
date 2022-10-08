package kodlamaIoWithNLayeredApp.business;


import kodlamaIoWithNLayeredApp.core.logging.Logger;
import kodlamaIoWithNLayeredApp.dataAccess.CategoryDao;
import kodlamaIoWithNLayeredApp.entities.Category;

public class CategoryManager {
	private CategoryDao categoryDao;
	private Logger[] loggers;
	

	public CategoryManager(CategoryDao categoryDao, Logger[] loggers) {
		this.categoryDao = categoryDao;
		this.loggers = loggers;
	}
	
	public void add(Category category) throws Exception
	{   
		//This code will refactor
		Category[] categories = {
				new Category(1,"Design"),
				new Category(2,"Programming")
			
	};
		//Business Rules
		//Category ismi tekrar edemez
		for (Category ctgry : categories) {
			if (ctgry.getCategoryName().equals(category.getCategoryName())) {
				
				System.out.println("*****Category name cannot be repeated*****");
				throw new Exception("*****Category name cannot be repeated*****");
			}
		}
		
		categoryDao.add(category);
		
		
		for (Logger logger : loggers) { 
			logger.log(category.getCategoryName());
		}
	}
	
	

}
