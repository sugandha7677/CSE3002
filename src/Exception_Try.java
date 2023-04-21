
public class Exception_Try {

	public static void main(String[] args) {
		
		int []nums=new int[4];
		
		// unchecked exception
		
		try {
			System.out.println("Before exception is generated");
			nums[8]=10;
			
			System.out.println("nope");
		}
		
		catch(ArrayIndexOutOfBoundsException exc) {
			System.out.println("indexx-out-of-bounds");
		}
		System.out.println("After Catch");
	}

}
