package com.simplilearn.session2;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Screenshots {

	public static void main(String[] args) throws IOException, InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "E:\\\\Eclips-phase-5\\\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.myntra.com/");
		
		TakesScreenshot t = (TakesScreenshot) driver; //taking screenshot
		File src = t.getScreenshotAs(OutputType.FILE);// get screenshot as file format and written output type as file, it will stored in RAM
		File dest = new File("./photo/myntra.png");//to store the photo give location and with .extension
		
		FileUtils.copyFile(src, dest);//copy the file from source to destination using FileUtils.copyFile
        Thread.sleep(2000);
        driver.close();

	}

}
