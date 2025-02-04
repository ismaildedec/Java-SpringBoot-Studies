package arrayListDemo;

import java.util.ArrayList;
import java.util.Iterator;

public class Main {

	public static void main(String[] args) {

		ArrayList sayilar = new ArrayList();
		
		sayilar.add(1);
		sayilar.add(100);
		sayilar.add("Dedeç");
		
		System.out.println(sayilar.get(0));
		
		//2.index i değiştirdi
		sayilar.set(2, 5000);
		System.out.println(sayilar.get(2));
		
		//silme
		//sayilar.remove(0);
		
		//tüm array listitemizle
		//sayilar.clear();
		
		for (Object i: sayilar) {

			System.out.println(i);
			
		}

	}

}
