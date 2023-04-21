
public class Car implements Comparable <Car> {

	public static Object Type;
	String make;
	int engine;
	int price;
	
	Car(String m,int e,int p){
		make=m;
		engine=e;
		price=p;
		
	}
	
	public String toString() {
		
		return "Make: "+make+" Engine Capacity: "+engine
				+" Price: "+price;
	}
	
	public int CompareTo(Car c) {
		
		return price=c.price;
	}
	
	int getPrice() {
		return price;
	}
	
	String getMake() {
		return make;
	}

	public int getEngine() {
		// TODO Auto-generated method stub
		return 0;
	}

	public Object getType() {
		// TODO Auto-generated method stub
		return null;
	}
}
