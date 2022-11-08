package Concept;

public class Engine {
	private String brand;
	private int price;
	private String model;
	public void setBrand(String brand) {
		this.brand=brand;
	}
	public void setPrice(int Price) {
		this.price=price;
	}
	public void setModel(String model) {
		this.model=model;
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
	public Engine(String brand,int price,String model) {
		this.brand=brand;
		this.price=price;
		this.model=model;
	}
	public String toSTring() {
		return brand+" "+price+" "+model;
	}
	

}
