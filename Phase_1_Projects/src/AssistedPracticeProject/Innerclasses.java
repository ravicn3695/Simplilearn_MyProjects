package assistedPracticeProject;

public class Innerclasses {

	 private String msg="Welcome to Java"; 
	 
	 class Inner{  
	  void hello(){
		  System.out.println(msg+", Let us start learning Inner Classes");
		  }  
	  }
	 public static void main(String[] args) {

			Innerclasses obj=new Innerclasses();
			Innerclasses.Inner in=obj.new Inner();  
			in.hello();  
		}
	}

class Innerclasses1 {

private String msg="Inner Classes";

 void display(){  
	 class Inner{  
		 void msg(){
			 System.out.println(msg);
		 }  
  }  
  
  Inner l=new Inner();  
  l.msg();  
 }  

 
public static void main(String[] args) {
	Innerclasses1  ob=new Innerclasses1 ();  
	ob.display();  
	}
}
//anonymous inner class
abstract class AnonymousInnerClass {
	   public abstract void display();
	}


class innerClassAssisted3 {

	public static void main(String[] args) {
	AnonymousInnerClass i = new AnonymousInnerClass() {

	         public void display() {
	            System.out.println("Anonymous Inner Class");
	         }
	      };
	      i.display();
	   }
	}


