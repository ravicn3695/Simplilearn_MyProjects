package PracticeProject;

public class AccessModifier {
	private static void access() {
		System.out.println("Private Modifer\n");
	}

	public static void main(String[] args) {
		access();
		Modifiers m = new Modifiers();
		m.access1();
		m.access2();
		m.access3();
	}

}
class Modifiers{
	public void access1() {
		System.out.println("public Modifer\n");
	}
	void access2() {
		System.out.println("PKG-Level modifire\n");
	}
	protected void access3() {
		System.out.println("protected modifire\n");
	}
}

