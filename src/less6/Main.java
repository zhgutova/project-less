package less6;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LinkedList list = new LinkedList();
		
		Object data = new Object();
		String data1 = new String();
		
		list.push(data1);
		list.push(data);
		
		list.get(5);
		System.out.println("Размер списка = " + list.size());
		list.pop();
		System.out.println("Размер списка = " + list.size());
		list.pop();
		System.out.println("Размер списка = " + list.size());
		list.pop();
		list.get(5);
		list.shift(data1);
		System.out.println("Размер списка = " + list.size());
		list.unShift();
		System.out.println("Размер списка = " + list.size());



	}

}
