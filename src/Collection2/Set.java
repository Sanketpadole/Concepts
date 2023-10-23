package Collection2;

import java.util.HashSet;

public class Set {

	public static void main(String[] args) {
		Set s = new HashSet();
		s.add(100);
		s.add(200);
		s.add(400);
		s.add(400);
		System.out.println(s);
	}

}
//
//[400, 100, 200]...duplicates not allowed in set..set interface extends the collection interface...set is use for mathematical calculation like intersection,Union and difference
//Suppose we hv 2 sets...[22,3,4,56,7] and [47,7,8,,0] we can perform math operations...addAll() for union,retainall() for intersection,removeAll()..differrence

//public static void main(String[] args) {
//	Set s = new HashSet();
//	s.add(100);
//	s.add(200);
//	s.add(300);
//	s.add(400);
//	System.out.println(s);
//}

//[400, 100, 200, 300]...set in unOrdered collection

//public static void main(String[] args) {
//	Set s=new HashSet();
//	s.add(100);
//	s.add(200);
//	s.add(300);
//	s.add(400);
//	s.add(300);
//	s.add(null);
//	s.add(null);
//	System.out.println(s);
//}

//[400, null, 100, 200, 300]...we can store only one null value in set
