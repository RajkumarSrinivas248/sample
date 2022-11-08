package Concept;

public class Car {
	private String brand;
	private int price;
	private String color;
	private Engine engine;
	public void setBrand(String brand) {
		this.brand=brand;
	}
	public void setPrice(int price) {
		this.price=price;
	}
	public void setColor(String color) {
		this.color=color;
	}
	public void setEngine(Engine engine) {
		this.engine=engine;
	}
	public String getBrand() {
		return brand;
	}
	public int getPrice() {
		return price;
	}
	public String getColor() {
		return color;
	}
	public Engine getEngine() {
		return engine;
	}
	public Car(String brand,int price,String color,Engine engine) {
		this.brand=brand;
		this.price=price;
		this.color=color;
		this.engine=engine;
	}
	public String toString() {
		return brand+" "+price+" "+color+" "+engine.getBrand()+" "+engine.getPrice()+" "+engine.getModel();
	}

}
