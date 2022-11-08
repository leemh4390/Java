package ch13;

public class TravelCustomer {
	private String name;
	private int age;
	private int price;
	
	public TravelCustomer(String name, int age, int price) {
		this.name = name;
		this.age = age;
		this.price = price;
	}
	
	public String getName() {
		return name;
	}
	
	public int getage() {
		return age;
	}
	
	public int getprice() {
		return price;
	}
	
	public String toString() {
		return "name : " + name + "age : " + age + "price : " + price;
	}
}
