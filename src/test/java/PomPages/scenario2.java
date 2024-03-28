package PomPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class scenario2 {
	WebDriver driver;

    public scenario2(WebDriver driver){
        this.driver=driver;
        PageFactory.initElements( driver, this);
    }
    @FindBy(xpath="/html/body/div/div/div/div[2]/div[1]/div/div/div[2]/div[3]/a")
    WebElement getAgreement;
    @FindBy(id="owner")
    WebElement owner;
    @FindBy(xpath="//a[@class='rental__action--btn btn-red xmedium']")
    WebElement next;
    public void getfree(){
        getAgreement.click();
    }
    public void Basicowner(){
        owner.click();
    }
    public void Nextdetail(){
        next.click();
    }

}
