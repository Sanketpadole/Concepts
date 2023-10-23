package JavaTinterviewPoint;

import java.util.ArrayList;
import java.util.List;

public class MergeTwoListusingAddAll {

	public static void main(String[] args) {
		List even = new ArrayList<>();

		even.add(2);
		even.add(4);
		even.add(6);
		System.out.println(even);

		List odd = new ArrayList<>();
		odd.add(3);
		odd.add(5);
		odd.add(7);
		System.out.println(odd);

		List add = new ArrayList<>();
		add.addAll(odd);
		add.addAll(even);

		System.out.println(add);

	}
}
