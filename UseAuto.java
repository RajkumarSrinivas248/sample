package Concept;

public class UseAuto {
	public static void main(String[]args) {
		Engines e=new Engines("Mahindra",5000,"2017");
		Auto a=new Auto("paigo",40000,"2019",e);
		System.out.println(e);
		System.out.println(a.getPrice());
		System.out.println(e.getBrand());
		System.out.println(a);
		System.out.println(a);
		
	}

}
