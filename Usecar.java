package Concept;

public class Usecar {
	public static void main(String[]args) {
		Engine e1=new Engine("TATA",20000,"2017");
		Engine e2=new Engine("Toyota",30000,"2019");
		Engine e3=new Engine("Ford",60000,"2020");
		Engine e4=new Engine("Maruti",80000,"2013");
		
		Car c1=new Car("KIA",3500000,"Blue",e1);
		Car c2=new Car("BMW",4000000,"Black",e2);
		Car c3=new Car("BENZ",6000000,"gray",e3);
		Car c4=new Car("VOLVO",7000000,"white",e4);
		/*System.out.println(c);*/
		
		/*Car [] cars= {c1,c2,c3,c4};
		for(Car x:cars) {
			if(x.getPrice()%2==0) {
				System.out.println(x.getBrand()+" "+x.getPrice()+" "+x.getColor());
				
		
			}
		}
		*/
		System.out.println(e2.getPrice());
		System.out.println(c4);
		
	}
	
}
