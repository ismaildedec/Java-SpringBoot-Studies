package exceptionDemo;

import java.io.BufferedReader;
import java.io.FileReader;

public class Main {

	public static void main(String[] args) {

		
		/*
		 * try {
		 * 
		 * int[] sayilar = new int[] {1,2,3,4}; System.out.println(sayilar[5]);
		 * 
		 * } catch (ArrayIndexOutOfBoundsException exception) {
		 * 
		 * System.out.println(exception); }catch (StringIndexOutOfBoundsException
		 * exception) {
		 * 
		 * System.out.println(exception); }catch (Exception exception) {
		 * 
		 * System.out.println("Loglandı: "+ exception); }finally {
		 * System.out.println("Ben her türlü çalışırım"); }
		 */
		
		BufferedReader bufferedReader = null;
		int total = 0;
		
		try {
			
			 bufferedReader = new BufferedReader(new FileReader("C:\\Users\\İsmail\\eclipse-workspace\\exceptionDemo\\src\\exceptionDemo\\sayilar.txt"));
			String line = null;
			
			while ( (line = bufferedReader.readLine()) != null) {
				
				total += Integer.valueOf(line);
			}
			 System.out.println("Toplam: " + total);
			 
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		

	}

}
