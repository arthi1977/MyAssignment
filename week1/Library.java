package home.assignment.week1;

public class Library {

	public static void main(String[] args) {

		Library l = new Library();

		l.addBook("Selenium");
		l.addBook("Java");
		l.issueBook(55.55f);
	}

	public String addBook(String bookTitle) {
		System.out.println("Book added sucessfully");
		return bookTitle;
	}

	public float issueBook(float bookId) {
		System.out.println("Book issued successfully");
		return bookId;
	}

}
