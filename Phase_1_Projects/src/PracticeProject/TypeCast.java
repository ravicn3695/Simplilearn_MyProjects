package PracticeProject;

public class TypeCast {

	public static void main(String[] args) {
		System.out.println("Implicit Type Casting");
		
		char a='R';
		System.out.println("Value of a: "+a);
		
		int b=a;
		System.out.println("Value of b: "+b);
		
		float c=a;
		System.out.println("Value of c: "+c);
		
		long d=a;
		System.out.println("Value of d: "+d);
		
		double e=a;
		System.out.println("Value of e: "+e +"\n");
				
		//System.out.println("\n");
		
		System.out.println("Explicit Type Casting");
		
		float x=62.88f;
		int y=(int)x;
		System.out.println("Value of x: "+x);
		System.out.println("Value of y: "+y);

	}

}

