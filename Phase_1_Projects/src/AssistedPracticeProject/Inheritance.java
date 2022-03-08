package assistedPracticeProject;




class Car  
{ 
	
    public int gear; 
    public int speed; 
    public Car(int gear, int speed) 
    { 
        this.gear = gear; 
        this.speed = speed; 
    } 
    public void applyBrake(int decrement) 
    { 
        speed -= decrement; 
    } 
    public void speedUp(int increment) 
    { 
        speed += increment; 
    }  
    public String toString()  
    { 
        return("No. of gears are, " + gear +" Speed gears\n" + "speed of Car is " + speed+" Km/hr"); 
    }  
} 

class BMW extends Car 
{ 
    public int price; 
    public BMW(int gear,int speed,int cost) 
    {  
        super(gear, speed); 
        price = cost; 
    }  
    public void cost(int newValue) 
    { 
        price = newValue; 
    } 
    @Override
    public String toString() 
    { 
        return (super.toString()+ 
                "\nCost of the Car is "+price+"Lakhs"); 
    } 
}

public class Inheritance {
	  public static void main(String args[])  
	    { 
		  System.out.println("\tBMW CAR DETAILS\n");
	        BMW mb = new BMW(8, 200,50); 
	        System.out.println(mb.toString());
	    } 

}
