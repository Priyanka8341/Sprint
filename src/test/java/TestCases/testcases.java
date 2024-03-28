/*
 * package TestCases;
 * 
 * import java.util.Set;
 * 
 * import org.openqa.selenium.WebDriver; import
 * org.openqa.selenium.chrome.ChromeDriver; import
 * org.openqa.selenium.chrome.ChromeOptions;
 * 
 * import PomPages.propertyServices;
 * 
 * public class testcases { public static void main(String[] args) throws
 * InterruptedException { ChromeOptions opt=new ChromeOptions();
 * opt.addArguments("--disable-notifications");
 * 
 * WebDriver driver = new ChromeDriver(opt);
 * driver.manage().window().maximize(); String website_Url =
 * "https://www.magicbricks.com/"; driver.get(website_Url); propertyServices ps=
 * new propertyServices(driver); //ps.signup(); ps.login(); ps.logging(); String
 * child_handle=""; Set<String> tab_handles = driver.getWindowHandles(); for
 * (String child:tab_handles){ child_handle= child; }
 * driver.switchTo().window(child_handle);
 * ps.mail("bonelaharipriya2001@gmail.com"); ps.Nextemail();
 * ps.password("Priya@123"); ps.log(); ps.conti();
 * //opt.addArguments("--disable-popup-blocking"); //ChromeOptions options = new
 * ChromeOptions(); opt.addArguments("--disabled-popup-blocking");
 * Thread.sleep(2000);
 * 
 * ps.name1(); ps.rentagree(); String child_handles=""; Set<String> tab_handle =
 * driver.getWindowHandles(); for (String child:tab_handle){ child_handles=
 * child; } driver.switchTo().window(child_handles);
 * 
 * ps.getfree(); ps.Basicowner(); ps.Permanantaddress("chennai");
 * ps.pincode("5000074"); ps.Cities("Chennai"); ps.states("Bangalore");
 * ps.Nextdetail(); ps.basictenant(); ps.tentAddress("chennai");
 * ps.tentContact("4536547658"); ps.tentmail("bonelaharipriya2001@gmail.com");
 * ps.tentAddress("Telangana"); ps.tentpin("657457");
 * 
 * }
 * 
 * }
 */