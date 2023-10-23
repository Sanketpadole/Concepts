package Collection1;

import java.util.ArrayList;
import java.util.ListIterator;

public class IteratorVsListIterator {

	public static void main(String[] args) {
		java.util.List l = new ArrayList();
		l.add(10);
		l.add("deepak");
		l.add("rahul");
		ListIterator li = l.listIterator();
		while (li.hasNext()) {
			System.out.println(li.next());
		}
		System.out.println("---------------------");
		while (li.hasPrevious()) {
			System.out.println(li.previous());
		}
	}

}
