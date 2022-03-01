package assistedPracticeProject;

public class Method {

	public static void main(String[] args) {
		MethodsReturn ref =new MethodsReturn();
		System.out.println("Addition of numbers :"+ref.AddsMethod(10, 20));;
		//System.out.println(ref.Operation(1));
		ref.multiple(5, 3);
		ref.multiple(6.5f,2, 4);
		ref.multiple(2, 3, 4);
	}
}

//creating another class
class MethodsReturn{
	public int AddsMethod(int n1,int n2) { // method demo
		return n1+n2;
	}
	// Call Method 
	int val = 100;
	public int Operation(int val) {
		val =val*10;
		return val;
	}
	// Method Overloading
	public void multiple(int n1,int n2) {
		System.out.println("Division of two numbers :"+(n1/n2));
	}
	public void multiple(int n1,int n2,int n3) {
		System.out.println("Multiple of three numbers :"+(n1*n2*n3));
	}
	public void multiple(float n1,int n2,int n3) {
		System.out.println("Multiple of three numbers :"+(n1*n2*n3));
	}
}

