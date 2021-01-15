import java.util.Scanner;

public class BookStore {
	private Book book_list[]=new Book[10];
	private int index=0;

	public BookStore() {
		for(int i=0;i<10;i++) {
		this.book_list[i] = new Book();
		
		}
	}
	public void sell(String isbn, int noOfCopies) {
		boolean flag = false;
//		System.out.println("index="+index);
		for (int i = 0; i < index; i++) {
			
			if (book_list[i].getISBN().equals(isbn)) {
				flag = true;
				book_list[i].setNumOfCopies(book_list[i].getNumOfCopies()-noOfCopies);
			}
		}
		if (flag == false) {
			System.out.println("Book with ISBN-" + isbn + " is not available at the bookstore!");
		}

	}
	public void order(String isbn, int noOfCopies) {
		boolean flag = false;
		for (int i = 0; i < index; i++) {
			
			if (book_list[i].getISBN().equals(isbn)) {
				flag = true;
				book_list[i].setNumOfCopies(book_list[i].getNumOfCopies()+noOfCopies);
			}
		}
		if(flag==false) {
			Scanner scanner = new Scanner(System.in);
			System.out.println("Enter Book title");
			String title = scanner.next();
			System.out.println("Enter Book author");
			String author = scanner.next();
			book_list[index].setISBN(isbn);
			book_list[index].setNumOfCopies(noOfCopies);
			book_list[index].setAuthor(author);
			book_list[index].setBookTitle(title);
			index++;
		}
	}
	public void display() {
		System.out.println("Book List");
		if(index==0) System.out.println("Bookstore is empty!!");
		for(int i=0;i<index;i++) {
			book_list[i].display();
		}
		
	}
}
