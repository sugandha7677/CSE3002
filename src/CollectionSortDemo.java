import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class CollectionSortDemo {

	public static void main(String[] args) {
		

		List<Integer> values = Arrays.asList(20,30,40,51,23,17,43);
		System.out.println(values);
		Collections.sort(values);
		System.out.println(values);
		
		
		List<Car1> myCars = Arrays.asList(
		new Car1("Maruti",1000,8),
		new Car1("Hundai",979,7),
		new Car1("Honda",1500,14),
		new Car1("Skoda",990,9)
		);
		for(Car1 c: myCars)
		System.out.println(c);
		
		System.out.println();
		
		Collections.sort(myCars);
		System.out.println(myCars);
		
		System.out.println();
		
		Comparator<Car1> engine = new Comparator<Car1>() {
		public int compare(Car1 c1, Car1 c2)
		{
		return c1.engine - c2.engine;
		}
		};
		Collections.sort(myCars,engine);
		for(Car1 c: myCars)
		System.out.println(c);
		}

		}

class Car1 implements Comparable<Car1>
{
		String make;
		int engine;
		int price;
		Car1(String m, int e, int p)
		{
		make = m;
		engine = e;
		price = p;
		}
		public String toString()
		{
		return "Make: "+make+" Engine Capacity: "+engine+" Price: " + price;
		}
		public int compareTo(Car1 c)
		{
		return price - c.price;
	}

}
