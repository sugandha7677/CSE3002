
public class ExtendingClass {

	public static void main(String[] args) {
		
				Student topper=new Student();
				topper.setSubject("c++");
				topper.setMark(92);
				topper.print();

	}

}

class Student extends box{
		
	private	String subject;
	private int mark;
	
	void setSubject(String subname) {
		subject=subname;
	}
	String getSubject() {
		return subject;
	}
	
	void setMark(int marks) {
		mark=marks;
	}
	
	int getMark() {
		return mark;
	}
    String getGrade() {
		String grade;
		if(mark>90) {
			grade="o grade";
		}
		else if(mark >50 && mark<90) {
			grade ="b grade";
		}
		else
			grade="d grade";
		
		return grade;
	}
}


