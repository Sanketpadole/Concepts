package Collection3;

import java.util.ArrayList;
import java.util.Iterator;

public class List1 {
	public static void main(String[] args) {
		java.util.List l = new ArrayList();
		l.add(0, 10);
		l.add(1, 20);
		l.add(30);
		l.add(40);

		Iterator itr = l.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
	}

}
