package takesScreenshot;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class test1 {
	static {
		System.setProperty("webdriver.chrome.driver", "E:\\\\Eclips-phase-5\\\\chromedriver.exe");
		//System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");
}

	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws IOException, InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.myntra.com/");
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		
		TakesScreenshot t = (TakesScreenshot) driver; //taking screenshot
		File src = t.getScreenshotAs(OutputType.FILE);// get screenshot as file format and written output type as file, it will stored in RAM
		File dest = new File("./photo/myntra.png");//to store the photo give location and with .extension
		
		FileUtils.copyFile(src, dest);//copy the file from source to destination using FileUtils.copyFile
        Thread.sleep(2000);
        driver.close();
       
	}

}
