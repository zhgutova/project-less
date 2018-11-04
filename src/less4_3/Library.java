package less4_3;

import java.util.Arrays;

public class Library {
	
	private int count;
	private Book[] bookLib;
	
	public Library(int count) {
		this.count = count;
		this.bookLib = new Book[count];
	}
	
	public void put(Book book, int quantity) {
		if (this.getFree() == 0) {
			System.out.println("Нет свободного места");
			return;
		}
		if (quantity > this.getFree())
			System.out.println("Количество книг превышает свободное место, в библиотеку будет помещено книг: " + this.getFree());
		while (quantity > 0 && this.getFree() > 0) {
		for (int i = 0; i < count; i++) {
			if (bookLib[i] == null) {
				bookLib[i] = book;
				quantity--;
				break;
			}
		}
		}
	}
	
	public int getFree() { //вернуть кол-во свободного места под книги
		int count = 0;
		for (int i = 0; i < this.count; i++) {
			if (bookLib[i] != null) {
				count++;
			}	
		}
		return (this.count-count);
	}	
	
	public int getBook(Book book) { //вернуть кол-во книг book
		int count = 0;
		for (int i = 0; i < this.count; i++) {
			if (bookLib[i] == book) {
				count++;
			}	
		}
		return (count);
	}	
	
	public void get(Book book, int quantity) {
		if (quantity > getBook(book)) {
			System.out.println("В наличии книг только: " + getBook(book));
			return;
		}
		while (quantity > 0) {
		for (int i = 0; i < bookLib.length; i++) {
			if (bookLib[i] == book) {
				bookLib[i] = null;
				quantity--;
				break;
			}
		}
	}
	}

	public void print() {
		//return "Library [count=" + count + ", bookLib=" + Arrays.toString(bookLib) + "]";
		for (int i = 0; i < bookLib.length; i++) {
			if (bookLib[i] != null)
				System.out.println(bookLib[i].toString());
		}
	}

}
