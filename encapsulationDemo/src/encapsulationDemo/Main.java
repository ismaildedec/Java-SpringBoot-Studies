package encapsulationDemo;

public class Main {

	public static void main(String[] args) {

		Product product = new Product();
		product.set_id(1);
		product.set_name("Laptop");
		product.set_destripcation("Çok güzel laptop");
		product.set_price(27000);
		product.set_stockAmount(15);

		ProductManager productManager = new ProductManager();
		productManager.Add(product);

	}

}