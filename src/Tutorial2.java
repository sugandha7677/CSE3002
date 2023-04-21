
public class Tutorial2 {

	public static void main(String[] args) {
		   Book1 b=new Book1("R.S Aggrawal","Mathematics",1245,true);
		   System.out.println("----1------");
		   System.out.println("BookAuthor : "+b.getAuthor());
		   System.out.println("BookTitle : "+b.getTitle());
		   System.out.println();
		   
		   System.out.println("---2----");
		   b.printAuthor();
		   b.printTitle();
		   System.out.println();

		   System.out.println("---3----");
		   System.out.println("Total Pages : "+b.getPages());
		   System.out.println();

		   
		   System.out.println("----5-----");
		   b.printDetails();
		   System.out.println();
		   
		   System.out.println("----6----");
		   System.out.println("Reference Number :"+b.getRefNumber());
		   System.out.println();
		   
		   b.setRefNumber("x5");
		   System.out.println("Reference Number :"+b.getRefNumber());
		   System.out.println();

		   System.out.println("-----9----");

	}

}

 class Book1
{
// The fields.
private String author;
private String title;
private int pages;
private String refNumber;
private int borrowed;
private boolean courseText;
/**
* Set the author and title fields when this object
* is constructed.
*/
 Book1(String bookAuthor, String bookTitle,int totalpages,boolean p)
{
author = bookAuthor;
title = bookTitle;
pages=totalpages;
refNumber="";
borrowed=0;
courseText=p;
}
// Add the methods here..

//1
String getAuthor() {
	return author;
}

String getTitle() {
	return title;
}

int getPages() {
	return pages;
}

void printAuthor() {
	System.out.println(author);
}

void printTitle() {
	System.out.println(title);
}

void printDetails() {
	System.out.println("Author Name : "+author+"\n"+ "Book Title : "+title+"\n"+
"Total Pages : "+pages);
	
	if (refNumber.length() >0) {
		System.out.println("REFERENCE NUMBER : "+refNumber);
	}
	else {
		System.out.println("Reference Number : zzz");
	}
	
	System.out.println("No. of times borrowed : "+borrowed);
}

public void setRefNumber(String ref) {
	
	if(ref.length()>=3) {
	refNumber=ref;
	}
	else {
			System.out.println("<<<ERROR>>>");
			refNumber=this.refNumber;
	}
}

String getRefNumber() {
	return refNumber;
}

void setBorrow() {
	borrowed++;
}

int getBorrow() {
	return borrowed;
}

boolean isCourseText() {
	return courseText;
}

}
