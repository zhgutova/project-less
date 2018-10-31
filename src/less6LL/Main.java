package less6LL;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LinkedList list = new LinkedList();
		
		Object data = new Object();
		String data1 = new String("data1");
		String data2 = new String("data2");
		
		list.printList();
		
		list.push(data1);
		
		list.printList();
		
		list.push(data);
		
		list.printList();
		
		list.get(5);
		System.out.println("Размер списка = " + list.size());
		list.pop();
		System.out.println("Размер списка = " + list.size());
		list.pop();
		System.out.println("Размер списка = " + list.size());
		list.pop();
		list.get(1);
		list.shift(data1);
		System.out.println("Размер списка = " + list.size());
		list.unShift();
		System.out.println("Размер списка = " + list.size());

		list.add(data1, 6);
		list.add(data1, 6);
		list.pop();
		list.get(5);	
		list.printList();
		list.add(data1, 6);
		list.printList();
		list.add(data2, 1);
		list.printList();
		list.shift(data1);
		list.printList();
		
		list.remove(9);
		list.remove(1);
		list.printList();
		System.out.println();
		
		list.unShift();
		list.printList();
		System.out.println("Размер списка = " + list.size());
		list.unShift();
		list.printList();
		list.unShift();
		list.printList();
		System.out.println("Размер списка = " + list.size());
		list.unShift();
		list.printList();

	}

}
