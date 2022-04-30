package findElements;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class test2 {
	static {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");
}

	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.youtube.com/");
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		
		WebElement ele = driver.findElement(By.name("search_query"));
		ele.sendKeys("seleni");
		
		List<WebElement> ele1 = driver.findElements(By.xpath("//li[@class='sbsb_c gsfs']"));
		
	    int count = ele1.size();
	    System.out.println(count);
	    
	    //for(int i=0;i<count;i++) {
	    	//String text = ele1.get(i).getText();
	    	//System.out.println(text);
	    //}
	    //ele1.get(0).click();
	    Thread.sleep(2000);
	    }

}
