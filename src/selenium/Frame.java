package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Frame
{

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\kotha\\Downloads\\chromedriver-win64 (3)\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver(); 
		Actions a = new Actions(driver);
		driver.get("https://www.globalsqa.com/demo-site/draganddrop/#google_vignette");
		Thread.sleep(2000);
		driver.manage().window().maximize();
		WebElement p1 = driver.findElement(By.xpath("//iframe[@class='demo-frame lazyloaded']"));
		driver.switchTo().frame(p1);
		  WebElement drag = driver.findElement(By.xpath("//img[@alt='The peaks of High Tatras']"));
	        WebElement drop = driver.findElement(By.xpath("//div[@id='trash']"));
	        a.dragAndDrop(drag, drop).build().perform();
	}

}
