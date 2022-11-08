package Concept;

public class Engines {
	private String brand;
	private int price;
	private String model;
	
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public void setModel(String model) {
		this.model = model;
	}
	
	public String getBrand() {
		return brand;
	}
	
	public int getPrice() {
		return price;
	}
	
	public String getModel() {
		return model;
	}
	
	
	public Engines(String brand,int price,String model) {
		this.brand=brand;
		this.price=price;
		this.model=model;
	}
	public String toString() {
		return brand+" "+price+" "+model;
	}
	

}
