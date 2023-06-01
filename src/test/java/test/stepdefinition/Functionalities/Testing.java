package test.stepdefinition.Functionalities;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Testing {
	
	public static void main(String[] args) throws InterruptedException, AWTException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		 
		driver.get("http://52.36.76.186/signup");
		driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);

       
      	
		driver.findElement(By.xpath("(//input[@type='text'])[1]")).sendKeys("Test");
		driver.findElement(By.xpath("(//input[@type='text'])[2]")).sendKeys("Test1");
		driver.findElement(By.xpath("(//input[@type='text'])[3]")).sendKeys("shopedot6517865@yopmail.com");
		driver.findElement(By.name("password")).sendKeys("Welcome6@123");
		
		
		driver.findElement(By.xpath("//small[contains(text(),'signing')]")).click();
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
//      WebElement cli = driver.findElement(By.xpath("//button[@type='submit']"));
//		boolean actual = cli.isEnabled();
//		
//		if (actual) {
//			System.out.println("button is enable");
//		
//		}
//		else {
//			System.out.println("button is Disabled");
//		}
		
		   driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	        
	        driver.findElement(By.xpath("//h3[text()='BRAND Supplier']")).click();
	        driver.findElement(By.xpath("//button[normalize-space()='Next']")).click();
	        Thread.sleep(2000);
	        driver.findElement(By.xpath("(//a[text()='Settings'])[2]")).click();
	        
	        
	        
//	        Setting Page- Brand
	        driver.findElement(By.xpath("(//input[@type='text'])[2]")).sendKeys("Testing&Co");
	        driver.findElement(By.xpath("(//input[@type='text'])[3]")).sendKeys("shopedot5442@yopmail.com");
	        driver.findElement(By.xpath("//input[@type='tel']")).sendKeys("1234567890"); 	
	        Thread.sleep(1000);
//	        WebElement file = driver.findElement(By.xpath("//img[@class='icon']"));
//	        Thread.sleep(3000);
//	        file.sendKeys("C:\\Users\\Emman\\Downloads\\cake.jpg");
	        
	        driver.findElement(By.xpath("(//input[@type='text'])[4]")).sendKeys("ABC");
	        driver.findElement(By.xpath("(//input[@type='text'])[5]")).sendKeys("https://www.test.com");
	        driver.findElement(By.xpath("(//div[@class='checkbox-text'])[1]")).click();
	        driver.findElement(By.xpath("(//div[@class='checkbox-text'])[2]")).click();
	        driver.findElement(By.xpath("//span[normalize-space()='wooden2']")).click();
	        Robot r1 = new Robot();
	        
	        driver.findElement(By.xpath("(//div[@class='checkbox-text'])[6]")).click();
	        driver.findElement(By.xpath("(//div[@class='checkbox-text'])[7]")).click();
	        WebElement txtbox = driver.findElement(By.xpath("//textarea[@name='brand_story']"));
	        txtbox.click();
	        txtbox.sendKeys("Testing");
//	        JavascriptExecutor js = (JavascriptExecutor)driver;
	        
	        WebElement yt = driver.findElement(By.xpath("//input[@name='brand_promo']"));
	        yt.click();
	        yt.sendKeys("https://www.youtube");
	        r1.keyPress(KeyEvent.VK_PAGE_DOWN);
	        r1.keyRelease(KeyEvent.VK_PAGE_DOWN);
	        driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	        driver.findElement(By.xpath("(//button[@type='submit'])[2]")).click();
	        
	        
	        
	        
//	        Preference
	        Thread.sleep(4000); 
	        driver.findElement(By.xpath("//a[@data-link='Preferences']")).click();
	        
//	        driver.findElement(By.xpath("//a[@class='sc-dmqHEX jbNVjj tab-links required required active']")).click();
//	        driver.findElement(By.xpath("(//div[@class='radiobox-text'])[1]")).click();
	        WebElement tb = driver.findElement(By.xpath("//textarea[@name='requirementsForRetailers']"));
	        tb.click();
	        tb.sendKeys("Testing");
	        driver.findElement(By.xpath("//button[normalize-space()='Save']")).click();
	        

		        
//	        Security
	        Thread.sleep(3000);
	        driver.findElement(By.xpath("//a[normalize-space()='Security']")).click();
	        WebElement paswrd = driver.findElement(By.name("password"));
	        paswrd.click();
	        paswrd.sendKeys("Welcome6@123");
	        WebElement newpass = driver.findElement(By.name("newpassword"));
	        newpass.click();
	        newpass.sendKeys("Welcome6@321");
	        WebElement con = driver.findElement(By.name("confirmNewPassword"));
	        con.click();
	        con.sendKeys("Welcome6@321");
	        driver.findElement(By.xpath("(//button[@type='submit'])[2]")).click();
	   
	        
//	        Notification
	        Thread.sleep(2000);
	        driver.findElement(By.xpath("//a[normalize-space()='Notifications']")).click();
	        WebElement cl = driver.findElement(By.xpath("//input[@type='number']"));
	        cl.click();
	        cl.sendKeys("10");
	        
	       driver.findElement(By.xpath("//button[normalize-space()='Save']"));
	      
	        
//	        Shipping
	       Thread.sleep(5000);
	        driver.findElement(By.xpath("//a[@data-link='Shipping']")).click();
	        driver.findElement(By.xpath("//input[@name='address1']")).sendKeys("Test");
	        driver.findElement(By.xpath("//input[@name='address2']")).sendKeys("Test1");
	        
	        WebElement drop = driver.findElement(By.xpath("(//div[@class='select__indicators css-1wy0on6'])[1]"));
	        drop.click();
	        Thread.sleep(2000);
//	        Robot r1 = new Robot();
	        for (int i = 0; i < 1; i++) {
	        	
				r1.keyPress(KeyEvent.VK_DOWN);
				r1.keyRelease(KeyEvent.VK_DOWN);
				}
		        r1.keyPress(KeyEvent.VK_ENTER);
				r1.keyRelease(KeyEvent.VK_ENTER);
	        
//	        WebElement click = driver.findElement(By.xpath("//div[@id='react-select-2-option-0']"));
//	        click.click();
//	        JavascriptExecutor js1 = (JavascriptExecutor)driver;
//	        js1.executeScript("arguments[0].click()", click);
	        
	       
         
	        
	        WebElement city = driver.findElement(By.xpath("(//div[@class='select__indicators css-1wy0on6'])[2]"));
	        city.click();
	        
//	        WebElement sel = driver.findElement(By.xpath("//div[@id='react-select-3-option-1']"));
//	        sel.click();
//	        js1.executeScript("arguments[0].click()", city);
	        Thread.sleep(2000);
	        for (int i = 0; i < 1; i++) {
	        	
				r1.keyPress(KeyEvent.VK_DOWN);
				r1.keyRelease(KeyEvent.VK_DOWN);
			}
	        r1.keyPress(KeyEvent.VK_ENTER);
			r1.keyRelease(KeyEvent.VK_ENTER);
		
//	        City&Zip
            driver.findElement(By.xpath("//input[@name='city']")).sendKeys("New York");
            driver.findElement(By.xpath("//input[@name='zip']")).sendKeys("10001");
                       
            Robot r = new Robot();
	        WebElement ft = driver.findElement(By.name("shippingfee"));
	        ft.click();
	        
	        for (int i = 0; i < 6; i++) {
	        	r.keyPress(KeyEvent.VK_BACK_SPACE);
		        r.keyRelease(KeyEvent.VK_BACK_SPACE);
				
			}
	        ft.sendKeys("20");
	        WebElement fee = driver.findElement(By.xpath("//input[@name='incrementalfee']"));
	        fee.click();
	        for (int i = 0; i < 6; i++) {
	        	r.keyPress(KeyEvent.VK_BACK_SPACE);
		        r.keyRelease(KeyEvent.VK_BACK_SPACE);
			}
	        fee.sendKeys("10");
	        Thread.sleep(2000);
	        
	        WebElement day = driver.findElement(By.xpath("(//div[@class='select__indicator select__dropdown-indicator css-1xc3v61-indicatorContainer'])[3]"));
            day.click();
            Thread.sleep(2000);
	        for (int i = 0; i < 1; i++) {
	        	
				r1.keyPress(KeyEvent.VK_DOWN);
				r1.keyRelease(KeyEvent.VK_DOWN);
			}
	        r1.keyPress(KeyEvent.VK_ENTER);
			r1.keyRelease(KeyEvent.VK_ENTER);
			
			driver.findElement(By.xpath("(//button[@type='submit'])[2]")).click();
	       
            Thread.sleep(4000);
	               
//	        Getting Paid
	        Thread.sleep(7000);
	        driver.findElement(By.xpath("//a[@data-link='GettingPaid']")).click();
	        Thread.sleep(2000);
	        
	        driver.findElement(By.xpath("(//div[@class='radiobox-text'])[1]")).click();
	        driver.findElement(By.xpath("(//div[@class='radiobox-text'])[3]")).click();
	        driver.findElement(By.xpath("(//button[@type='submit'])[2]")).click();
	        
	        driver.findElement(By.xpath("//a[normalize-space()='Business Details']")).click();
	        
	        driver.findElement(By.name("businessName")).sendKeys("Test");
	        driver.findElement(By.name("businessAs")).sendKeys("Test1");
	        driver.findElement(By.name("website")).sendKeys("https://www.test.com");
	        driver.findElement(By.name("businessEmail")).sendKeys("Testing1000@yopmail.com");
	        
	        Robot a = new Robot();
	        WebElement dw = driver.findElement(By.xpath("//div[@class='form-input mb-4 business_category']//div[@class='select__indicators css-1wy0on6']"));
	        dw.click();
	        
	        a.keyPress(KeyEvent.VK_DOWN);
	        a.keyRelease(KeyEvent.VK_DOWN);
	        
	        a.keyPress(KeyEvent.VK_ENTER);
	        a.keyRelease(KeyEvent.VK_ENTER);
	        
	        driver.findElement(By.xpath("//input[@type='tel']")).sendKeys("1234567890");
	        driver.findElement(By.name("addressLine1")).sendKeys("Testing");
	        driver.findElement(By.name("addressLine2")).sendKeys("Testing1");
	        
	        driver.findElement(By.xpath("(//div[@class='select__input-container css-19bb58m'])[2]")).click();
	        
	        a.keyPress(KeyEvent.VK_DOWN);
			a.keyRelease(KeyEvent.VK_DOWN);
			
			a.keyPress(KeyEvent.VK_ENTER);
			a.keyRelease(KeyEvent.VK_ENTER);
			
			Thread.sleep(1000);
			driver.findElement(By.xpath("(//div[@class='select__input-container css-19bb58m'])[3]")).click();
			a.keyPress(KeyEvent.VK_DOWN);
			a.keyRelease(KeyEvent.VK_DOWN);
			
			a.keyPress(KeyEvent.VK_ENTER);
			a.keyRelease(KeyEvent.VK_ENTER);
			
			driver.findElement(By.name("city")).sendKeys("Test2");
			driver.findElement(By.name("zipcode")).sendKeys("10012");
			
			driver.findElement(By.xpath("(//div[@class='select__input-container css-19bb58m'])[4]")).click();
			a.keyPress(KeyEvent.VK_DOWN);
			a.keyRelease(KeyEvent.VK_DOWN);
			
			a.keyPress(KeyEvent.VK_ENTER);
			a.keyRelease(KeyEvent.VK_ENTER);
			Thread.sleep(1000);
			
			driver.findElement(By.xpath("//input[@class='example-custom-input form-control mb-0']")).click();
			
			driver.findElement(By.xpath("//div[@aria-label='Choose Sunday, April 30th, 2023']")).click();
			
			driver.findElement(By.name("averageSales")).sendKeys("5000");
			driver.findElement(By.name("averageSalePrice")).sendKeys("2000");
			
			driver.findElement(By.xpath("(//div[@class='select__input-container css-19bb58m'])[5]")).click();
			a.keyPress(KeyEvent.VK_DOWN);
			a.keyRelease(KeyEvent.VK_DOWN);
			
			a.keyPress(KeyEvent.VK_ENTER);
			a.keyRelease(KeyEvent.VK_ENTER);
			
			Thread.sleep(1000);
			for (int i = 0; i <2; i++) {
				a.keyPress(KeyEvent.VK_PAGE_DOWN);
		        a.keyRelease(KeyEvent.VK_PAGE_DOWN);	
			}
			
	        Thread.sleep(2000);
	        driver.findElement(By.xpath("(//*[name()='svg'][@class='css-8mmkcg'])[6]")).click();
	        a.keyPress(KeyEvent.VK_DOWN);
			a.keyRelease(KeyEvent.VK_DOWN);
			
			a.keyPress(KeyEvent.VK_ENTER);
			a.keyRelease(KeyEvent.VK_ENTER);
			
			Thread.sleep(2000);
			driver.findElement(By.xpath("//div[19]//div[1]//div[1]//div[2]//div[1]//*[name()='svg']")).click();
			for (int i = 0; i <1; i++) {
				a.keyPress(KeyEvent.VK_DOWN);
				a.keyRelease(KeyEvent.VK_DOWN);
				
				a.keyPress(KeyEvent.VK_ENTER);
				a.keyRelease(KeyEvent.VK_ENTER);	
			}
			
			driver.findElement(By.id("message")).sendKeys("Testing");
			
			Thread.sleep(2000);
			driver.findElement(By.xpath("//button[@class='button summary-icon']")).click();
			
			Thread.sleep(1000);
//			Business Representative 
			driver.findElement(By.xpath("(//input[@type='text'])[2]")).sendKeys("Testing");
			driver.findElement(By.xpath("(//input[@type='text'])[3]")).sendKeys("Testing1");
			driver.findElement(By.xpath("(//input[@type='tel'])[1]")).sendKeys("1234567890");
			driver.findElement(By.xpath("(//input[@type='tel'])[2]")).sendKeys("123456789");
			driver.findElement(By.xpath("//input[@class='example-custom-input form-control mb-0']")).click();
	        Thread.sleep(1000);
	        WebElement cli = driver.findElement(By.xpath("(//button[@type='button'])[1]"));
	        
	        for (int i = 0; i <10; i++) {
	        	cli.click();
			}
	        driver.findElement(By.xpath("//div[@class='react-datepicker__day react-datepicker__day--030 react-datepicker__day--outside-month']")).click();
	        
	        Thread.sleep(1000);
	        driver.findElement(By.xpath("(//input[@type='text'])[4]")).sendKeys("shopdot@yopmail.com");
	        
	        driver.findElement(By.xpath("(//input[@type='text'])[5]")).sendKeys("test11");
	        driver.findElement(By.xpath("(//input[@type='text'])[6]")).sendKeys("test171");
	        
	        driver.findElement(By.xpath("(//div[@class='select__input-container css-19bb58m'])[1]")).click();
	        Thread.sleep(2000);
	        a.keyPress(KeyEvent.VK_DOWN);
			a.keyRelease(KeyEvent.VK_DOWN);
			
			a.keyPress(KeyEvent.VK_ENTER);
			a.keyRelease(KeyEvent.VK_ENTER);
			
			driver.findElement(By.xpath("(//div[@class='select__input-container css-19bb58m'])[2]")).click();
			a.keyPress(KeyEvent.VK_DOWN);
			a.keyRelease(KeyEvent.VK_DOWN);
			
			a.keyPress(KeyEvent.VK_ENTER);
			a.keyRelease(KeyEvent.VK_ENTER);
			
			driver.findElement(By.name("representativeDetails.0.city")).sendKeys("New York");
			driver.findElement(By.xpath("(//input[@type='number'])[1]")).sendKeys("11012");
			driver.findElement(By.xpath("(//div[@class='select__input-container css-19bb58m'])[3]")).click();
	        Thread.sleep(2000);
	        a.keyPress(KeyEvent.VK_DOWN);
			a.keyRelease(KeyEvent.VK_DOWN);
			
			a.keyPress(KeyEvent.VK_ENTER);
			a.keyRelease(KeyEvent.VK_ENTER);
			
			driver.findElement(By.name("representativeDetails.0.idNumber")).sendKeys("514778616977");
			 driver.findElement(By.xpath("(//button[@type='submit'])[2]")).click();
			 
//	        Bank Details
			 
			 driver.findElement(By.name("accountHolderName")).sendKeys("Testing Bank");
			 driver.findElement(By.xpath("//div[@class='select__input-container css-19bb58m']")).click();
			    
			    a.keyPress(KeyEvent.VK_DOWN);
				a.keyRelease(KeyEvent.VK_DOWN);
				
				a.keyPress(KeyEvent.VK_ENTER);
				a.keyRelease(KeyEvent.VK_ENTER);
				
				driver.findElement(By.name("accountNumber")).sendKeys("12345678");
				driver.findElement(By.name("routingNumber")).sendKeys("123654789");
				driver.findElement(By.xpath("(//button[@type='submit'])[2]")).click();
				
//				Summary
				for (int i = 0; i < 3; i++) {
					a.keyPress(KeyEvent.VK_DOWN);
			        a.keyRelease(KeyEvent.VK_DOWN);
			        
			        a.keyPress(KeyEvent.VK_ENTER);
			        a.keyRelease(KeyEvent.VK_ENTER);
				}
				
				driver.findElement(By.xpath("(//div[@class='checkbox-text'])[1]")).click();
				driver.findElement(By.xpath("(//div[@class='checkbox-text'])[2]")).click();

				driver.findElement(By.xpath("(//button[@type='submit'])[2]")).click();
	        
//	       Integration
				Thread.sleep(5000);
            driver.findElement(By.xpath("//a[text()='Integration']")).click();
	        WebElement sh = driver.findElement(By.xpath("//input[@class='form-control']"));
	        sh.click();
	        sh.sendKeys("brand-store-emmanuel");
	        driver.findElement(By.xpath("//button[normalize-space()='Connect']")).click();

	        Thread.sleep(7000);
	        
	        driver.findElement(By.xpath("//input[@type='email']")).sendKeys("Satya@thetransmogrify.in");
	        Thread.sleep(2000);
	        driver.findElement(By.xpath("//button[@type='submit']")).click();
	        Thread.sleep(3000);
	        driver.findElement(By.xpath("//input[@type='password']")).sendKeys("satya1910#");
	        driver.findElement(By.xpath("//button[@type='submit']")).click();
	        
	        Thread.sleep(2000);
	        driver.findElement(By.xpath("//a[normalize-space()='Confirm']")).click();

	        Thread.sleep(2000);
	        driver.findElement(By.xpath("//button[@class='button button-dark']")).click();
	        
	        Thread.sleep(3000);
	        driver.findElement(By.xpath("//button[@class='button button-dark']")).click();
	        
	        Thread.sleep(6000);
	        for (int i = 0; i <10; i++) {
	        	driver.navigate().back();	
			}
	        
	        Thread.sleep(5000);
	        
	        driver.findElement(By.xpath("//button[@type='button']")).click();
	        Thread.sleep(6000);
//	        driver.findElement(By.xpath("//a[contains(@class,'menu_link')][normalize-space()='Products']")).click();
	        
	        

				
// Products
				driver.findElement(By.xpath("//a[@class='active menu_link']")).click();
				Thread.sleep(1000);
				driver.findElement(By.xpath("//button[@class='button button-blue small']")).click();
	}



	}




