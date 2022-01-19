package selenium.week2d2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class InteractWithButtons {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://leafground.com/pages/Button.html");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		driver.findElement(By.xpath("//button[@id='home']")).click();
		//driver.navigate().back();
		driver.findElement(By.xpath("//h5[text()='Button']")).click();
		
		System.out.println(driver.findElement(By.xpath("//button[@id='position']")).getLocation().getX());
		
		System.out.println(driver.findElement(By.xpath("//button[@id='position']")).getLocation().getY());
		System.out.println(driver.findElement(By.xpath("//button[@id='color']")).getCssValue("background-color"));
		
		System.out.println(driver.findElement(By.xpath("//button[@id='size']")).getSize().getHeight());
		
		System.out.println(driver.findElement(By.xpath("//button[@id='size']")).getSize().getWidth());
		
		driver.close();
		
		
		
	}

}
