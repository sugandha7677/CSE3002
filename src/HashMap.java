import java.util.Map;

public class HashMap {

	public static void main(String[] args) {
		
		HashMap<String,Integer> map=new HashMap<>();
		map.put("Mango",10);
		map.put("Apple",25);
		map.put("Banana",34);
		map.put("Grapes",67);
		for(Map.Entry m : map.entrySet()){
		System.out.println("The no. of "+m.getKey()+" available is "+m.getValue());

	}

  }
}
