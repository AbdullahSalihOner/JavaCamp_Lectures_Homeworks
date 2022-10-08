package oopWithNLayeredApp.dataAccess;

import oopWithNLayeredApp.entities.Product;

public class JdbcProductDao implements ProductDao{
	public void add(Product product) {
		//Just dataBase code can write here... SQL
		System.out.println("JDBC ile veritabanina eklendi");
	}

}
