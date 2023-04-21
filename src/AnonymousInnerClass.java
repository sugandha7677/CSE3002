
public class AnonymousInnerClass {

	public static void main(String[] args) {

		Sample s=new Sample();
		int ans=s.calculate(10);
		System.out.println(ans);
		
		Sample special =new Sample() {
		
			public int calculate(int y) {
				return y+y;
			}
			
		};
		ans=special.calculate(10);  // if want this to be 20 define inner class
		System.out.println(ans);

		Maths m=new Maths() {
			public int calculate(int y) {
				return y-3;
			}
		};
		System.out.println(m.calculate(15));
	}

}
interface Maths{ // functional Interface
	int calculate(int x);
}

class Sample implements Maths{
	
	public int calculate(int y) {
		
		return y*y;
	}
}