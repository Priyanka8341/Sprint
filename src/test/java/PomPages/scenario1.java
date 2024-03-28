package PomPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class scenario1 {
		WebDriver driver;

	    public scenario1(WebDriver driver){
	        this.driver=driver;
	        PageFactory.initElements( driver, this);
	    }
	    @FindBy(xpath="//a[contains(text(),'Property Services' )and @class='mb-header__sub__tabs__link js-menu-link']")
	    WebElement name;
	    @FindBy(xpath="//span[@class='badge']/ancestor::a[@target='_blank' and contains(text(),'Rent Agreement')]")
	    WebElement rentAgreement;
	    public void name1(){
	        name.click();
	    }
	    public void rentagree(){
	        rentAgreement.click();
	    }

}
