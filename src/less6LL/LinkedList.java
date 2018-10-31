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
		if (index > size()) {
			System.out.print("add Индекс превышает размер списка! ");
			push(value);
		}
		else if (isEmpty()) {
			System.out.print("add Список пуст");
			push(value);
		}
		else {
		//добавление по индексу
			(get(index)).setValue(value);
			System.out.println("add Добавлен элемент по индексу");
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
		if (isEmpty()) {
			System.out.println("unShift Список пуст! Нет элементов для извлечения");
			return;
		}
		if (size() == 1) {
			head = null;
			System.out.println("unShift Извлечен последний элемент. Список пуст!");
			return;
		}
		head = get(2);
		System.out.println("unShift Извлечен первый элемент");	

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
	public Node get(int index) {
		// TODO Auto-generated method stub
		if ((size() == 0)|(index > size())) 
				return (null);
			//System.out.println("get Список пуст! Нет элементов для получения по индексу");
	//	else if (index > size())
			//System.out.println("get Индекс превышает размер списка! Нет элементов для получения по индексу");
		Node n = head;
		for (int i = 1; i < index; i++) {
			n = n.next;
		}
			return n;		
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
			Node newHead = new Node(value);
			newHead.next = head;
			head = newHead;
			System.out.println("shift Добавлен элемент в начало списка");
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

	public void printList() {
		if (isEmpty())
			System.out.println("Список пуст");
		int i = 1;
		while (i != size() + 1) {
			System.out.println("Элемент по индексу " + i + " " + get(i).value);
			i++;
		}
		
	}

}
