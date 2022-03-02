package assistedPracticeProject;

public class Arrays {
	
	public static void main(String[] args) {


		//syn1 
		 			//  0   1   2   3  4
		int   []ar1 = {101,102,103,104,105};
		
		
		/*int[]  a1,a2;
		
		int   arr[],x;*/
		
		System.out.println(ar1.length);
		
		System.out.println(ar1);
		
		System.out.println(ar1[0]);
		
		for (int i = 0; i < ar1.length; i++) {
			
			System.out.println(ar1[i]);
			
		}
		
		//using for each loop
		System.out.println("for each loop");
		
		for (int element : ar1) {  // for each  can be use with arrays , collections
			
			System.out.println(element);
		}
		
		
		
	}

}
