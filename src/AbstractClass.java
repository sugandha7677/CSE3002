
public class AbstractClass {

	public static void main(String[] args) {
		
//		person faculty=new person("Balaji");
//		System.out.println(faculty.getName());

		Dancer dancer=new Dancer ("Nidhi","Bharastnatyam");
		System.out.println(dancer.getName());
		dancer.takeTest();
		
//		person policeman;
//		policeman=new Dancer("Raju","Break Dance");
//		policeman.takeTest();
		
	// if person pc=new Policeman("Raju","B1");
		//then error
		//to remove it use type casting (Downward)
		
//		Policeman pc=new Policeman("Raju","B1");
//		System.out.println(pc.getName());
//		pc.takeTest();
//		System.out.println("I am working at "+ pc.getStation());
	
		
		person pc=new Policeman("Raju","B1");
		System.out.println(pc.getName());
		pc.takeTest();
		Policeman t=(Policeman)pc;
		System.out.println("I am working at "+ t.getStation());
	}
}

 abstract class person
{
	String name;
	person(String n){
		name=n;
	}
	String getName() {
		return name;
	}
	abstract void takeTest(); // method without body
		
	
}
//
//class Dancer {
//	String name; // this is duplication so remove it
//	String type;
//	
//	Dancer(String name,String type){
//				this.name=name;
//		this.type=type;
//	}
//	String getName() {
//		return name;
//	}
//}
class Dancer extends person {
	
	String type;
	
	Dancer(String name,String type){
				super(name);
		this.type=type;
	}
	void takeTest() {
		System.out.println("I am taking test on "+type);
	}
}

class Policeman extends person{
	String station;
	Policeman(String name,String station){
		super(name);
		this.station=station;
	}
	 void takeTest() {
		 System.out.println("I am taking test for my promotion");
	}
	String getStation() {
		return station;
	}
	
	
}




















