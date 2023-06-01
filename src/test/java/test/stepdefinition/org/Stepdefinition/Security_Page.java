package test.stepdefinition.org.Stepdefinition;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import BaseClass.BaseClass;
import Pojo.Pojo_Security;
import Pojo.Pojo_SignIn;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Security_Page extends BaseClass {
	
	public WebDriver driver;	
	public Pojo_Security s;
	public Pojo_SignIn  a;
	
		
	@Given("To launch the Chrome Browser and Maximise window")
	public void to_launch_the_chrome_browser_and_maximise_window() {
		driver=launchBrowser();
		s = new Pojo_Security(driver);
		a = new Pojo_SignIn(driver);
	}

	@When("To launch the URL of the ShopDot Application and Complete the login Flows")
	public void To_launch_the_url_of_the_shop_dot_application_and_complete_the_login_flow() throws InterruptedException {
		driver.get("http://52.36.76.186/sign-up");
		driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);

       
      	
		driver.findElement(By.xpath("(//input[@type='text'])[1]")).sendKeys("Test");
		driver.findElement(By.xpath("(//input[@type='text'])[2]")).sendKeys("Test1");
		driver.findElement(By.xpath("(//input[@type='text'])[3]")).sendKeys("shopedot65834@yopmail.com");
		driver.findElement(By.name("password")).sendKeys("Welcome6@321");
		
		driver.findElement(By.xpath("//small[contains(text(),'signing')]")).click();
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
		   driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	        
	        driver.findElement(By.xpath("//h3[text()='BRAND Supplier']")).click();
	        driver.findElement(By.xpath("//button[normalize-space()='Next']")).click();
	        Thread.sleep(2000);
	        driver.findElement(By.xpath("(//a[text()='Settings'])[2]")).click();
	}

	@When("To User Clicks on the Security menu from Settings")
	public void to_user_clicks_on_the_security_menu_from_settings() throws InterruptedException {
		Thread.sleep(2000);
        driver.findElement(By.xpath("//a[normalize-space()='Security']")).click();
	}

	@When("User enters the Data in {string} in the Change Password Field")
	public void user_enters_the_data_in_in_the_change_password_field(String string1) {
	    sendText(s.getOldPassword(), string1);
	}

	@When("The User enters the Data in {string} in the Change Password Field")
	public void the_User_enters_the_data_in_in_the_change_password_field(String string2) {
	    sendText(s.getNewPassword(), string2);
	}

	@When("Again User enters the Data in {string} in the Change password Field")
	public void again_user_enters_the_data_in_in_the_change_password_field(String string3) {
	   sendText(s.getConfirmPassword(), string3);
	}

	@When("User Clicks on the Save button")
	public void user_clicks_on_the_save_button() {
		driver.findElement(By.xpath("(//button[@type='submit'])[2]")).click();
	}

	@Then("ShopDot Saves the new password and Display the Message Password Sucessfully Changed and Close the Window")
	public void shop_dot_saves_the_new_password_and_display_the_message_password_sucessfully_changed_and_close_the_window() throws IOException, InterruptedException {
	    screenShot("C:\\Users\\Emman\\eclipse-workspace\\Sample\\Screenshot+ss1");
	    Thread.sleep(2000);
	    closeWindow();
	}

	@When("To launch the URL of the ShopDot application and complete the login Flow")
	public void to_launch_the_url_of_the_shop_dot_application_and_complete_the_login_flow() throws InterruptedException {
		driver.get("http://52.36.76.186/sign-up");
		driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);

       
      	
		driver.findElement(By.xpath("(//input[@type='text'])[1]")).sendKeys("Test");
		driver.findElement(By.xpath("(//input[@type='text'])[2]")).sendKeys("Test1");
		driver.findElement(By.xpath("(//input[@type='text'])[3]")).sendKeys("shopedot65835@yopmail.com");
		driver.findElement(By.name("password")).sendKeys("Welcome6@123");
		
		driver.findElement(By.xpath("//small[contains(text(),'signing')]")).click();
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
		   driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	        
	        driver.findElement(By.xpath("//h3[text()='BRAND Supplier']")).click();
	        driver.findElement(By.xpath("//button[normalize-space()='Next']")).click();
	        Thread.sleep(2000);
	        driver.findElement(By.xpath("(//a[text()='Settings'])[2]")).click();
	}

	@When("The User Clicks on the Security menu from Settings")
	public void the_user_clicks_on_the_security_menu_from_settings() throws InterruptedException {
		Thread.sleep(2000);
        driver.findElement(By.xpath("//a[normalize-space()='Security']")).click();
	}

	@When("The User enters the Invalid Data in {string} in the Change Password Field")
	public void the_user_enters_the_invalid_data__in_the_change_password_field(String string) {
	    sendText(s.getOldPassword(), string);
	}

	@When("The User enters the Valid Data in {string} in the Change Password Field")
	public void the_user_enters_the_Valid_data_in_in_the_change_password_field(String string) {
	    sendText(s.getNewPassword(), string);
	}

	@When("The User enters the  Valid Data in {string} in the Change password Field")
	public void the_user_enters_the_valid_data_in_in_the_change_password_field(String strings) {
	    sendText(s.getConfirmPassword(), strings);
	}

	@When("The User Click on the Save button")
	public void the_user_click_on_the_save_button() {
		driver.findElement(By.xpath("(//button[@type='submit'])[2]")).click();
	}

	@Then("Display the Message Invalid Password and Close the Window")
	public void display_the_message_invalid_password_and_close_the_window() throws IOException, InterruptedException {
	    screenShot("C:\\Users\\Emman\\eclipse-workspace\\Sample\\Screenshot+ss2");
	    Thread.sleep(2000);
	    closeWindow();
	}
	
	@When("To launch the URL of  ShopDot application and complete the login Flow")
	public void to_launch_the_url_of_shop_dot_application_and_complete_the_login_flow() throws InterruptedException {
	    
	
		driver.get("http://52.36.76.186/sign-up");
		driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);

       
      	
		driver.findElement(By.xpath("(//input[@type='text'])[1]")).sendKeys("Test");
		driver.findElement(By.xpath("(//input[@type='text'])[2]")).sendKeys("Test1");
		driver.findElement(By.xpath("(//input[@type='text'])[3]")).sendKeys("shopedot65836@yopmail.com");
		driver.findElement(By.name("password")).sendKeys("Welcome6@123");
		
		driver.findElement(By.xpath("//small[contains(text(),'signing')]")).click();
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
		   driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	        
	        driver.findElement(By.xpath("//h3[text()='BRAND Supplier']")).click();
	        driver.findElement(By.xpath("//button[normalize-space()='Next']")).click();
	        Thread.sleep(2000);
	        driver.findElement(By.xpath("(//a[text()='Settings'])[2]")).click();
	}

	@When("User Clicks on the Security menu from the Settings")
	public void user_clicks_on_the_security_menu_from_the_settings() throws InterruptedException {
		Thread.sleep(2000);
        driver.findElement(By.xpath("//a[normalize-space()='Security']")).click();
	}

	@When("the User enters the Correct Data in {string} in the Change Password Field")
	public void the_user_enters_the_correct_data_in_in_the_change_password_field(String string6) {
	    sendText(s.getOldPassword(), string6);
	}

	@When("the User enters the Data in {string} in the Change Password Field")
	public void the_user_enters_the_data_in_in_the_change_password_field(String string7) {
	    sendText(s.getNewPassword(), string7);
	}

	@When("the User enters the  Invalid Data in {string} in the Change password Field")
	public void the_user_enters_the_invalid_data_in_in_the_change_password_field(String string8) {
	    sendText(s.getConfirmPassword(), string8);
	}

	@When("then User Click on the Save button")
	public void then_user_click_on_the_save_button() {
		driver.findElement(By.xpath("(//button[@type='submit'])[2]")).click();
	}

	@Then("Error Message Display Passwords do not match and Close the Window")
	public void error_message_display_passwords_do_not_match_and_close_the_window() throws IOException, InterruptedException {
		screenShot("C:\\Users\\Emman\\eclipse-workspace\\Sample\\Screenshot+ss3");
	    Thread.sleep(2000);
	    closeWindow();
	}

	@When("launch the URL of the ShopDot application and complete the loginFlow")
	public void launch_the_url_of_the_shop_dot_application_and_complete_the_login_flow() throws InterruptedException {
		driver.get("http://52.36.76.186/sign-up");
		driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);

       
      	
		driver.findElement(By.xpath("(//input[@type='text'])[1]")).sendKeys("Test");
		driver.findElement(By.xpath("(//input[@type='text'])[2]")).sendKeys("Test1");
		driver.findElement(By.xpath("(//input[@type='text'])[3]")).sendKeys("shopedot65837@yopmail.com");
		driver.findElement(By.name("password")).sendKeys("Welcome6@123");
		
		driver.findElement(By.xpath("//small[contains(text(),'signing')]")).click();
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
		   driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	        
	        driver.findElement(By.xpath("//h3[text()='BRAND Supplier']")).click();
	        driver.findElement(By.xpath("//button[normalize-space()='Next']")).click();
	        Thread.sleep(2000);
	        driver.findElement(By.xpath("(//a[text()='Settings'])[2]")).click();
	}

	@When("User Click on the Security menu from Settings Page")
	public void user_click_on_the_security_menu_from_settings_page() throws InterruptedException {
		Thread.sleep(2000);
        driver.findElement(By.xpath("//a[normalize-space()='Security']")).click();
	}

	@When("User enters the required Data in {string} in the Change Password Field")
	public void user_enters_the_Required_data_in_in_the_change_password_field(String string10) {
	    sendText(s.getOldPassword(), string10);
	}

	@When("User enters the Data which is not met the requirement in {string} in the Change Password Field")
	public void user_enters_the_data_which_is_not_met_the_requirement_in_in_the_change_password_field(String string11) {
	    sendText(s.getOldPassword(), string11);
	}

	@When("User enters the  required Data in {string} in the Change password Field")
	public void user_enters_the_required_data_in_in_the_change_password_field(String string12) {
	    sendText(s.getConfirmPassword(), string12);
	}

	@When("then the User Click on the Save button")
	public void then_the_user_click_on_the_save_button() {
		driver.findElement(By.xpath("(//button[@type='submit'])[2]")).click();
	}

	@Then("Error Message Display New Password requirements not met and Close the Window")
	public void error_message_display_new_password_requirements_not_met_and_close_the_window() throws IOException, InterruptedException {
		screenShot("C:\\Users\\Emman\\eclipse-workspace\\Sample\\Screenshot+ss4");
	    Thread.sleep(2000);
	    closeWindow();
	}

}
