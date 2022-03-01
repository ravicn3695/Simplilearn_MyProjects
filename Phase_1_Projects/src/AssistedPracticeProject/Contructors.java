package assistedPracticeProject;

public class Contructors {

	public static void main(String[] args) {
	new constructor();
	new constructor("Ravi");
	new constructor("Chandra",'A');
	new constructor("Ram",'B',120);

	}

}

class constructor{
	public constructor() {   //Zero constructor
		System.out.println("Display constructor\n");
	}
	public constructor(String name) {  //Parameterized constructor
		System.out.println("User name :"+name);
	}
	
	// constructor Overloaded 
	public constructor(String name,char section) {       
		System.out.println("1st Employee name :"+name+"\nSection :"+section);
	}
	public constructor(String name,char section,int id) {
		System.out.println("2nd Employee name :"+name+"\nSection :"+section+"\nEmployee ID :"+id);
	}
}
