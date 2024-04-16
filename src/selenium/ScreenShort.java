package selenium;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScreenShort {

	public static void main(String[] args) throws InterruptedException, IOException
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\kotha\\Downloads\\chromedriver-win64 (1)\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		Boolean a,b,c;
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
	//	driver.manage().window().fullscreen();
		Thread.sleep(5000);
		WebElement we1 = driver.findElement(By.xpath("//input[@name='username']"));
		we1.sendKeys("Admin");
     	WebElement we2 = driver.findElement(By.xpath("//input[@name='password']"));
		we2.sendKeys("admin123");
		TakesScreenshot scrShot = (TakesScreenshot)driver;
		   Thread.sleep(2000);
		   File SrcFile=scrShot.getScreenshotAs(OutputType.FILE);
		   File DestFile=new File("C:\\Users\\kotha\\OneDrive\\Desktop\\output3.png");
		   Thread.sleep(2000);
		   FileUtils.copyFile(SrcFile, DestFile);
		   System.out.println("ScreenShot is Captured");
		WebElement we3 = driver.findElement(By.xpath("//button[@type='submit']"));
		we3.click();
		Thread.sleep(2000);
		TakesScreenshot ss = (TakesScreenshot)driver;
		   Thread.sleep(2000);
		   File SrcFile1=ss.getScreenshotAs(OutputType.FILE);
		   File DestFile1=new File("C:\\Users\\kotha\\OneDrive\\Desktop\\output4.png");
		  Thread.sleep(2000);
		   FileUtils.copyFile(SrcFile1, DestFile1);
		   System.out.println("ScreenShot is Captured");

	}

}
