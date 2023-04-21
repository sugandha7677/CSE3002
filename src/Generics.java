
public class Generics {
         
	public static void main(String[] args) {
		print(100);
	//	print(12,28);
		
		print(.3322); // does not work
		print("String");
		print(new One());
		print(new Two());
	//	print(new One(),new Two());
	}
	
//	static void print(int a)
//	{
//		System.out.println(a);
//	}
//	static void print(double a)
//	{
//		System.out.println(a);
//	}
//	static void print(String a)
//	{
//		System.out.println(a);
//	}
//	static void print(One a)
//	{
//		System.out.println(a);
//	}
	
	// instead of all use generics
	static <T> void print(T a)
	//0r
	//static <T,U> void print(T a,Tb)

	{
		System.out.println(a);
	}
}

class One{
	
	public String toString()
	{
		return "One Object";
	}
}

class Two
{
	public String toString()
	{
		return "Two Object";
	}
}