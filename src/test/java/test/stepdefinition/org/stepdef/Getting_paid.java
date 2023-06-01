//package test.stepdefinition.org.stepdef;
//
//import java.awt.AWTException;
//import java.awt.Robot;
//import java.awt.event.KeyEvent;
//import java.util.concurrent.TimeUnit;
//
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//
//import BaseClass.BaseClass;
//import io.cucumber.java.en.Given;
//import io.cucumber.java.en.Then;
//import io.cucumber.java.en.When;
//
//public class Getting_paid extends BaseClass{
//	public WebDriver driver;
//	 public Robot a ;
//
//	@Given("To launch the Chrome Browser and Maximise window")
//	public void to_launch_the_chrome_browser_and_maximise_window() {
//		driver= launchBrowser();
//	}
//	@When("To launch the URL of the ShopDot Application and Complete the login Flows")
//	public void to_launch_the_url_of_the_shop_dot_application_and_complete_the_login_flows() throws InterruptedException {
//		launchurl("http://52.36.76.186/signup");
//
//		driver.manage().window().maximize();
//        driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
//
//		driver.findElement(By.xpath("(//input[@type='text'])[1]")).sendKeys("Test");
//		driver.findElement(By.xpath("(//input[@type='text'])[2]")).sendKeys("Test1");
//		driver.findElement(By.xpath("(//input[@type='text'])[3]")).sendKeys("shopedot9989@yopmail.com");
//		driver.findElement(By.name("password")).sendKeys("Welcome6@123");
//
//		driver.findElement(By.xpath("//small[contains(text(),'signing')]")).click();
//		driver.findElement(By.xpath("//button[@type='submit']")).click();
//
//		   driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
//	        Thread.sleep(2000);
//	        driver.findElement(By.xpath("//h3[text()='BRAND Supplier']")).click();
//	        driver.findElement(By.xpath("//button[normalize-space()='Next']")).click();
//	        Thread.sleep(2000);
//	        driver.findElement(By.xpath("(//a[text()='Settings'])[2]")).click();
//	}
//	@When("To User Clicks on the Getting Paid menu from Settings")
//	public void to_user_clicks_on_the_getting_paid_menu_from_settings() throws InterruptedException {
//		Thread.sleep(3000);
//        driver.findElement(By.xpath("//a[@data-link='GettingPaid']")).click();
//	}
//	@When("User fills the Start Application Screen")
//	public void user_fills_the_start_application_screen() throws InterruptedException {
//		driver.findElement(By.xpath("(//div[@class='radiobox-text'])[1]")).click();
//        driver.findElement(By.xpath("(//div[@class='radiobox-text'])[3]")).click();
//        driver.findElement(By.xpath("(//button[@type='submit'])[2]")).click();
//        Thread.sleep(3000);
//	}
//	@When("User Clicks on the Business Details and Fill all the Details")
//	public void user_clicks_on_the_business_details_and_fill_all_the_details() throws InterruptedException, AWTException {
//
//		Thread.sleep(2000);
//		driver.findElement(By.name("businessName")).sendKeys("Test");
//        driver.findElement(By.name("businessAs")).sendKeys("Test1");
//        driver.findElement(By.name("website")).sendKeys("https://www.test.com");
//        driver.findElement(By.name("businessEmail")).sendKeys("Testing1000@yopmail.com");
//
//        Robot a = new Robot();
//        WebElement dw = driver.findElement(By.xpath("//div[@class='form-input mb-4 business_category']//div[@class='select__indicators css-1wy0on6']"));
//        dw.click();
//
//        a.keyPress(KeyEvent.VK_DOWN);
//        a.keyRelease(KeyEvent.VK_DOWN);
//
//        a.keyPress(KeyEvent.VK_ENTER);
//        a.keyRelease(KeyEvent.VK_ENTER);
//
//        driver.findElement(By.xpath("//input[@type='tel']")).sendKeys("1234567890");
//        driver.findElement(By.name("addressLine1")).sendKeys("Testing");
//        driver.findElement(By.name("addressLine2")).sendKeys("Testing1");
//
//        driver.findElement(By.xpath("(//div[@class='select__input-container css-19bb58m'])[2]")).click();
//
//        a.keyPress(KeyEvent.VK_DOWN);
//		a.keyRelease(KeyEvent.VK_DOWN);
//
//		a.keyPress(KeyEvent.VK_ENTER);
//		a.keyRelease(KeyEvent.VK_ENTER);
//
//		Thread.sleep(1000);
//		driver.findElement(By.xpath("(//div[@class='select__input-container css-19bb58m'])[3]")).click();
//		a.keyPress(KeyEvent.VK_DOWN);
//		a.keyRelease(KeyEvent.VK_DOWN);
//
//		a.keyPress(KeyEvent.VK_ENTER);
//		a.keyRelease(KeyEvent.VK_ENTER);
//
//		driver.findElement(By.name("city")).sendKeys("Test2");
//		driver.findElement(By.name("zipcode")).sendKeys("10012");
//
//		driver.findElement(By.xpath("(//div[@class='select__input-container css-19bb58m'])[4]")).click();
//		a.keyPress(KeyEvent.VK_DOWN);
//		a.keyRelease(KeyEvent.VK_DOWN);
//
//		a.keyPress(KeyEvent.VK_ENTER);
//		a.keyRelease(KeyEvent.VK_ENTER);
//		Thread.sleep(1000);
//
//		driver.findElement(By.xpath("//input[@class='example-custom-input form-control mb-0']")).click();
//
//		driver.findElement(By.xpath("//div[@aria-label='Choose Sunday, April 30th, 2023']")).click();
//
//		driver.findElement(By.name("averageSales")).sendKeys("5000");
//		driver.findElement(By.name("averageSalePrice")).sendKeys("2000");
//
//		driver.findElement(By.xpath("(//div[@class='select__input-container css-19bb58m'])[5]")).click();
//		a.keyPress(KeyEvent.VK_DOWN);
//		a.keyRelease(KeyEvent.VK_DOWN);
//
//		a.keyPress(KeyEvent.VK_ENTER);
//		a.keyRelease(KeyEvent.VK_ENTER);
//
//		Thread.sleep(1000);
//		for (int i = 0; i <2; i++) {
//			a.keyPress(KeyEvent.VK_PAGE_DOWN);
//	        a.keyRelease(KeyEvent.VK_PAGE_DOWN);
//		}
//
//        Thread.sleep(2000);
//        driver.findElement(By.xpath("(//*[name()='svg'][@class='css-8mmkcg'])[6]")).click();
//        a.keyPress(KeyEvent.VK_DOWN);
//		a.keyRelease(KeyEvent.VK_DOWN);
//
//		a.keyPress(KeyEvent.VK_ENTER);
//		a.keyRelease(KeyEvent.VK_ENTER);
//
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("//div[19]//div[1]//div[1]//div[2]//div[1]//*[name()='svg']")).click();
//		for (int i = 0; i <1; i++) {
//			a.keyPress(KeyEvent.VK_DOWN);
//			a.keyRelease(KeyEvent.VK_DOWN);
//
//			a.keyPress(KeyEvent.VK_ENTER);
//			a.keyRelease(KeyEvent.VK_ENTER);
//		}
//
//		driver.findElement(By.id("message")).sendKeys("Testing");
//
//		Thread.sleep(2000);
//
//	}
//	@When("User click on the Save and Next button on the Business Details")
//	public void user_click_on_the_save_and_next_button_on_the_business_details() {
//		driver.findElement(By.xpath("//button[@class='button summary-icon']")).click();
//	}
//	@When("User navigate to the Business Representative Section")
//	public void user_navigate_to_the_business_representative_section() {
//	    System.out.println("Sucess");
//	}
//	@When("User enters all the mandatory fields in the Business Representative")
//	public void user_enters_all_the_mandatory_fields_in_the_business_representative() throws InterruptedException, AWTException {
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("(//input[@type='text'])[2]")).sendKeys("Testing");
//		driver.findElement(By.xpath("(//input[@type='text'])[3]")).sendKeys("Testing1");
//		driver.findElement(By.xpath("(//input[@type='tel'])[1]")).sendKeys("1234567890");
//		driver.findElement(By.xpath("(//input[@type='tel'])[2]")).sendKeys("123456789");
//		driver.findElement(By.xpath("//input[@class='example-custom-input form-control mb-0']")).click();
//        Thread.sleep(1000);
//        WebElement cli = driver.findElement(By.xpath("(//button[@type='button'])[1]"));
//        Robot a = new Robot();
//        for (int i = 0; i <10; i++) {
//        	cli.click();
//		}
//        driver.findElement(By.xpath("//div[@class='react-datepicker__day react-datepicker__day--030 react-datepicker__day--outside-month']")).click();
//
//        Thread.sleep(1000);
//        driver.findElement(By.xpath("(//input[@type='text'])[4]")).sendKeys("shopdot@yopmail.com");
//
//        driver.findElement(By.xpath("(//input[@type='text'])[5]")).sendKeys("test11");
//        driver.findElement(By.xpath("(//input[@type='text'])[6]")).sendKeys("test171");
//        Thread.sleep(2000);
//        driver.findElement(By.xpath("(//div[@class='select__indicators css-1wy0on6'])[1]")).click();
//
//        Thread.sleep(1000);
//        a.keyPress(KeyEvent.VK_DOWN);
//		a.keyRelease(KeyEvent.VK_DOWN);
//		a.keyPress(KeyEvent.VK_DOWN);
//		a.keyRelease(KeyEvent.VK_DOWN);
//
//
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("(//div[@class='select__input-container css-19bb58m'])[2]")).click();
//		a.keyPress(KeyEvent.VK_DOWN);
//		a.keyRelease(KeyEvent.VK_DOWN);
//
//		a.keyPress(KeyEvent.VK_ENTER);
//		a.keyRelease(KeyEvent.VK_ENTER);
//
//		driver.findElement(By.name("representativeDetails.0.city")).sendKeys("New York");
//		driver.findElement(By.xpath("(//input[@type='number'])[1]")).sendKeys("11012");
//		driver.findElement(By.xpath("(//div[@class='select__input-container css-19bb58m'])[3]")).click();
//        Thread.sleep(2000);
//        a.keyPress(KeyEvent.VK_DOWN);
//		a.keyRelease(KeyEvent.VK_DOWN);
//
//		a.keyPress(KeyEvent.VK_ENTER);
//		a.keyRelease(KeyEvent.VK_ENTER);
//
//		driver.findElement(By.name("representativeDetails.0.idNumber")).sendKeys("514778616977");
//
//	}
//	@When("and the user click on Save and Next button")
//	public void and_the_user_click_on_save_and_next_button() {
//		driver.findElement(By.xpath("(//button[@type='submit'])[2]")).click();
//	}
//	@When("It navigate to the Bank Details Section")
//	public void it_navigate_to_the_bank_details_section() {
//	    System.out.println("Navigated");
//	}
//	@When("User fills the Bank Details Screen")
//	public void user_fills_the_bank_details_screen() throws AWTException {
//		Robot a = new Robot();
//		driver.findElement(By.name("accountHolderName")).sendKeys("Testing Bank");
//		 driver.findElement(By.xpath("//div[@class='select__input-container css-19bb58m']")).click();
//
//		    a.keyPress(KeyEvent.VK_DOWN);
//			a.keyRelease(KeyEvent.VK_DOWN);
//
//			a.keyPress(KeyEvent.VK_ENTER);
//			a.keyRelease(KeyEvent.VK_ENTER);
//
//			driver.findElement(By.name("accountNumber")).sendKeys("12345678");
//			driver.findElement(By.name("routingNumber")).sendKeys("123654789");
//
//	}
//	@When("click on Save and Next button")
//	public void click_on_save_and_next_button() {
//		driver.findElement(By.xpath("(//button[@type='submit'])[2]")).click();
//	}
//	@When("Displayed the Review and Confirm Summary and Clicks on the checkboox")
//	public void displayed_the_review_and_confirm_summary_and_clicks_on_the_checkboox() throws AWTException {
//		Robot a = new Robot();
//		for (int i = 0; i < 3; i++) {
//			a.keyPress(KeyEvent.VK_DOWN);
//	        a.keyRelease(KeyEvent.VK_DOWN);
//
//	        a.keyPress(KeyEvent.VK_ENTER);
//	        a.keyRelease(KeyEvent.VK_ENTER);
//		}
//
//		driver.findElement(By.xpath("(//div[@class='checkbox-text'])[1]")).click();
//		driver.findElement(By.xpath("(//div[@class='checkbox-text'])[2]")).click();
//
//
//	}
//	@When("click on Submit button in the Summary screen")
//	public void click_on_submit_button_in_the_summary_screen() {
//		driver.findElement(By.xpath("(//button[@type='submit'])[2]")).click();
//	}
//
//	@Then("Close the window")
//	public void close_the_window() throws InterruptedException {
//		Thread.sleep(10000);
//	   closeEntireBrowser();
//	}
//
//}
