package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Uncodemy {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\kotha\\Downloads\\chromedriver-win64 (2)\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://uncodemy.com/");
		Thread.sleep(2000);
		Actions a = new Actions(driver);
		WebElement we1 = driver.findElement(By.xpath("//span[@id=\"categoriesBtn\"]"));
		WebElement we2 = driver.findElement(By.xpath("//a[@href='#'][normalize-space()='Software Testing']"));
		WebElement we3 = driver.findElement(By.xpath("//a[@class='has'][normalize-space()='Software Testing']"));
		
		a.moveToElement(we1).perform();
		a.moveToElement(we2).perform(); 
        we3.click();
        Thread.sleep(5000);
       // driver.quit();

	}

}
