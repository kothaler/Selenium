package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {

	public static void main(String[] args)throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\kotha\\Downloads\\chromedriver-win64 (3)\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        
        driver.get("https://www.globalsqa.com/demo-site/draganddrop/#google_vignette");
        Thread.sleep(2000);
        driver.manage().window().maximize();
        Actions actions = new Actions(driver);
        driver.switchTo().frame((WebElement) By.xpath("//iframe[@class=\"demo-frame lazyloaded\"]"));
        Thread.sleep(2000);
        
        WebElement drag = driver.findElement(By.xpath("//img[@alt='The peaks of High Tatras']"));
        WebElement drop = driver.findElement(By.xpath("//div[@id='trash']"));
        actions.dragAndDrop(drag, drop).build().perform();
        
	}

}
