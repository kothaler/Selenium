package selenium;
import java.io.File;
import java.io.IOException;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
public class Pyrops {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\kotha\\Downloads\\chromedriver-win64 (3)\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver(); 
		Actions a = new Actions(driver);
		driver.get("https://test.pyrops.com/");
		driver.manage().window().maximize();
		Thread.sleep(1000);
		WebElement p1 = driver.findElement(By.xpath("//input[@name=\"txtUserId\"]"));
		p1.sendKeys("admin");
		WebElement p2 = driver.findElement(By.xpath("//input[@name=\"txtPassword\"]"));
		p2.sendKeys("A@dmin2023");
		WebElement p3 = driver.findElement(By.xpath("//input[@type=\"submit\"]"));
		p3.click();

		WebElement p5 = driver.findElement(By.xpath("//select[@name=\"ddlLocationCode\"]"));
		p5.sendKeys("PM01");
		WebElement p6 = driver.findElement(By.xpath("//input[@type=\"button\"]"));
		p6.click();
	
		WebElement p7 = driver.findElement(By.xpath("/html/body/form/section/aside/nav/ul/li[5]/a"));
	
		WebElement p8 = driver.findElement(By.xpath("//span[normalize-space()='Other Masters']"));
		
		WebElement p9 = driver.findElement(By.xpath("//span[normalize-space()='Country']"));
		a.moveToElement(p7).click().perform();
		a.moveToElement(p8).click().perform();
        p9.click();
        
	

	}

}
