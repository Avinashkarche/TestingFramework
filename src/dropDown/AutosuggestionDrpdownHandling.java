package dropDown;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import utility.BaseTest;

public class AutosuggestionDrpdownHandling {
	public static void main(String[] args) throws InterruptedException {
		
	
	WebDriver driver = BaseTest.initBrowser("https://www.google.com/");

	driver.findElement(By.xpath("//*[@name='q']")).sendKeys("Selenium");

	Thread.sleep(2000);

	List<WebElement> allelements = driver.findElements(By.xpath("//*[text()='selenium']"));

	for(WebElement ele:allelements)
	
	{
		String text = ele.getText();

		System.out.println(text);
	}

}

}
