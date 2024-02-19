package Oops_Programs;

public class LibraryItems {
public  String title;
public  String author;
public int uniqeNumber;


public String getTitle() {
	return title;
}


public void setTitle(String title) {
	this.title = title;
}


public String getAuthor() {
	return author;
}


public void setAuthor(String author) {
	this.author = author;
}


public int getUniqeNumber() {
	return uniqeNumber;
}


public void setUniqeNumber(int uniqeNumber) {
	this.uniqeNumber = uniqeNumber;
}


public LibraryItems(String title, String author, int uniqeNumber) {
	super();
	this.title = title;
	this.author = author;
	this.uniqeNumber = uniqeNumber;
}


public void displayInfo() {
	System.out.println("Title   :  "+title);
	System.out.println("Author  :  "+author);
	System.out.println("Uniue No:  "+uniqeNumber);
}
}
