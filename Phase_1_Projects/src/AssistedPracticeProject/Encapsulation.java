package assistedPracticeProject;

class CollageDetails{
	private int strength;
	private String collagename;
	//getters
	public int getnumber() {
		return strength;
	}
	
	public String getName() {
		return collagename;
	}
	
	//setters
	public void setnumber(int number) {
		this.strength = number;
	}
	public void setName(String name) {
		this.collagename = name;
	}
	
}

public class Encapsulation {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CollageDetails stud=new CollageDetails();
		stud.setnumber(2500);
		stud.setName("CBIT,Kolar");
		System.out.println("Strength="+stud.getnumber()+" Students");
		System.out.println("CollageName="+stud.getName());
	}

}
