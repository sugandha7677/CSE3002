
public class Finally_Exception {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		try {
		f();
		System.out.println("Program ends");
//		}
		
//		finally {
//			System.out.println("I will be displayed anyhow");
//		}
	}
	
	static void f() {
		try {
		throw new ArithmeticException("An arithmetic exception");
		}
		
		finally {
			System.out.println("I will be displayed anyhow");
		}
	}

}
