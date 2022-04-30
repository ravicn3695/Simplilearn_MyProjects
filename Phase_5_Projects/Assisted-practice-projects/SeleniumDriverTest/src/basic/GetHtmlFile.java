package basic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetHtmlFile {
	static {
		System.setProperty("webdriver.chrome.driver", "E:\\Eclips-phase-5\\chromedriver.exe");
		//System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");
	}

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:/C:/Users/Ravi/OneDrive/Desktop/html/new.html");
		//driver.get("./html/body/div[1]/input[1]");

	}

}
