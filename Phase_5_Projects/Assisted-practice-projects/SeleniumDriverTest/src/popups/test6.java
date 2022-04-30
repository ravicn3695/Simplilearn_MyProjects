package popups;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class test6 {
	static {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");
}

	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.naukri.com/");
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		
		String parent = driver.getWindowHandle();
		System.out.println(parent);
		
		Set<String> Allid = driver.getWindowHandles();
	    System.out.println(Allid);
	    
	    int count = Allid.size();
	    System.out.println(count);
	    
	    String ExpectedTitle = "Tech Mahindra";
	    
	    for (String b : Allid) {
	    	driver.switchTo().window(b);
	    	String ActualTitle = driver.getTitle();
	    	if(ActualTitle.equals(ExpectedTitle)) {
	    	Thread.sleep(2000);
	    	driver.close();
	    	}
	    }
	}

}
