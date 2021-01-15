
public class Book {
	private String bookTitle;
	private String author;
	private String ISBN;
	private int numOfCopies;
	public String getBookTitle() {
		return bookTitle;
	}
	public String getAuthor() {
		return author;
	}
	public void setBookTitle(String bookTitle) {
		this.bookTitle = bookTitle;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public void setISBN(String iSBN) {
		ISBN = iSBN;
	}
	public void setNumOfCopies(int numOfCopies) {
		this.numOfCopies = numOfCopies;
	}
	public String getISBN() {
		return ISBN;
	}
	public int getNumOfCopies() {
		return numOfCopies;
	}
	public Book() {}
	public void display() {
		System.out.println(bookTitle +" - "+ author +" - "+ ISBN +" - "+ numOfCopies);
	}
}