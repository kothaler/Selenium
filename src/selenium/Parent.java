package selenium;

import java.io.IOException;

public class Parent {

	public static void main(String[] args) throws InterruptedException, IOException
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\kotha\\Downloads\\chromedriver-win64 (1)\\chromedriver-win64\\chromedriver.exe");
		Child c = new Child();
		c.navigate();
		Thread.sleep(2000);
		c.logIn();
		Thread.sleep(2000);
		c.buzz();
		
	}

}
