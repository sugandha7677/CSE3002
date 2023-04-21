
public class ExtendingInterfaces {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Test1 t=new Test1();
		t.a();
		t.b();
	}

}


interface A1{
	 void a();
}

interface B1 extends A1{
	void b();
}

class Test1 implements B1{
	public void a() {
		System.out.println("From method a");
	}
	public void b() {
		System.out.println("From method b");
	}
}