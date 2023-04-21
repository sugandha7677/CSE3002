
public class PersonDemo {

	public static void main(String[] args) {
	// box p=new box();  // default constructor to create an object of Person type
 // declare avariable of p1
	 // assign p to p1
//	 box p1;
//	 p1=p;
//     p.name="Hari ";
//     p.age=56;
     //System.out.println(p1.name + ", "+p1.age);
//     p.print();
//     p1.print();  // method call
//     
  box p1=new box();
//     p1.name="Ranjit";
//     p1.age=80;
    p1.print();
	 p1.setName("lul");
	 box p=new box("Chandra",50);
	 p.print();
	 
	 box q=new box("Riya");
	 q.print();
	 q.setAge(20);
	 
	 System.out.println(q.name + " "+ q.age);
	 System.out.println("name of my q is:"+q.getName().toUpperCase()); // name should be accessed outside the class
	
// to check whether two objects are same or not
	 // =>m1
	if(p==q) { 
		System.out.println(p.getName()+"si a good");
	}
	else {
		
	}
	// => this is not written here 
	if(ispAq(p,q)) {
		System.out.println(p.getName()+"si a good");
	}
	
	}
	// without static it will be not called without object
	static boolean  ispAq(box p1,box d1) { // no object needed to call it
		if(p1==d1){
			return true;
		}
		else {
			return false;
		}
	}
}

class box{
	// fields and methods called instance members coz  they can be only for the object
 private String name; // declaration of name property
 private int age;  // byte=age
	
	//how to modify default value
	
	
	void print() { // method implementation or method definition
		//name also as this.name
		System.out.println("Name:"+name+" Age:"+age);
	}
	//compile time polymorphism
	// method overloading
	// here constructor overloading
	box(){
		name="undefined";
		age=-1;
	}
	box(String n,int a){
		name=n;
		age=a;
	}
	box(String name){ // same as field name
		this.name=name;  // called naming conflicts so use this
		age=90;
	}
	
	void setName(String newname) { // setter method for name field
		name=newname;
		
	}
	void setAge(int age) {
		if(age >100) {
			System.out.println("not grester thsn 100");
		}
		else {
		this.age=age;
	}
	}
	// to get the value
	String getName(){
		return name;
	}
	int getAge() {
		return age;
	}
}
 // inheritance

//class Student extends box{
//	String name;
//	int age;
//	String rollno;
//	String schoolName;
