
public class LambdaFunctional {

	public static void main(String[] args) {
		 S obj=new S();
		 obj.function();
		 
		 S obj2=new S() {
			 public void function() {
				 System.out.println("Different imp");
			 }
		 };
		 obj2.function();
		 
		 myInterface i=new myInterface() {
			 public void function() {
				 System.out.println("Another imp");
			 }
		 };
		 i.function();
         }

	     myInterface i2=() ->System.out.println("I am from lembda");
         i2.function()
}

interface myInterface{
	void function();
}

class S implements myInterface{
	public void function() {
		System.out.println("I am for function ");
	}
}