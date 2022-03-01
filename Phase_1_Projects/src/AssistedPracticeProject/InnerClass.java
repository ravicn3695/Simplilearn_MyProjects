package assistedPracticeProject;

public class InnerClass {

	public static void main(String[] args) {
		Other other =new Other();
		other.dowork(new some() {
			@Override
			public void work() {
				System.out.println("Inner class");
			}
		});

	}

}
interface some{   //interface method 
	void work();
}
class Other {
	void dowork(some ref) {
		ref.work();
	}
}

