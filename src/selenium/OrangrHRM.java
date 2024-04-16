package selenium;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class OrangrHRM {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\kotha\\Downloads\\chromedriver-win64 (1)\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		Boolean a,b,c;
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		driver.manage().window().fullscreen();
		Thread.sleep(5000);
		WebElement we1 = driver.findElement(By.xpath("//input[@name='username']"));
		we1.sendKeys("Admin");
     	WebElement we2 = driver.findElement(By.xpath("//input[@name='password']"));
		we2.sendKeys("admin123");
		WebElement we3 = driver.findElement(By.xpath("//button[@type='submit']"));
       a = we3.isDisplayed();
       System.out.println(a);
       b = we3.isEnabled();
       System.out.println(b);
        Thread.sleep(2000);
    	driver.quit();
	}

}
