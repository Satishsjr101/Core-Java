// 5. Write a Java program to create a class called "Book" with attributes for title, author, and ISBN, 
// and methods to add and remove books from a collection.

import java.util.Scanner;

class Book {
	private String title, author, ISBN;

	public Book(String title, String author, String ISBN) {
		this.title = title;
		this.author = author;
		this.ISBN = ISBN;
	}

	public void add() {
		System.out.println("Name of title is : " + title);
		System.out.println("Name of author is : " + author);
		System.out.println("ISBN is : " + ISBN);
	}
}

class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the name of title : ");
		String title = sc.nextLine();
		System.out.print("Enter the name of author : ");
		String author = sc.nextLine();
		System.out.print("Enter the ISBN : ");
		String ISBN = sc.nextLine();
		Book obj = new Book(title, author, ISBN);
		obj.add();
		sc.close();
	}
}