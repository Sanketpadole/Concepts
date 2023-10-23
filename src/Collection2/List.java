package Collection2;

import java.util.ArrayList;

public class List {

	public static void main(String[] args) {
		List l = new ArrayList();
		l.add(0, 10);
		l.add(1, 20);
		l.add(2, 40);
		l.add(40);
		System.out.println(l);
	}

}

//[10, 20, 30, 40]......list is ordered and strored the data indexwise

//first diff bet list and set and fourth diff

//public static void main(String[] args) {
//	List l = new ArrayList();
//	l.add(0, 10);
//	l.add(1, 20);
//	l.add(2, 30);
//	l.add(40);
//	System.out.println(l);
//}

//[10, 20, 40, 40]....list allows duplicate..and print duplicate values as well as null values......the methods of the list are based on the index,so all the operations like insert,update,delete and search is based on the index
//arraylist,linkedlist,stack and vector are the implementation class available in the list interface

//public static void main(String[] args) {
//	List l=new ArrayList();
//	l.add(0,10);
//	l.add(1,20);
//	l.add(2,30);
//	l.add(40);
//	l.add(30);
//	l.add(40);
//	l.add(20);
//	l.add(null);
//	l.add(null);
//	System.out.println(l);

//[10, 20, 30, 40, 30, 40, 20, null, null]
//}....we can store null elements in list
