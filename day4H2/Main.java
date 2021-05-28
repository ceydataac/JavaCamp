import Abstract.BaseCustomerManager;
import Adapters.MernisServiceAdapter;
import Concreate.NeroCustomerManager;
import Concreate.StarbucksCustomerManager;
import Entities.Customer;

public class Main {

	public static void main(String[] args) {
		
		BaseCustomerManager customerManager = new NeroCustomerManager(new MernisServiceAdapter() );
		
		Customer customer = new Customer(1,"Ceyda", "Taç", "2001", "1111");
		customerManager.save(customer);
		
	}

}
