package less4_2;


public class List {

	private Element head;
	
	private Element last () {
		Element last = head;
		while (last.getNextEl() != null)
			last = last.getNextEl();
		return last;
	}
	
	public void addEl (int el) {
		if (head == null) {
			head = new Element (el);
			return;
		}
		last().nextEl = new Element (el);	
	}
	
	public void delEl (int el) {
		if (head == null) 
			System.out.println("Список пуст");
		else	{
			Element el1 = head;
			//if ((el1.valueEl == el) and (el1.nextEl.isNull))
			while (el1 != null) {
				if (el1.nextEl.getValueEl() == el) {
					el1.nextEl = el1.nextEl.nextEl;
				}
				el1 = el1.nextEl;
			}
		}
	}

	public void printList() {
		Element el = head;
		while (el != null) {
			System.out.print(el.getValueEl() + " -> ");
			el = el.nextEl;
		}
		System.out.println ("null");	
	}
	
	
	
}
