package Generics;

import java.util.ArrayList;
import java.util.List;

public class Secondpt {

	public static void main(String[] args) {

		List list = new ArrayList();
		list.add("hello");
		String s = (String) list.get(0);// typecasting
		// After Generics, we don't need to typecast the object.
		List<String> list = new ArrayList<String>();
		list.add("hello");
		String s = list.get(0);
	}

}

//before generics we needed to typecast