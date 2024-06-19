package introduction;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;

public class Updateddropdwon {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new FirefoxDriver();

		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");

		/*
		 * radio button Assert.assertFalse(driver.findElement(By.cssSelector(
		 * "input[id*='SeniorCitizenDiscount']")).isSelected());
		 * 
		 * //Assert.assertFalse(true);System.out.println(driver.findElement(By.
		 * cssSelector("input[id*='SeniorCitizenDiscount']")).isSelected());
		 * 
		 * driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).
		 * click();
		 * 
		 * System.out.println(driver.findElement(By.cssSelector(
		 * "input[id*='SeniorCitizenDiscount']")).isSelected());
		 * 
		 * Assert.assertTrue(driver.findElement(By.cssSelector(
		 * "input[id*='SeniorCitizenDiscount']")).isSelected());
		 */
		// code for updateddropdown

		driver.findElement(By.id("divpaxinfo")).click();

		// Thread.sleep(2000L);

		/*
		 * int i=1;
		 * 
		 * while(i<5)
		 * 
		 * {
		 * 
		 * driver.findElement(By.id("hrefIncAdt")).click();
		 * 
		 * i++;
		 * 
		 * }
		 */

		System.out.println(driver.findElement(By.id("divpaxinfo")).getText());

		for (int i = 1; i < 5; i++)

		{

			driver.findElement(By.id("hrefIncAdt")).click();

		}

		driver.findElement(By.id("btnclosepaxoption")).click();

		// Assert.assertequal(driver.findElement(By.id("divpaxinfo")).getText(), "5
		// Adult");

		System.out.println(driver.findElement(By.id("divpaxinfo")).getText());
	}

	// System.out.println(driver.findElement(By.id("divpaxinfo")).getText());

}
