
// AnonymousInnerClass 

public class InnerClassDemo {

	public static void main(String[] args) {
		Person1 p=new Person1();
		System.out.println(p);
	//	Person1.Name n=new Person1().new Name("Hari ","kr");
 //or
		Person1.Name n=p.new Name("hari","kr");
		System.out.println(n);
	}

}
class Person1{
	Name name; //it should be other referce/class type
	// define outside
	Person1 (){
		
	}
	public String toString() {
		return "I am a person";
	}
	
	class Name{  //instance member of the person1 class
		String firstName;
		String lastName;
		Name(String f,String l){
			firstName=f;
			lastName=l;
		}
		public String toString() {
			return firstName +" "+ lastName;
		}
}


}