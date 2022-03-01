package assistedPracticeProject;

public class Strings {
	public static void main(String[] args) {
		//methods of strings
		System.out.println("Methods of Strings");
		
		String s=new String("Hello World");
		System.out.println("String length is:"+s.length());
		
		//substring
		String sub=new String("Welcome");
		System.out.println(sub.substring(2));

		//String Comparison
		String s1="Hello";
		String s2="HelGo";
		System.out.println(s1.compareTo(s2));

		//IsEmpty
		String s4="";
		System.out.println(s4.isEmpty());

		//toLowerCase
		String s5="HeLLo";
		System.out.println(s5.toLowerCase());
		
		//replace
		String s6="Heldo";
		String replace=s6.replace('d', 'l');
		System.out.println(replace);

		//equals
		String x="Welcome to Java";
		String y="Welcome to Java";
		System.out.println(x.equals(y));


	}

}
