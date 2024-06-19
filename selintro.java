package introduction;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

 class selintro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// chrome
		//System.setProperty("webdriver.chrome.driver", "/Users
		//satej/Documents/chromedriver.exe");
		//WebDriver driver =new ChromeDriver();
		//driver.get("https://rahulshettyacademy.com");
		//System.out.println(driver.getTitle());------
		//driver.close();    // only close single window tab 
		//driver.quit();    // all windows close associated with the url
		
		//firefox
		System.setProperty("webdriver.chrome.driver","/Users/satej/Documents/geckodriver");
		WebDriver driver =new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://www.amazon.in/ap/signin?openid.pape.max_auth_age=0&openid.return_to=https%3A%2F%2Fwww.amazon.in%2F%3F%26tag%3Dgooghydrabk1-21%26ref%3Dnav_signin%26adgrpid%3D155259815513%26hvpone%3D%26hvptwo%3D%26hvadid%3D674842289437%26hvpos%3D%26hvnetw%3Dg%26hvrand%3D18393297958160820293%26hvqmt%3De%26hvdev%3Dc%26hvdvcmdl%3D%26hvlocint%3D%26hvlocphy%3D9152165%26hvtargid%3Dkwd-10573980%26hydadcr%3D14453_2316415%26gad_source%3D1&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.assoc_handle=inflex&openid.mode=checkid_setup&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0");
		//System.out.println(driver.getTitle());
		//driver.close();    // only close single window tab 
		//driver.quit();
		driver.findElement(By.id("ap_email")).sendKeys("8169999099");
		driver.findElement(By.className("a-button-input")).click();
		driver.findElement(By.name("password")).sendKeys("816999099");
		driver.findElement(By.className("a-button-input")).click();
		System.out.println(driver.findElement(By.cssSelector("h4.a-alert-heading")).getText());
		driver.findElement(By.linkText("Forgot Password")).click();
		//driver.findElement(By.xpath("input[@name='email']")).sendKeys("81699945484099") ;
		driver.findElement(By.name("password")).sendKeys("81699999099");
		driver.findElement(By.cssSelector("a-button-input")).click();
		}
}


