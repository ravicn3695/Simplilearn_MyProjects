package assistedPracticeProject;

public class ThreadClass extends Thread {

	public static void main(String[] args) {
		ThreadClass tc = new ThreadClass();
		tc.start();
	}
	@Override
	public void run() {
		System.out.println("Thread class Creation ");
	}

}

