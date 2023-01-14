package firstpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FirstClass {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		WebDriverManager.firefoxdriver().setup();
		WebDriverManager.edgedriver().setup();
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.saucedemo.com/");
		driver.findElement(By.id("user-name")).sendKeys("standard_user");
		driver.findElement(By.id("password")).sendKeys("secret_sauce");
		Thread.sleep(5000);
		driver.findElement(By.id("login-button")).click();
		Thread.sleep(5000);
		driver.findElement(By.id("add-to-cart-sauce-labs-backpack")).click();
		driver.findElement(By.className("shopping_cart_link")).click();
		Thread.sleep(5000);
		driver.findElement(By.id("checkout")).click();
		Thread.sleep(5000);
		driver.findElement(By.id("first-name")).sendKeys("lmao");
		driver.findElement(By.id("last-name")).sendKeys("com");
		driver.findElement(By.id("postal-code")).sendKeys("1234");
		driver.findElement(By.id("continue")).click();
		Thread.sleep(5000);
		driver.findElement(By.id("finish")).click();
		Thread.sleep(4000);
		driver.findElement(By.id("back-to-products")).click();
		Thread.sleep(5000);
		driver.close();

	}

}
