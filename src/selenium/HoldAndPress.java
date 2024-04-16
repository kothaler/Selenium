package selenium;

import java.awt.AWTException;
import java.awt.Robot;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class HoldAndPress {

	public static void main(String[] args) throws InterruptedException, AWTException
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\kotha\\Downloads\\chromedriver-win64 (3)\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
  
        
        driver.get("");
        Thread.sleep(2000);
        driver.manage().window().maximize();
        WebElement para = driver.findElement(By.xpath("//p[contains(text(),'is a leading Training and Placements company in Ch')]"));
        WebElement para1 = driver.findElement(By.xpath("//b[contains(text(),'10 years, providing Training, Consultancy and Deve')]"));
      
        
	}

}
