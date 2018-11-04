package less4_3;

public class Less4_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Book book1 = new Book ("Книга1", "Автор1");
		Book book2 = new Book ("Книга2", "Автор2");	
		Book book3 = new Book ("Книга3", "Автор3");	
		Library lib = new Library (15);
		lib.put(book1, 10);
	//	lib.print();
		lib.put(book2, 10);
		lib.print();
		System.out.println("Свободно места под кол-во книг: " + lib.getFree());
		System.out.println("Кол-во книг book1 " + lib.getBook(book1));
		lib.get(book1, 15);
		lib.get(book1, 7);
		lib.put(book3, 1);
		System.out.println("Свободно места под кол-во книг: " + lib.getFree());
		lib.print();
	}

}
