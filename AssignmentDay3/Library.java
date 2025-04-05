package Assignment4;

public class Library {


	public String addBook(String bookTitle) {

		System.out.println("Book added successfully" +bookTitle);
		return bookTitle;
	}

	public void issueBook() {
		System.out.println("Book issued successfully" );

	}

	public static void main(String[] args) {
		Library bookTitle=new Library();
		bookTitle.addBook("Ikigai");

		Library issue=new Library();
		issue.issueBook();

	}

}
