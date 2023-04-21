
public class EntendingInterfaces2 {

	public static void main(String[] args) {
		Email e=new Email();
		e.print();
		Circular c=new Circular();
		c.print();
		Homework h=new Homework();
		h.print();

	}

}

//interface Printer{
//	void print();
//}
//
//class Email implements Printer{
//	public void print() {
//		System.out.println("I am printing");
//	}
//}
//
//class Circular implements Printer{
//	public void print() {
//		System.out.println("I am printing");
//	}
//}
//
//class Homework implements Printer{
//	public void print() {
//		System.out.println("I am printing");
//	}
//}

interface Printer{
	default void print() {
		System.out.println("I am printing");
	}
}

class Email implements Printer{
	
}

class Circular implements Printer{
	
}

class Homework implements Printer{
	public void print() {
		System.out.println("I am printing the homework");
	}
}