package arrayListWithClassDemo;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {


		ArrayList<Customer> customers = new ArrayList<Customer>();
		
		Customer asaf = new Customer(1,"Asaf","Dedeç");
		customers.add(asaf);
		
		customers.add(new Customer(2,"İhsan","Dedeç"));
		customers.add(new Customer(3,"İsmail","Dedeç"));
		
		for(Customer customer:customers) {
			
			System.out.println(customer.firstName +" " +customer.lastName );
			
		}
		
		//Bu silme işlemi gerçekleşmez.
		//customers.remove(new Customer(1,"Asaf","Dedeç"));
		
		customers.remove(asaf);
	}

}
