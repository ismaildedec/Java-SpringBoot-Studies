package encapsulationDemo;

public class Main {

	public static void main(String[] args) {
		
		Product product = new Product();
		product.id = 5;
		product.name="Laptop";
		product.destripcation="Çok güzel laptop";
		product.price = 25000;
		product.stockAmount = 10;
		
		ProductManager productManager = new ProductManager();
		productManager.Add(product);

	}

}
