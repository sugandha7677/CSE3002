import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class SortingCollections {

	public static void main(String[] args) {
		
		Motorcycle yamaha = new Motorcycle("Yamaha", 55000,100);
		Motorcycle bajaj = new Motorcycle("Bajaj", 48000,98);
		Motorcycle honda = new Motorcycle("TVS", 68000, 125);
		Motorcycle herohonda = new Motorcycle("Hero-Honda", 60000, 125);
		
		ArrayList<Motorcycle> availableModels = new ArrayList<>(Arrays.asList(yamaha, bajaj, honda, herohonda));
		
		System.out.println(availableModels);
		
		Collections.sort(availableModels);
		System.out.println(availableModels);
		
		Collections.sort(availableModels, new Comparator<Motorcycle>() {
		public int compare(Motorcycle m1, Motorcycle m2)
		{
		return m1.price - m2.price;
		}
		});
		
		System.out.println(availableModels);
		
		Collections.sort(availableModels, (m1,m2)-> m1.getMake().compareTo(m2.getMake()));
		System.out.println(availableModels);
	}

}

class Motorcycle implements Comparable
{
		String make;
		int price;
		int engine;
		
		Motorcycle(String m, int p, int c)
		{
		make = m;
		price = p;
		engine = c;
		}
		
		public String toString()
		{
		return make;
		}
		
		public int compareTo(Object other)
		{
		Motorcycle m = (Motorcycle)other;
		return engine - m.engine;
		}
		
		String getMake()
		{
		return make;
		}
}


