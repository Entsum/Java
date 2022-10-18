package Review;

public class Teacher {
	
	String name, lastName;
	int experience;
	String subject;
	double salary;
	
	public static String school;
	
	/* how to create a constructor
	 *  1. constructor name=classname
	 *  2. no return type not even void
	 */

	//using below constructor we initialize instance variables (name, lName)
	public Teacher(String fName, String lName){
		name=fName;
		lastName=lName;
	}

    public static void work() {
    }

    /*
	 * when you create a constructor 
	 * COMPILEer is NOT going to create a default constructor for you
	 */
	
	void print() {
		System.out.println(name+" "+lastName);
	}

	public void teach() {
	}
}