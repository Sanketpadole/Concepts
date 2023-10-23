package Constructor;

public class Test {
	int a=10;
	String b="sanket";
	Test(){
		System.out.println("Default");
	}
	Test(int a){
		System.out.println("one arg");
	}
	Test(int a,int b){
		System.out.println("two arg");
	}
	Test(int a,int b,String c){
		System.out.println("three arg");
	}
	public static void main(String[] args) {
		Test t=new Test(7,9);
		Test t1=new Test(3,4,"sanket");
	}
	

}







//public class sanket{
//	int a=10;
//	String b="sanket";
//	sanket(){
//		System.out.println("default");
//	}
//	sanket(int a,int b){
//		System.out.println("two arg");
//	}
//	sanket(int a,String b){
//		System.out.println("two asrg");
//		
//	}
//	public static void main(String[] args) {
//		sanket s=new sanket(5,"sank");
//		
//	}
//}


//
//if there are miultiple constructors in the class with same or different datatypes then programmer can call any constructor according to his requirement by calling the object of that class and initializing it


//
//
//constructor overloading enables the creation of the object of a specific class in a several ways,programmer can use the data according to requirement......and object can be initialize with different datatypes


