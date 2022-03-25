import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Demo {
	
	//Attribute
	static ArrayList<Book> books = new ArrayList<Book>();

	public static void main(String[] args) throws IOException {
		
		Scanner input = new Scanner(System.in);
		String userChoice;
		
		try {
			while(true) {
				System.out.println("Do you want to add a book to the collection? Enter 'yes' to continue, or 'done' to exit.");
				userChoice = input.next();
				if(userChoice.equalsIgnoreCase("done")) {
					break;
				} 
				else {
					System.out.println("Enter the author's info.");
					String author = input.nextLine();
					input.nextLine();
					System.out.println("Enter the title.");
					String title = input.nextLine();
					System.out.println("Enter the book's isbn.");
					long isbn = input.nextLong();
					System.out.println("Enter the book's price.");
					double price = input.nextDouble();
					System.out.println("Is the book borrowed? true/false");
					boolean isBorrowed = input.nextBoolean();
					books.add(new Book(title, author, isbn, price, isBorrowed));		
				}
			}	
		} catch(InputMismatchException e) {
			System.out.println("Invalid input. The menu program will end. Goodbye!");
		}
	
		System.out.println("The books in the collection are: " + books);
		FileOutputStream fos = new FileOutputStream(
				new File("C:\\Users\\ShafirFrazier\\OneDrive - Xpanxion\\Documents\\bookcollection.docx"));
		try {
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			oos.writeObject(books);
			System.out.println("The books collection have been added into the file.");
		} catch(IOException e) {
			System.out.println("No objects to write onto the file.");
		}
		
		
		input.close();
	}
}
