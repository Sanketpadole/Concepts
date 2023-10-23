package Program;

public class SwitchCase3 {

	public static void main(String[] args) {

	        /*
	         * Switch statement starts here. Added 10 cases and
	         * one default statement. Execution will flow through
	         * each of these cases case 0 to case 4 and case 5 to
	         * case 9 until it finds a break statement.
	         */

	        for(int i=0; i&lt;=10; i++) {
	            switch(i){
	            case 0:
	            case 1:
	            case 2:
	            case 3:
	            case 4:
	                System.out.println("i value is less than 5");
	                break;
	            case 5:
	            case 6:
	            case 7:
	            case 8:
	            case 9:
	                System.out.println("i value is less than 10");
	                break;

	            default:
	                System.out.println("Default statement");

	            }

	        }
	    }

}
