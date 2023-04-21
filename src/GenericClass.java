
public class GenericClass {

	public static void main(String[] args) {
		//Sample c=new Sample(10); //this wont work b/c class is not of int type
		
		Sample1<Integer> c=new Sample1<>(10);
		// ignoring data types on right coz compiler will understand it itself
        System.out.println(c.getA());
	
			Sample1<String >s=new Sample1<>("hi");
			System.out.println(s.getA());
			
			Sample1<Double>d;
			d=new Sample1<>(.35);
	}

}

//class Sample
//{
//	int a;
//	Sample(int a)
//	{
//		this.a=a;
//	}
//	int getA()
//	{
//		return a;
//	}
//	void setA(int a)
//	{
//		this.a=a;
//	}
//}
//
//class FloatSample
//{
//	float a;
//	FloatSample(float a)
//	{
//		this.a=a;
//	}
//	float getA()
//	{
//		return a;
//	}
//	void setA(int a)
//	{
//		this.a=a;
//	}
//}

//instead type generics

class Sample1<T>
{
	T a;
	Sample1(T a)
	{
		this.a=a;
	}
	T getA()
	{
		return a;
	}
	void setA(T a)
	{
		this.a=a;
	}
}