package assistedPracticeProject;


class Sender {
	public void send(String message) {
		System.out.println("Sending "+message);
		try {
			Thread.sleep(1000);
		} catch (Exception e) {
			System.out.println("thread interrupted.");
		}
		System.out.println("\n"+message+" Sent");
	}
}
class ThreadSend extends Thread
{
	private String message;
	//private Thread t;
	Sender sender;
	ThreadSend(String m,Sender obj){
		message =m;
		sender = obj;
	}
	public void run() {
		synchronized (sender) {
			sender.send(message);
		}
	}
}

public class Thread_Synchronization {

	public static void main(String[] args) {
		Sender snd = new Sender();
		ThreadSend s1 = new ThreadSend("hello", snd);
		ThreadSend s2 = new ThreadSend("Bye", snd);
		s1.start();
		s2.start();
		try {
			s1.join();
			s2.join();
		} catch (Exception e) {
			System.out.println("Interrupted");
		}

	}

}

