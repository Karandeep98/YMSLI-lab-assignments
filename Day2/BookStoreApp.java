import java.util.Scanner;

public class BookStoreApp {
	public static void main(String[] args) {
		BookStore bookStore = new BookStore();
		while (true) {
			System.out.println("Enter 1 to display the Books\n" + "Enter 2 to order new books\r\n"
					+ "Enter 3 to sell books\r\n" + "Enter 0 to exit the system");

			Scanner scanner = new Scanner(System.in);
			int choice = scanner.nextInt();
			

			switch (choice) {
			case 1:
				bookStore.display();
				break;
			case 2:
				System.out.println("Enter Book ISBN");
				String isbn = scanner.next();
				System.out.println("Enter number of copies");
				int no_of_copies = scanner.nextInt();
				bookStore.order(isbn, no_of_copies);
				break;
			case 3:
				System.out.println("Enter Book ISBN");
				isbn = scanner.next();
				System.out.println("Enter number of copies");
				no_of_copies = scanner.nextInt();
				bookStore.sell(isbn, no_of_copies);
				break;
			case 0:
				System.exit(0);
				break;
			default:
				System.out.println("Invalid choice!!");
			}
		}
	}
}
