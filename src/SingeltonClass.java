
public class SingeltonClass {

	public static void main(String[] args) {
		
		          //Course c = new Course("Java Programming");
		          Course c;
		          c = Course.getCourse("Java Programming");
		          System.out.println(c.getName());
		          c = Course.getCourse("C Programming" );
		          System.out.println(c.getName());
		      
		


	}

}

class Course
{
	String name;
	private static int count = 0;
	private static Course c ;
	
	private Course(String s) 	
        {
		name = s;
		count++;
	}
	
	public static Course getCourse(String s) 	
        {
		if(count==0)
		       c = new Course(s);
		return c;
	}
	public String getName() 	
        {
		return name;
	}
}

