import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Alertdemo 
{
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new EdgeDriver();
		driver.get("https://demo.guru99.com/test/delete_customer.php");
		driver.manage().window().maximize();
		
		WebElement CustomerID = driver.findElement(By.xpath("//input[@name='cusid']"));
		CustomerID.sendKeys("53920");
		
		WebElement submitbtn = driver.findElement(By.xpath("//input[@name='submit']"));
		submitbtn.click();
		
		//System.out.println(driver.switchTo().alert().getText());
		
		Thread.sleep(2000);
		
		driver.switchTo().alert().accept();
		
		Thread.sleep(2000);
		
		System.out.println(driver.switchTo().alert().getText());
		
		driver.switchTo().alert().accept();
		
		driver.get("https://demoqa.com/alerts");
		
		WebElement AlrtBtn = driver.findElement(By.xpath("//button[@id='alertButton']"));
		
		WebElement TimerAlert = driver.findElement(By.xpath("//button[@id='timerAlertButton']"));
		
		WebElement ConfirmBtm = driver.findElement(By.xpath("//button[@id='confirmButton']"));
		
		WebElement promptBtn = driver.findElement(By.xpath("//button[@id='promtButton']"));
		
		//AlrtBtn.click();
		//driver.switchTo().alert().accept();
		
		TimerAlert.click();
		
		Thread.sleep(6000);
		
		driver.switchTo().alert().accept();
		
		//ConfirmBtm.click();
		
		//driver.switchTo().alert().accept();
		
		promptBtn.click();
		
		Thread.sleep(1000);
		
		driver.switchTo().alert().sendKeys("Utkashraa Acadamy");
		
		Thread.sleep(1000);
		
		driver.switchTo().alert().accept();
		
		
		
		
		
		
	}
}
