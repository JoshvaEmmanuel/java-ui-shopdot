//package test.stepdefinition.Functionalities;
//
//import java.awt.AWTException;
//import java.awt.Robot;
//import java.awt.event.KeyEvent;
//import java.util.concurrent.TimeUnit;
//
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//
//import com.codeborne.selenide.Selenide;
//
//import io.github.bonigarcia.wdm.WebDriverManager;
//
//public class SampleClass {
//
//
//	public static void main(String[] args) throws InterruptedException, AWTException {
//		WebDriverManager.chromedriver().setup();
//		WebDriver driver = new ChromeDriver();
//
//		driver.get("http://52.36.76.186/signup");
//		driver.manage().window().maximize();
//        driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
//
//
//
//		driver.findElement(By.xpath("(//input[@type='text'])[1]")).sendKeys("Test");
//		driver.findElement(By.xpath("(//input[@type='text'])[2]")).sendKeys("Test1");
//		driver.findElement(By.xpath("(//input[@type='text'])[3]")).sendKeys("shopedot657856@yopmail.com");
//		driver.findElement(By.name("password")).sendKeys("Welcome6@123");
//
//
//		driver.findElement(By.xpath("//small[contains(text(),'signing')]")).click();
//		driver.findElement(By.xpath("//button[@type='submit']")).click();
//
//		driver.findElement(By.xpath("(//div[@class='pse_item'])[2]")).click();
//		driver.findElement(By.xpath("//button[@type='button']")).click();
//
//		Thread.sleep(1000);
//		driver.findElement(By.xpath("//a[@class='sc-dmovaM euFnSK ob-link']")).click();
//
//		driver.findElement(By.name("companyName")).sendKeys("Cakeworld");
//		Thread.sleep(4000);
//		driver.findElement(By.name("contactEmail")).sendKeys("Cakeworld@yopmail.com");
//		Thread.sleep(4000);
//		driver.findElement(By.name("contactPhone")).sendKeys("1236547890");
//		Thread.sleep(4000);
//		driver.findElement(By.name("addressLine1")).sendKeys("Test");
//		Thread.sleep(4000);
//		driver.findElement(By.xpath("(//div[@class='select__input-container css-19bb58m'])[1]")).click();
//		Robot r1 = new Robot();
//        for (int i = 0; i < 1; i++) {
//
//			r1.keyPress(KeyEvent.VK_DOWN);
//			r1.keyRelease(KeyEvent.VK_DOWN);
//			}
//	        r1.keyPress(KeyEvent.VK_ENTER);
//			r1.keyRelease(KeyEvent.VK_ENTER);
////    sele
//			Thread.sleep(4000);
//		driver.findElement(By.xpath("(//div[@class='select__input-container css-19bb58m'])[2]")).click();
//		Robot r = new Robot();
//        for (int i = 0; i < 1; i++) {
//
//			r.keyPress(KeyEvent.VK_DOWN);
//			r.keyRelease(KeyEvent.VK_DOWN);
//			}
//	        r.keyPress(KeyEvent.VK_ENTER);
//			r.keyRelease(KeyEvent.VK_ENTER);
////    sel
//			Thread.sleep(4000);
//		driver.findElement(By.name("city")).sendKeys("Test1");
//		Thread.sleep(4000);
//		driver.findElement(By.name("zipcode")).sendKeys("10012");
//		Thread.sleep(4000);
//		driver.findElement(By.name("retailerName")).sendKeys("CakeWorld");
//		Thread.sleep(4000);
//		driver.findElement(By.name("retailerWebsite")).sendKeys("https://www.cakeworld.com");
//
//		driver.findElement(By.xpath("(//div[@class='select__input-container css-19bb58m'])[3]")).click();
//		Thread.sleep(2000);
//
//        for (int i = 0; i < 1; i++) {
//
//			r1.keyPress(KeyEvent.VK_DOWN);
//			r1.keyRelease(KeyEvent.VK_DOWN);
//			}
//	        r1.keyPress(KeyEvent.VK_ENTER);
//			r1.keyRelease(KeyEvent.VK_ENTER);
//
//
//			driver.findElement(By.xpath("//div[@class='select-checkbox']//div[1]//label[1]//div[1]")).click();
//			driver.findElement(By.name("aboutTheRetailer")).sendKeys("Testing");
//			driver.findElement(By.name("link")).sendKeys("https://youtube.com");
//
//
////  Billing
//			driver.findElement(By.xpath("//a[normalize-space()='Billing']")).click();
//			Thread.sleep(1000);
//			driver.findElement(By.xpath("//button[@class='button button-border add-user']")).click();
//			driver.findElement(By.name("cardNumber")).sendKeys("4462 3242 0823 4945");
//			driver.findElement(By.name("expiryDate")).sendKeys("1127");
//			driver.findElement(By.name("cvv")).sendKeys("123");
//			driver.findElement(By.name("nameOnCard")).sendKeys("Dave");
//			driver.findElement(By.name("addressLine1")).sendKeys("Testing Lane");
//			driver.findElement(By.name("city")).sendKeys("San Jose");
//
//			driver.findElement(By.xpath("//div[@class='select__input-container css-19bb58m']")).click();
//		Thread.sleep(2000);
//			for (int i = 0; i < 1; i++) {
//
//				r1.keyPress(KeyEvent.VK_DOWN);
//				r1.keyRelease(KeyEvent.VK_DOWN);
//				}
//		        r1.keyPress(KeyEvent.VK_ENTER);
//				r1.keyRelease(KeyEvent.VK_ENTER);
//
//				driver.findElement(By.name("zip")).sendKeys("12310");
//
//				driver.findElement(By.xpath("//button[@type='submit']")).click();
//
//
//
//
//
//
//
//	}
//}
