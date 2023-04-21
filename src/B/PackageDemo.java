package B;
import A.Calculation;
public class PackageDemo extends Calculation{

	public static void main(String[] args) {
		
		Calculation cal=new Calculation();
		System.out.println(cal.addition(10,20));
		// for protected 
	//	System.out.println(cal.multiply(4,20));
	//	multiply(5,20);
		PackageDemo pd=new PackageDemo();
		System.out.println(pd.multiply(5, 20));
		
	}

}