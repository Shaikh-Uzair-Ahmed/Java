package Experiment_3;

import java.util.Scanner;

class Book {
    private String name;
    private String author;
    private double price;
    private int numPages;

    // Constructor
    Book(String name, String author, double price, int numPages) {
        this.name = name;
        this.author = author;
        this.price = price;
        this.numPages = numPages;
    }

    // Method to set details of multiple books
    static void setd(Book[] books) {
        Scanner sx = new Scanner(System.in);
        int n = books.length;
        for (int i = 0; i < n; i++) {
            System.out.print("Enter name of book " + (i + 1) + ": ");
            String name = sx.nextLine();
            System.out.print("Enter author of book " + (i + 1) + ": ");
            String author = sx.nextLine();
            System.out.print("Enter price of book " + (i + 1) + ": ");
            double price = sx.nextDouble();
            System.out.print("Enter number of pages of book " + (i + 1) + ": ");
            int numPages = sx.nextInt();
            sx.nextLine(); // Consume newline
            books[i] = new Book(name, author, price, numPages);
        }
    }

    // Method to get details of the book
    String getd() {
        return "Name: " + name + ", Author: " + author + ", Price: " + price + ", Pages: " + numPages;
    }

    // Override toString method
    public String toString() {
        return getd();
    }
}

class BookManager {
    public static void main(String[] args) {
        Scanner sx = new Scanner(System.in);
        System.out.print("Enter number of books: ");
        int n = sx.nextInt();
        sx.nextLine(); // Consume newline
        Book[] books = new Book[n]; 

        // Directly call the static method to set book details
        Book.setd(books); // Populate the array with book details

        System.out.println("\nBook Details:");
        for (Book b : books) {
            System.out.println(b);
        }

        sx.close(); // Close the scanner
    }
}
