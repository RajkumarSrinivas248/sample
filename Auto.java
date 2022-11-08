package Concept;

public class Auto {
	private String brand;
	private int price;
	private String model;
	private Engines engine;
	
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public void setEngines(Engines engine) {
		this.engine = engine;
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
	public Engines getEngines() {
		return  engine;
	}
	
	public Auto(String brand,int price,String model,Engines engine) {
		this.brand=brand;
		this.price=price;
		this.model=model;
		this.engine=engine;
		
	}
	public String toString() {
		return brand+" "+price+" "+model+" "+engine.getBrand()+" "+engine.getPrice()+" "+engine.getModel();
	}

}
