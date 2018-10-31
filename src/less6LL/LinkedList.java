package less6LL;

public class LinkedList implements List, Stack, Queue {
	
	private Node head;
	
	private boolean isEmpty() {
		 if (this.head == null)
			 return true;
		 else return false;
	}

	@Override
	public void add (Object value, int index) {
		if (index > size())
			System.out.println("add Индекс превышает размер списка!");
		else {
		//добавление по индексу
		}
	}
	
	private Node last() {
		 Node n = head;
		 while (n.next != null) {
			 n = n.next;
		 }
		 return n;
	}
	
	@Override
	public void unShift() {
		// TODO Auto-generated method stub
		if (isEmpty())
			System.out.println("unShift Список пуст! Нет элементов для извлечения");
		if (size() == 1) {
			head = null;
			System.out.println("unShift Извлечен последний элемент. Список пуст!");
		}
		else {
			//удаление первого элемента с начала списка
		}
	}

	

	@Override
	public void pop() {
		// TODO Auto-generated method stub
		if (isEmpty())
			System.out.println("pop Список пуст! Нет элементов для извлечения");
		if (size() == 1) {
			head = null;
			System.out.println("pop Извлечен последний элемент. Список пуст!");
		}
		if (size() > 1) {
			Node n = head;
			while (n.next != last()) {
				 n = n.next;
			 }
			n.next = null;
			System.out.println("pop Извлечен элемент из конца списка");
			
		}
	}
		
	

	@Override
	public void remove(int index) {
		// TODO Auto-generated method stub
		if (size() == 0)
			System.out.println("remove Список пуст!");
		else if (index > size())
			System.out.println("remove Индекс превышает размер списка!");
		else {
		//удаление элемента по индексу
		}
	}

	@Override
	public void get(int index) {
		// TODO Auto-generated method stub
		if (size() == 0)
			System.out.println("get Список пуст! Нет элементов для получения по индексу");
		else if (index > size())
			System.out.println("get Индекс превышает размер списка! Нет элементов для получения по индексу");
		else {
			//взять по индексу
		}
	}

	@Override
	public int size() {
		// TODO Auto-generated method stub
		int count = 0;
		if (this.isEmpty()) return count;
		else {
			Node n = head;
			while (n != null) {
				 n = n.next;
				 count++;
			 }
			return count;
		}
	}

	@Override
	public void shift(Object value) {
		// TODO Auto-generated method stub
		if (isEmpty()) {
			head = new Node(value);
			System.out.println("shift Добавлен первый элемент в список");
		}
		else {
			//добавление в начало списка
		}
	}

	@Override
	public void push(Object value) {
		// TODO Auto-generated method stub
		if (isEmpty()) {
			head = new Node(value);
			System.out.println("push Добавлен первый элемент в список");
		}
		else {
			Node lastNew = new Node(value);
			last().setNext(lastNew);
			System.out.println("push Добавлен элемент в конец списка");
		}
	}

	

}
