package exercises1_book;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Book book = new Book();
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Please enter the title of the book");
		String title = scanner.nextLine();
		System.out.println("Please enter the author name");
		String author = scanner.nextLine();
		System.out.println("Please enter the number of pages");

		int numberOfPages = scanner.nextInt();
		while (numberOfPages <= 0)
		{
			System.out.println("Please enter the number of pages");
			int numberOfPages1 = scanner.nextInt();

		}
		
		System.out.println("The book title is: "+title);
		System.out.println("The book author is: "+author);
		System.out.println("The book has "+numberOfPages+" pages");
		
	}

}
