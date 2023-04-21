
public class VarargeDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(average(10,20,30,34));
		System.out.println(average(10,20));
		System.out.println(average(10));
	}

	static double average(int ...val) {
		int sum=0;
		for(int i:val) {
			sum+=i;
		}
		return sum/val.length;
	}
}
