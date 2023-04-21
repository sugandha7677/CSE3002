import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Streams {

	public static void main(String[] args) {
	
		List<String>names=Arrays.asList("Henry","Marry");
		
		
		//without Streams
		
		//eg1
		
		for(String name: names) {
			System.out.println(name.toUpperCase());
		}

		
		//eg2
		
		List<String>longnames=new ArrayList<>();
		for(String name:names) {
			if(name.length()>5) {
				longnames.add(name.toUpperCase());
			}
		}
		for(int i=0;i<longnames.size();i++) {
			System.out.println(longnames.get(i));
		}
		// using streams
		
		names.stream()
			.map(s ->s.toUpperCase())
			.forEach(System.out::println);
		
		
		//eg2
		
		List <String>longnames1=names.stream()
				.filter(s ->s.length()>5)
				.collect(Collectors.toList());
		
		longnames.forEach(System.out::println);
		
	}

}
