package String;

public class StringBufferVSStringBuilder {
	
	
	StringBuffer was the only choice for String manipulation until Java 1.4.
	But, it has one disadvantage that all of its public methods are synchronized. StringBuffer provides Thread safety but at a performance cost.
	In most of the scenarios, we don’t use String in a multithreaded environment. So Java 1.5 introduced a new class StringBuilder, which is similar to StringBuffer except for thread-safety and synchronization. 
	StringBuffer has some extra methods such as substring, length, capacity, trimToSize, etc. 
	However, these are not required since you have all these present in String too. 
	That’s why these methods were never implemented in the StringBuilder class. 
	StringBuffer was introduced in Java 1.0 whereas StringBuilder class was introduced in Java 1.5 after looking at shortcomings of StringBuffer. 
	If you are in a single-threaded environment or don’t care about thread safety, you should use StringBuilder.
	Otherwise, use StringBuffer for thread-safe operations.

}
