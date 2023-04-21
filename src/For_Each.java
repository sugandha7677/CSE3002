import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class For_Each {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<String>fruits=Arrays.asList("apple","banana","lemon");
		
		for(String aFruit:fruits) {
			System.out.println(aFruit);
		}
		
		//Using anonymous inner class
		fruits.forEach(new Consumer<String>() {
			
			public void accept(String s) {
				System.out.println(s);
			}
			
		});
		
		//using lambda expression
		
		fruits.forEach(s ->System.out.println(s));
	}

}

