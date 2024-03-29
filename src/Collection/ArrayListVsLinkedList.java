package Collection;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ArrayListVsLinkedList {

	public static void main(String args[]) {

		List<String> al = new ArrayList<String>();// creating arraylist
		al.add("Ravi");// adding object in arraylist
		al.add("Vijay");
		al.add("Ravi");
		al.add("Ajay");

		List<String> al2 = new LinkedList<String>();// creating linkedlist
		al2.add("James");// adding object in linkedlist
		al2.add("Serena");
		al2.add("Swati");
		al2.add("Junaid");

		System.out.println("arraylist: " + al);
		System.out.println("linkedlist: " + al2);
	}

}

//
//1) ArrayList internally uses a dynamic array to store the elements.	LinkedList internally uses a doubly linked list to store the elements.
//2) Manipulation with ArrayList is slow because it internally uses an array. If any element is removed from the array, all the other elements are shifted in memory.	Manipulation with LinkedList is faster than ArrayList because it uses a doubly linked list, so no bit shifting is required in memory.
//3) An ArrayList class can act as a list only because it implements List only.	LinkedList class can act as a list and queue both because it implements List and Deque interfaces.
//4) ArrayList is better for storing and accessing data.	LinkedList is better for manipulating data.
//5) The memory location for the elements of an ArrayList is contiguous.	The location for the elements of a linked list is not contagious.
//6) Generally, when an ArrayList is initialized, a default capacity of 10 is assigned to the ArrayList.	There is no case of default capacity in a LinkedList. In LinkedList, an empty list is created when a LinkedList is initialized.
//7) To be precise, an ArrayList is a resizable array.	LinkedList implements the doubly linked list of the list interface.
