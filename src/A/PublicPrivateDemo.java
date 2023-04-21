package A;
public class PublicPrivateDemo {

	public static void main(String[] args) {
	Calculation cal=new Calculation();
	System.out.println(cal.addition(19,20));
	
	System.out.println(cal.multiply(19,20));
	
	Mathematics mat=new 	Mathematics();
	System.out.println(mat.product(4,20));
	}

}

class Mathematics extends Calculation{
	int product(int first,int second) {
		return multiply(first,second);
	}
}