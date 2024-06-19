package introduction;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Googlepage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver  driver = new FirefoxDriver();

		

		driver.get("https://www.google.com/?sa=X&ved=0ahUKEwjn5fPFtMKGAxWeG9AFHQqPCwoQOwgC");
		//driver.findElement(By.xpath("//textarea[@id='APjFqb']")).sendKeys("testing");
		//List<WebElement> list= driver.findElements(By.xpath("//ul[@role='listbox']//li/decendant::div[@class='lnnVSe']"));
		//driver.findElement(By.xpath("(//input[@name='btnK'])[2]")).click();
		
		
		
		//driver.findElement(By.xpath("(//input[@name='btnI'])[2]")).click();
		//driver.findElement(By.xpath("(//input[contains(@aria-label='Lucky'])")).click();
		driver.findElement(By.xpath("(//input[contains(@value='I'm Feeling Lucky')")).click();
		//driver.findElement(By.xpath("//input[contains(@value,'Feeling')]")).click();
	}

}
