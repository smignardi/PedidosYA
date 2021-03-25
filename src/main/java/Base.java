import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Base {
    public WebDriver driver;

    public WebDriver initializeDriver() {
        System.setProperty("webdriver.chrome.driver","/Users/stevenmignardi/Desktop/TEST OKTANA/tools/chromedriver");
        this.driver=new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        return driver;
    }
}
