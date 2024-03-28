package PomPages;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import org.openqa.selenium.support.ui.ExpectedConditions;

public class scenario4 {
	WebDriver driver;

    public scenario4(WebDriver driver){
        this.driver=driver;
        PageFactory.initElements( driver, this);
    }
    @FindBy(id="tenant")
    WebElement tenant;
    @FindBy(id="tenantAddress")
  //@FindBy(xpath="//*[@id='tenantAddress']")
   // @FindBy(xpath="/html/body/div/div/div/div[2]/div[2]/div[1]/div/div[2]/div/div[2]/div[4]/div/div/input")
   // @FindBy(xpath="/html/body/div/div/div/div[2]/div[2]/div[1]/div/div[2]/div/div[2]/div[4]/div/div/label[contains(text(),'Permanent Address')]")
    WebElement permanant;
    @FindBy(xpath="//input[@class='rental__form__row--input-text' and @id='tenantPincode']")
    WebElement pincode;
    @FindBy(id="tenantCity")
    WebElement town;
    @FindBy(id="tenantState")
    WebElement stat; 
    @FindBy(xpath="//a[@class='rental__action--btn btn-red xmedium']")
    WebElement next;
    public void basictenant() {
        tenant.click();
        JavascriptExecutor javascriptExecutor= (JavascriptExecutor) driver;
		javascriptExecutor.executeScript("window.scrollBy(0,400)");
		WebElement firstResult = new WebDriverWait(driver, Duration.ofSeconds(10))
		        .until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@class='rental__form__row--input-text' and @id='tenantAddress']")));
		//driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		//Thread.sleep(5000);
    }
	public void tenantpermanant(String pr) {
		
		permanant.sendKeys(pr);
	}
	public void tenantpin(String pin) {
		pincode.sendKeys(pin);
	}
	public void city(String cities) {
		town.sendKeys(cities);
	}
	public void state(String S) {
		stat.sendKeys(S);
	}
	public void tenantNext() {
		next.click();
	}
    
}
