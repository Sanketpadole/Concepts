package Generics;

import java.util.ArrayList;
import java.util.List;

public class withoutGenerics {
	public static void main(String[] args) {

		List list = new ArrayList();
		list.add(10);
		list.add("10");
		// With Generics, it is required to specify the type of object we need to store.
		List<Integer> list = new ArrayList<Integer>();
		list.add(10);
		list.add("10");// compile-time error
	}

}
