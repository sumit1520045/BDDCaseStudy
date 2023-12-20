package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;



public class loginPage {
	
	public void loginToApp() {
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoblaze.com");
		//h4[@class='card-title']/a[text()='Samsung galaxy s6']
		WebElement login= driver.findElement(By.xpath( "//*[@id='login2']"));
		login.click();
		WebElement username= driver.findElement(By.id("loginusername"));
		WebElement password= driver.findElement(By.id("loginpassword"));
		WebElement loginButton= driver.findElement(By.xpath("//*[@id='logInModal']//button[2]"));
		loginButton.click();
	}
	
	public void addItemToCart() {
		
	}
}