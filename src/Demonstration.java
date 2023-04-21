
public class Demonstration {

	public static void main(String[] args) {
		Faculty f= new 	Faculty("gkj","hg0");
		
        System.out.println(f.name);
	}

}

class Person5{
	String name;
	Person5(){
		
	}
	Person5(String name){
		this.name=name;
	}
	void print() {
		System.out.println("Name: "+name);
	}
}

class Faculty extends Person5{
	
	String subject;
	Faculty(String name,String subject){
	//	super(name);
	//	this.subject=subject;
	}
	Faculty(){
		
	}
}