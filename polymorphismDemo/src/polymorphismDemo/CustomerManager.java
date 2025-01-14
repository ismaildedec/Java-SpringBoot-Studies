package polymorphismDemo;

public class CustomerManager {
	private BaseLogger logger;
	
	public CustomerManager(BaseLogger logger){
		this.logger = logger;
		
	}
	
	public void Add() {
		System.out.println("Müşteri eklendi");
		//bu yaptigimiz eklemelerin loglarini tutmak istiyoruz.
		//bu sekilde ilerlersek artık databaseloggera bagli olacagiz.
		//onun yerine baselogger ile calismamiz lazim.
		//DatabaseLogger databaseLogger = new DatabaseLogger();
		//databaseLogger.Log("Database logger");
		
		//artık mainden nereye log yapacağımızı kolayca degistirebiliriz.
		this.logger.Log("log mesajı");
	}
}
