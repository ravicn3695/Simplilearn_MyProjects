
package basic;

import org.openqa.selenium.chrome.ChromeDriver;

public class test {

	public static void main(String[] args) {
		String key = ("webdriver.chrome.driver");
		String value = ("./drivers/chromedriver.exe");
		System.setProperty(key, value);		
		ChromeDriver driver = new ChromeDriver();
	}

}