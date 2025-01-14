package inheritanceDemo;

public class Main {
	//inheritance sayesinde artık degisime direnmeyen bir kod yazmis oldum. 
	//Artık eklenen tum krediManagerler BaseKrediManageri extends ettiği icin direk krediUI dan kullanabilecegiz.
	public static void main(String[] args) {
		KrediUI krediUI = new KrediUI();
		krediUI.KrediHesapla(new OgretmenKrediManager());

	}

}
