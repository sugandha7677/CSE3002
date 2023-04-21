
public class EncaptulationExample {

	public static void main(String[] args) {
	  box myfriend=new box("sunil",23);
	  myfriend.print();
	  // violating the data hiding features means we dont need to modify
	//  myfriend.name="Raghu";
	   myfriend.setName("Raghu");
	   myfriend.setAge(myfriend.getAge()*100);
myfriend.print();
	}

}
