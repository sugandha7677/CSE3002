
public class Book
{
// The fields.
private String author;
private String title;

private int pages;
private String refNumber;

/**
* Set the author and title fields when this object
* is constructed.
*/
public Book(String bookAuthor, String bookTitle ,int bookPage,String refNumber)
{
author = bookAuthor;
title = bookTitle;
pages=bookPage;
refNumber="";
}
// Add the methods here..

public void setRefNumber(String ref) {
	if(ref.length()>=3) {
		refNumber=ref;
	}
	else {
		System.out.println("error");
	}
}

String getAuthor() {
	return author;
}

String getTitle() {
	return title;
}

int getPages() {
	return pages;
}

String getRefNumber() {
	return refNumber;
}

void printAuthor() {
	System.out.println("Author: "+ author);
}

void printTitle() {
	System.out.println("Title: "+ title);
}

void printDetails() {
	System.out.println("Author: "+ author + 
	"  Title: "+ title + "  pages: "+pages);
	
	if(refNumber.length()>0) {
		System.out.println("Refnumber: "+refNumber);
	}
	else {
		System.out.println("zzz");
	}
	
}

public static void main(String[]args) {
	
	Book b=new Book("xyz","Abc",456, "dwasedfh");
//	System.out.println(b.getAuthor());
//	
//	System.out.println(b.getTitle());
	
	b.printTitle();
	b.printAuthor();
	b.printDetails();
//	b.setRefNumber(" ");
//	System.out.println("ref: "+b.getRefNumber());
}
}