package eBookStore;

import java.util.*;

public class Main {

	public static void main(String[] args) {
		choice();
	}

	public static void choice() {

		System.out.println(
				"Would you like to \n1. Enter a new book \n2. Update and existing book \n3. Delete an existing book \n4. Search for a book or author \n0. Exit this program");

		Scanner Choice = new Scanner(System.in);
		int User = Choice.nextInt();

		do {

			if (User == 1) {
				Book.AddBook();
				break;
			}

			else if (User == 2) {
				Book.updateBook();
				break;
			}

			else if (User == 3) {
				Book.deleteBook();
				break;
			}

			else if (User == 4) {
				Book.searchBook();
				break;

			} else {
				break;
			}

		} while (User != 0);

		Choice.close();
	}
}
