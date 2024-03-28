package stepdefinitions;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import PomPages.propertyServices;
import PomPages.scenario1;
import PomPages.scenario2;
import PomPages.scenario3;
import PomPages.scenario4;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class propertyservices {
	WebDriver driver;
	@Before 
	public void before()
	{
		    ChromeOptions opt = new ChromeOptions(); 
			opt.addArguments("--disable-notifications");
			driver = new ChromeDriver(opt);
			driver.get("https://www.magicbricks.com/");
			driver.manage().window().maximize();
	}
	@Given("I am on Magic Bricks App Login")
	public void i_am_on_magic_bricks_app_login() {
	    // Write code here that turns the phrase above into concrete actions
		propertyServices p = new propertyServices(driver);
		p.login();
		p.logging();
	}

	@When("I enter email as {string}")
	public void i_enter_email_as(String string) {
	    // Write code here that turns the phrase above into concrete actions
		propertyServices p = new propertyServices(driver);
		String child_handle="";
        Set<String> tab_handles = driver.getWindowHandles();
        for (String child:tab_handles){
            child_handle= child;
        }
        driver.switchTo().window(child_handle);
		p.mail(string);
		
	}
	@When("I click on  email next")
	public void i_click_on_email_next() {
	    // Write code here that turns the phrase above into concrete actions
		propertyServices next = new propertyServices(driver);
		next.Nextemail();
	}

	@When("I enter password as {string}")
	public void i_enter_password_as(String string) {
	    // Write code here that turns the phrase above into concrete actions
		propertyServices pw = new propertyServices(driver);
		pw.password(string);
	}

	@When("I click Login")
	public void i_click_login() {
	    // Write code here that turns the phrase above into concrete actions
		propertyServices lo = new propertyServices(driver);
		lo.log();
	}

@When("I click on Continue")
public void i_click_on_continue() {
    // Write code here that turns the phrase above into concrete actions
	propertyServices co = new propertyServices(driver);
   co.conti();
}

	@Then("I am Logged in Successfully")
	public void i_am_logged_in_successfully() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS) ;
		
		propertyServices co = new propertyServices(driver);
		co.end();
	}

	@Given("I am on MagicBricks App Logged Successfully")
	public void i_am_on_magic_bricks_app_logged_successfully() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
	}
	@Given("I am on MagicBrick  page")
	public void i_am_on_magic_brick_page() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
	}

	@When("I click on PropertyServices")
	public void i_click_on_property_services() {
	    // Write code here that turns the phrase above into concrete actions
	
	    scenario1 property =new scenario1(driver);
		property.name1();
	}

	@When("I click on Rent Agreement")
	public void i_click_on_rent_agreement() {
	    // Write code here that turns the phrase above into concrete actions
		scenario1 rent =new scenario1(driver);
		rent.rentagree();
	}

	@Then("I am on get free Rent agreement page")
	public void i_am_on_get_free_rent_agreement_page() {
	    // Write code here that turns the phrase above into concrete actions
		//propertyServices p = new propertyServices(driver);
		
	}

	@Given("I am on rent free agreement page")
	public void i_am_on_rent_free_agreement_page() {
	    // Write code here that turns the phrase above into concrete actions
	   // throw new io.cucumber.java.PendingException();
		/*
		 * JavascriptExecutor js = (JavascriptExecutor) driver;
		 * js.executeScript("window.scrollBy(0,2000)");
		 * driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS) ;
		 */
	}	

	@When("I am on get free agreement")
	public void i_am_on_get_free_agreement() {
	    // Write code here that turns the phrase above into concrete actions
		//propertyServices p = new propertyServices(driver);
		//p.getfree();
		String child_handles="";
        Set<String> tab_handle = driver.getWindowHandles();
        for (String child:tab_handle){
            child_handles= child;
        }
        driver.switchTo().window(child_handles);
		scenario2 get=new scenario2(driver);
		get.getfree();
	
		
	}

	@When("I click on owner")
	public void i_click_on_owner() {
	    // Write code here that turns the phrase above into concrete actions
		scenario2 p = new scenario2(driver);
		p.Basicowner();
	}

	@When("I click next button")
	public void i_click_next_button() {
	    // Write code here that turns the phrase above into concrete actions
		scenario2 p = new scenario2(driver);
		p.Nextdetail();
	}

	@Then("I get Invalid credentials")
	public void i_get_invalid_credentials() {
	    // Write code here that turns the phrase above into concrete actions
	   // throw new io.cucumber.java.PendingException();
	}

	@When("I click on get free agreement")
	public void i_click_on_get_free_agreement() {
	    // Write code here that turns the phrase above into concrete actions
		String child_handles="";
        Set<String> tab_handle = driver.getWindowHandles();
        for (String child:tab_handle){
            child_handles= child;
        }
        driver.switchTo().window(child_handles);
		scenario2 get= new scenario2(driver);
		get.getfree();
	}

	@When("I click on owner Basic details")
	public void i_click_on_owner_basic_details() {
	    // Write code here that turns the phrase above into concrete actions
		scenario2 p = new scenario2(driver);
		p.Basicowner();
	}

	@When("I enter address as {string}")
	public void i_enter_address_as(String string) {
	    // Write code here that turns the phrase above into concrete actions
		scenario3 p = new scenario3(driver);
		p.Permanantaddress(string);
	}

	@When("I enter pincode as {string}")
	public void i_enter_pincode_as(String string) {
	    // Write code here that turns the phrase above into concrete actions
		scenario3 p = new scenario3(driver);
		p.pincode(string);
	}

	@When("I enter city as {string}")
	public void i_enter_city_as(String x) throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions String string
		scenario3 p = new scenario3(driver);
		Thread.sleep(3000);
		p.Cities(x);
		//driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		driver.findElement(By.xpath("//li[contains(text(),'Chennai')]")).click();
    	driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
    	
	}

	@When("I enter state as {string}")
	public void i_enter_state_as(String string) {
	    // Write code here that turns the phrase above into concrete actions
		scenario3 p = new scenario3(driver);
		p.states(string);
		driver.findElement(By.xpath("//li[contains(text(),'Chhattisgarh')]")).click();
		
	}

	@When("I click on Next")
	public void i_click_on_next() {
	    // Write code here that turns the phrase above into concrete actions
		scenario3 p = new scenario3(driver);
		p.Nextdetail();
	}

	@Then("Tenent page apprears")
	public void tenent_page_apprears() {
	    // Write code here that turns the phrase above into concrete actions
		
	}
	@When("I click on tenant Basic details")
	public void i_click_on_tenant_basic_details() {
	    // Write code here that turns the phrase above into concrete actions
		scenario4 add= new scenario4(driver);
		add.basictenant();
		
		
	}
	
	@When("I enter tenant address as {string}")
	public void i_enter_tenant_address_as(String string) {
	    // Write code here that turns the phrase above into concrete actions
		
		scenario4 add = new scenario4(driver);
		add.tenantpermanant(string);
	    
	}

	@When("I enter tenant pincode as {string}")
	public void i_enter_tenant_pincode_as(String string) {
	    // Write code here that turns the phrase above into concrete actions
		scenario4 add = new scenario4(driver);
		add.tenantpin(string);
	}

	@When("I enter tenant city as {string}")
	public void i_enter_tenant_city_as(String string) {
	    // Write code here that turns the phrase above into concrete actions
		//propertyServices p = new propertyServices(driver);
		scenario4 add = new scenario4(driver);
		add.city(string);
		
	}

	@When("I enter tenant state as {string}")
	public void i_enter_tenant_state_as(String string) {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
		scenario4 add = new scenario4(driver);
		add.state(string);
	}

	@Then("the agreement will appear")
	public void the_agreement_will_appear() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
		scenario4 add= new scenario4(driver);
		add. tenantNext();
	}



}
