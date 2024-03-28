package PomPages;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class scenario3 {
	WebDriver driver;

    public scenario3(WebDriver driver){
        this.driver=driver;
        PageFactory.initElements( driver, this);
    }
    @FindBy(xpath="//*[@id='permanentAddress']")

    WebElement permanant; //*[@id="permanentAddress"]
    @FindBy(id="pincode")
    WebElement pin;
    @FindBy(id="city")
    WebElement city;
    @FindBy(id="state")
    WebElement st;
    @FindBy(xpath="//a[@class='rental__action--btn btn-red xmedium']")
    WebElement next;
    public void Permanantaddress(String s){
        permanant.sendKeys(s);
    }
    public void pincode(String p){
        pin.sendKeys(p);
        JavascriptExecutor javascriptExecutor= (JavascriptExecutor) driver;
		javascriptExecutor.executeScript("window.scrollBy(0,200)");
    }
    public void Cities(String x){
    	city.sendKeys(x);
    	
    	//driver.findElement(By.xpath("//*[@id='ownerCity-Error']/div[1]/ul/li[contains(text(),Chennai)")).click();
        //WebElement dropdown = driver.findElement(By.xpath("//*[@id='ownerCity-Error']/div[1]/ul/li[contains(text(), '" + option + "')]"));
		/*
		 * List<WebElement> allOptions = driver.findElements(By.xpath(
		 * "//*[@id='ownerCity-Error']/div[1]/ul/li[contains(text(),Chennai)")); String
		 * option = "Chennai"; for (int i = 0; i < allOptions.size(); i++) { if
		 * (allOptions.get(i).getText().contains(option)) { allOptions.get(i).click();
		 * System.out.println("clicked"); } break;          }
		 */
    }
    public void states(String sta){
        st.sendKeys(sta);
    }
    public void Nextdetail(){
        next.click();
    }

}
