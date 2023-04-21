
public class MethodOverride {

	public static void main(String[] args) {
		
       A aobj=new A();
   //    aobj.f();  // complile time polymorphism or early binding
 
       // whem we dont define f()in B
       B bobj=new B(); // TYPE-casting(high to low)
       bobj.f();
 
       // overrridng
	}

}



class A{
//	void f() {
//		System.out.println("I am from Super class");
//	}
}

class B extends A{
	
//	Override
	void f() {
		System.out.println("I am from derived class");
	}
	
}