package repositoryDemo;

public class Main {

	public static void main(String[] args) {
		
		//Burada Customer ve Product veri tabanı ile yaptığımız işlemleri temsil ediyor.
		//Ama validatör DB ile ilgili işlemler barındırmayacak 
		//O yüzden generic ile tip güvenliğini sağlamamız lazım. 
		//IEntityRepository veri tabanı işlemlerini barındırıyor. 
		//T extends IEntity diyerek sadece IEntity sınıfını implements edenlerin kullanacağı işlemelri ayarladık
		//CustomerDal DB işlemlerini yaptığımız yeri temsil ediyor
		// IEntityRepository<Customer> diyerek Customer türünde ekleme silme gibi işlewmleri yapıyoruz. 
		
		Validator validator = new Validator();
		Customer customer = new Customer();
		validator.validator(customer);
		

	}

}
