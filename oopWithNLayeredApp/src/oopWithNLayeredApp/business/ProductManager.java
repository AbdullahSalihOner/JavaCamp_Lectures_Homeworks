package oopWithNLayeredApp.business;

import oopWithNLayeredApp.core.loging.Logger;
import oopWithNLayeredApp.dataAccess.ProductDao;
import oopWithNLayeredApp.entities.Product;

public class ProductManager {
	private ProductDao productDao;
	private Logger[] loggers;
	
	
	public ProductManager(ProductDao productDao, Logger[] loggers) {
		this.productDao = productDao;
		this.loggers = loggers;
	}


	public void add(Product product) throws Exception { //response request
		// business rule here
		if (product.getUnitPrice() < 10) {
			throw new Exception("Ürün fiyatı 10 dan küçük olmaz");
		}
		
		productDao.add(product);
		
		for (Logger logger : loggers) { //[database ,mail]
			logger.log(product.getName());
		}
	}

}
