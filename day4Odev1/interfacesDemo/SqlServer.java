package interfacesDemo;

public class SqlServer implements ICustomerDal {

	@Override
	public void add() {
		System.out.println("Sql server eklendi.");
	}

}
