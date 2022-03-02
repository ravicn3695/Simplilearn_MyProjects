package assistedPracticeProject;

public class Throw_keyword {

	void Division() throws ArithmeticException{
		int a=65,b=0,rs;
		rs=a/b;
		System.out.println("\n\tThe result is :"+rs);
	}

	public static void main(String[] args) {
		Throw_keyword T = new Throw_keyword();
		try {
			T.Division();
		} catch (ArithmeticException e) {
			System.out.println("\n\tError :"+e.getMessage());
		}
		System.out.println("\n\tEnd of program.");
		

	}

}
