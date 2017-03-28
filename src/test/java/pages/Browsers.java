package pages;

//import java.util.*;
//import static org.junit.Assert.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Browsers {

//    java.io.InputStream is;
//    java.util.Properties p;
    private WebDriver browser = null;
    private String BROWSER_CHROME_PATH = System.getProperty("user.dir") + "/browsers/chromedriver.exe";
    private String BROWSER_FIREFOX_PATH = System.getProperty("user.dir") + "/browsers/geckodriver.exe";

    public Browsers() {

        // Get Browser Type from pom.xml
//        is = this.getClass().getResourceAsStream("my.properties");
//        p = new Properties();
//        try {
//        		p.load(is); 
//          } catch (Exception e) { 
//        	  fail("Unable to load POM Properties"); 
//          }
        System.setProperty("webdriver.chrome.driver", BROWSER_CHROME_PATH);
        System.setProperty("webdriver.gecko.driver", BROWSER_FIREFOX_PATH);
    }

    public WebDriver open() {

        // Set Browser Type to use for tests
        browser = new ChromeDriver();
        browser.manage().window().maximize();
        browser.navigate().to("http://staging-reservations.directwithhotels.com/reservation/selectDates/17371/0/0/0/0/0/en");
        return browser;
    }

}