package Abstract;

import Entities.Customer;

public abstract class BaseCustomerManager implements ICustomerService {
	@Override
	public void Save(Customer customer)
	    {
	       System.out.println("Veri taban�na kayded�ld�: "+customer.getFirstName());
	    }

	


	

	
}
