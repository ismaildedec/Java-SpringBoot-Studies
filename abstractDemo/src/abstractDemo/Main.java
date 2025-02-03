package abstractDemo;

//Musterinin veri tabanina kayit edilmesi seneryosu
//DB e kaydederken farklı db ler kullanabilirz. (Oracle, MySQL, MsSQL gibi)
public class Main {

	public static void main(String[] args) {

		CustomerManager customerManager	= new CustomerManager();
		//Artık bağımlı olmadan istediğimiz db ile çalışabilirz.
		customerManager.databaseManager = new OracleDatabaseManager();
		customerManager.getCustomer();
		
	}

}
