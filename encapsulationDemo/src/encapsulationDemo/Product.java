package encapsulationDemo;

public class Product {
	private int _id;
	private String _name;
	private String _destripcation;
	private double _price;
	private int _stockAmount;

	public int get_id() {
		return _id;
	}

	public void set_id(int id) {
		_id = id;
	}

	public String get_name() {
		return _name;
	}

	public void set_name(String name) {
		_name = name;
	}

	public String get_destripcation() {
		return _destripcation;
	}

	public void set_destripcation(String destripcation) {
		_destripcation = destripcation;
	}

	public double get_price() {
		return _price;
	}

	public void set_price(double price) {
		_price = price;
	}

	public int get_stockAmount() {
		return _stockAmount;
	}

	public void set_stockAmount(int stockAmount) {
		_stockAmount = stockAmount;
	}

}
