package finalProject.Assesment;


public class VirtualKeyInstaller {

	public static void main(String[] args) {
		FileOperations.createFolderIfFolderNotAvailable("proj");
		Menu.printWelcomeScreen(" Virtual key ", "**********");
		Options.welcomeInput();
	}
	}
