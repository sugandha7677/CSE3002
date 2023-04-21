
public class LambdaExpressions {

	public static void main(String[] args) {
	
//		 Multiplication m=new Multiplication();
//		 
//		int x=m.calculate(20);
//		System.out.println(x);
//		
//		// here we are modifying def. of classes
////		
////		Multiplication m2= new Multiplication() //or Maths1 m=new Maths1();
////		{
////			//anonymous inner class
////			public int calculate(int a)
////			{
////				System.out.println(a);
////				return a*a;
////			}
////		};
////		System.out.println(m2.calculate(20));
//		
//		//lambda exp.for anonymous inner class
//		Maths1 m3= (int a) -> {
//				         System.out.println(a);
//				         return a*a;
//			             };
//		System.out.println(m3.calculate(5));
		
		
		//second ex.
//		Testtable a= (int p,int q) ->{
//			if(p>q) {
//				return true;
//			}
//			else {
//				return false;
//			}
//		};
//		System.out.println(a.test(10,15));
		
		
		//3rd eg  using object
		Student s1=new Student("siva" ,56);
		Student s2=new Student("hemanth" ,75);
				
		Testtable bestStudent =(s1 ,s2) ->
		                   {
			                  Student x=(Student)s1;
			                  Student y=(Student)s2
			                		  ((	Student)s1).getTotalMarks() >((Student)s2).getTotalMarks();
		                  }
		
	}

}

//interface Maths1
//{
//	int calculate(int x);
//}
//
//class Multiplication implements Maths1
//{
//	public int calculate(int a)
//	{
//		return a*a;
//	}
//}


interface Testtable
{
//	boolean test(int x,int y);
	
	boolean test(Object x,Object y);
}

class Student
{
	String name;
	int totalMarks;
	Student(String n ,int m)
	{
		name=n;
		totalMarks=m;
	}
	String getName() {
		return name;
	}
	int getTotalMarks()
	{
		return totalMarks;
	}
}
