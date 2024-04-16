package selenium;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Child
{     
	  WebDriver driver = new ChromeDriver(); 
      void navigate() throws InterruptedException
      {
    	  driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
    	  Thread.sleep(1000);
      }	  
    	  
      void logIn() throws InterruptedException, IOException   
      {
        WebElement userName = driver.findElement(By.xpath("//input[@name='username']"));
        userName.sendKeys("Admin");
  		WebElement pwd = driver.findElement(By.xpath("//input[@name='password']"));
  		pwd.sendKeys("admin123");
  		
  		TakesScreenshot scrshot = (TakesScreenshot)driver;
  		Thread.sleep(1000);
		File src = scrshot.getScreenshotAs(OutputType.FILE);
		File dest = new File("C:\\Users\\kotha\\OneDrive\\Desktop\\ss\\outputa.png");
		Thread.sleep(1000);
		FileUtils.copyFile(src,dest);
		System.out.println("ScreenShot is Captured");
		
	    WebElement btn = driver.findElement(By.xpath("//button[@type='submit']"));
		btn.click();
		Thread.sleep(1000);
		
		TakesScreenshot scrshot1 = (TakesScreenshot)driver;
  		Thread.sleep(1000);
		File src1 = scrshot1.getScreenshotAs(OutputType.FILE);
		File dest1 = new File("C:\\Users\\kotha\\OneDrive\\Desktop\\ss\\outputb.png");
		Thread.sleep(1000);
		FileUtils.copyFile(src1,dest1);
		System.out.println("ScreenShot is Captured");
      }
      
     void buzz() throws InterruptedException, IOException
     {
    	WebElement buzz = driver.findElement(By.xpath("//a[@href='/web/index.php/buzz/viewBuzz']")); 
        buzz.click();
 		Thread.sleep(1000);
 		WebElement post = driver.findElement(By.xpath("//textarea[@placeholder=\"What's on your mind?\"]"));
 		post.sendKeys("Hello Everyone");
 	    Thread.sleep(1000);
 	    
 	   TakesScreenshot ss = (TakesScreenshot)driver;
 		Thread.sleep(1000);
		File src2 = ss.getScreenshotAs(OutputType.FILE);
		File dest2 = new File("C:\\Users\\kotha\\OneDrive\\Desktop\\ss\\outputc.png");
		Thread.sleep(1000);
		FileUtils.copyFile(src2,dest2);
		System.out.println("ScreenShot is Captured");
 	   
        WebElement postBtn = driver.findElement(By.xpath("//button[@type='submit']"));
 		postBtn.click();
 		Thread.sleep(1000);
 		
 		 TakesScreenshot ss1 = (TakesScreenshot)driver;
  		Thread.sleep(1000);
 		File src3 = ss1.getScreenshotAs(OutputType.FILE);
 		File dest3 = new File("C:\\Users\\kotha\\OneDrive\\Desktop\\ss\\outputc.png");
 		Thread.sleep(1000);
 		FileUtils.copyFile(src3,dest3);
 		System.out.println("ScreenShot is Captured");
	   
     }
   
	

}
