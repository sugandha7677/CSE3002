//import java.util.Set;
import java.util.*;
public class TreeSet {

	public static void main(String[] args) {
	
		TreeSet<Integer> tree = new TreeSet<Integer>();
		tree.add(10);
		tree.add(20);
		tree.add(30);
		tree.add(40);
		System.out.println("TreeSet: " + tree);
		
		Iterator<Integer>iterator = tree.descendingIterator();
        System.out.println("\nValues using DescendingIterator:");
		while (iterator.hasNext()) {
		System.out.println("Value : "+ iterator.next());
		}
		
		System.out.println("First: "+tree.first());
		System.out.println("Highest: "+tree.higher());
		System.out.println("Celling: "+tree.celling());


	}

}
