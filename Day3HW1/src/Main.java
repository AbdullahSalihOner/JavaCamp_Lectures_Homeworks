
public class Main {

	public static void main(String[] args) {
		
		CustomerManager customerManager = new CustomerManager(new Customer(), new CarCreditManager());
		
		customerManager.GiveCredit();
		
		
		/*
		 * CreditManager creditManager = new CreditManager(); creditManager.Calculate();
		 * creditManager.Save();
		 * 
		 * Customer customer = new Customer(); //instance creation customer.Id = 1;
		 *
		 * 
		 * 
		 * customer.NationalIdentity = "12345";
		 * 
		 * Company company = new Company(); company.TaxNumber = "123";
		 * company.CompanyName = "Arcelik"; company.Id = 100;
		 * 
		 * CustomerManager customerManager2 = new CustomerManager(new Person());
		 * 
		 * 
		 * 
		 * CustomerManager customerManager = new CustomerManager(customer);
		 * customerManager.Save(); customerManager.Delete();
		 */
	}

}
