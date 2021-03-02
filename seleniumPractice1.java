import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class seleniumPractice1 {

	public static void main(String[] args) throws InterruptedException {
		
		
		System.setProperty("webdriver.chrome.driver", "/Users/jafry.rahman/Desktop/Drivers/chromedriver");

		WebDriver driver = new ChromeDriver();
	    
	    String url= "https://www.jafryrahmanrealty.com/";
	    driver.get(url);
	    driver.manage().window().maximize();
	    Thread.sleep(1500);
	    
	    
	    driver.findElement(By.xpath("//p[@id='comp-kle9f0h01label']")).click();
	    Thread.sleep(1500);
	    
	    driver.findElement(By.xpath("//input[@name='name']")).sendKeys("Jafry Rahman");
	    driver.findElement(By.xpath("//input[@name='email']")).sendKeys("Jafry.Rahman@gmail.com");
	    driver.findElement(By.xpath("//input[@name='phone']\n")).sendKeys("8454896634");
	    driver.findElement(By.xpath("//input[@name='subject']\n")).sendKeys("Selenium Test");
	    driver.findElement(By.xpath("//textarea[@id='textarea_comp-klb6lfn5']")).sendKeys("Hello, this is Jafry. I am testing out Selenium");

	}

}
