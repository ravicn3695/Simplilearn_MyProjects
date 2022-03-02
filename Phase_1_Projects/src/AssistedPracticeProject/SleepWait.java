package assistedPracticeProject;

public class SleepWait {

	
		public static final Object LOCK = new Object();
	
	public static void main(String[] args) throws InterruptedException {

			
		System.out.println("Welcome to main");
		
			Thread.sleep(2000);
			
			System.out.println(Thread.currentThread().getName()+ " woken after 2 secs");
	
	
			synchronized (LOCK) {
				
				
				LOCK.wait(3000);
				
				System.out.println("Lock of "+LOCK+" is release after 3 secs");
				
				
			}
	
	
	}

}
