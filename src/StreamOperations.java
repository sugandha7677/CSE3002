import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamOperations {

	public static void main(String[] args) {
		
		Stream s;
		
		s = Stream.of(5,3,2,3,1,6,9);
		s.forEach(item -> System.out.println(item));
		
		System.out.println("---------------------------------------");
		
		Integer[] array = { 10,20,30,40,50,60 };
		s = Stream.of(array);
		System.out.println(s.count());
		
		System.out.println("---------------------------------------");
		
		List<Integer> values = Arrays.asList(1,3,5,7,9, 2,4,6,8,10);
		values.stream() //Stream<Integer>
		.filter( e -> e % 2 == 0) // Stream<Integer>
		.forEach(System.out::println);
		
		System.out.println("---------------------------------------");
		
		values.stream() //Stream<Integer> 1,3,5,7,9,2,4,6,8,10
		.sorted() //Stream<Integer> 1,2,3,4,5,6,7,8,9,10
		.skip(3) //Stream<Integer> 4,5,6,7,8,9,10
		.limit(3) //Stream<Integer> 4,5,6
		.forEach(System.out::println); //4 5 6 will be printed
		
		System.out.println("---------------------------------------");
		
		List<String> greetings = Arrays.asList("Hello", "Welcome", "Greetings", "Good day", "Bye bye");
		List<Integer> lengths = greetings.stream()
		.map(t -> t.length()) // Stream<Integer>
		.collect(Collectors.toList());
		lengths.forEach(System.out::println);
		
		System.out.println("---------------------------------------");
		
		List<String> greetings2 = Arrays.asList("Hello", "Welcome", "Greetings", "Good day", "Bye bye");
		List<Integer> lengths2 = greetings2.stream()
		.sorted(Comparator.comparing(String::length))
		.map(t -> t.length()) // Stream<Integer>
		.collect(Collectors.toList());
		lengths2.forEach(System.out::println);
		
		System.out.println("---------------------------------------");

	}

}
