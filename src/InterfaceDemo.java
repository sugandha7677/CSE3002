
public class InterfaceDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}


// if we want same method in other place then we use interface
interface Runner{
	void run();
	//{
		//System.out.println("Ican run for 10 min");
	//}
}

 interface  Swimmer{
	 void swim();
//	 {
//		 System.out.println("I can swim in a pool");
//	 }
}

//class Boy extends Swimmer{
class Boy implements Swimmer , Runner{
		public void swim() {
			System .out.println("I can swim for 10 min");
		}
		public void run()
		{
			System.out.println("Ican run for 10 min");
		}
}

class Diver implements Swimmer{
	public void swim() {
		System.out.println("Can swim in sea");
	}
	void run() {
		System.out.println("Ican run for 10 min");
	}

}