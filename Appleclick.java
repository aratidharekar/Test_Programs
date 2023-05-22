import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class Appleclick 
{
	public static void main(String[] args) {
		
		WebDriver driver = new EdgeDriver();
		driver.get("https://amazon.in");
		driver.manage().window().maximize();
		WebElement mobile = driver.findElement(By.xpath("//a[text()='Mobiles']"));
		mobile.click();
		//WebElement apple = driver.findElement(By.xpath("//span[text()='Apple']//parent::a"));
		//apple.click();
		// Apple check box
		WebElement applecheck = driver.findElement(By.xpath("//span[text()='Apple']//preceding-sibling::div//child::i"));
		applecheck.click();
	
	}
}
