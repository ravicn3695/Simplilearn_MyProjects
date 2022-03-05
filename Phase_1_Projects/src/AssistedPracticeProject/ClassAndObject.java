package assistedPracticeProject;

public class ClassAndObject {


    String breed; 
    int age; 
    String color;
	private String name; 
    public ClassAndObject (String name, String breed, int age, String color) {
		// TODO Auto-generated constructor stub
    	 this.name = name; 
         this.breed = breed; 
         this.age = age; 
         this.color = color;
	} 
    public String getName() 
    { 
        return name; 
    } 
    public String getBreed() 
    { 
        return breed; 
    } 
    public int getAge() 
    { 
        return age; 
    } 
    public String getColor() 
    { 
        return color; 
    } 
    @Override
    public String toString() 
    { 
        return("Hi my name is "+ this.getName()+ ".\nMy breed: "+ this.getBreed()+"\nage: "+ this.getAge()+", and \nColor: " + this.getColor() + "."); 
    } 
    public static void main(String[] args) 
    { 
    	ClassAndObject scott = new ClassAndObject("Ravichandra N","Papillon",10,"white");
        System.out.println(scott.toString()); 
    } 

}


/*
//Another object demo program
public class ClassAndObject extends Object {

	public ClassAndObject() {
		
		System.out.println("Demo object created...");
		
	}
	
	public static void main(String[] args) {

		
		ClassAndObject	demo = new  ClassAndObject();
				  
			String str = new String("Ravichandra");
			
			int  ID = 10;
			
			System.out.println(ID); //10
			
			
			System.out.println(demo); //Hash code

		
			System.out.println(str.toString());
			
	}

}*/
