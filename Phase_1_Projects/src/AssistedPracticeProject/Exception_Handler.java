package assistedPracticeProject;

class My_Exception extends Exception{
	   String str1;
	   My_Exception(String str2) {
		str1=str2;
	   }
	   public String toString(){ 
		return ("MyException Occurred: "+str1) ;
	   }
	}

public class Exception_Handler {

	public static void main(String[] args) {
		try{
			System.out.println("try block Starting");
			// I'm throwing the custom exception using throw
			throw new My_Exception("My Message");
		}
		catch(My_Exception exp){
			System.out.println("Catch Block") ;
			System.out.println(exp) ;
		}


	}

}
