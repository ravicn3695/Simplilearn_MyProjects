package come.simplilearn;

import java.net.URL;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class GoogleTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		DesiredCapabilities cap= new DesiredCapabilities();
		cap.setBrowserName("chrome");
		
		cap.setPlatform(Platform.WINDOWS);
		
		try {
			//run my test on hub
			URL url= new URL("http://192.168.1.66:4444/wd/hub");
			WebDriver driver=new RemoteWebDriver(url,cap);
			
			driver.get("https://www.google.co.in/");
			System.out.println(driver.getTitle());
			
			if(driver.getTitle().equals("Google"))
				System.out.println("Test Passed");
			else
				System.out.println("Test Failed");
		} catch (Exception e) {
			e.printStackTrace();
		}

	

	}

}
