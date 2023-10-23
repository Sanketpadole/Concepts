package Collection1;

import java.util.ArrayList;
import java.util.List;

public class ListIterator {

	public static void main(String[] args) {
		List l = new ArrayList();
		l.add(10);
		l.add("deepak");
		l.add("rahul");
		java.util.ListIterator li = l.listIterator();
		while (li.hasNext()) {
			System.out.println(li.next());
		}
	}

}
