import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pageobjects.AfterSearchPage;
import pageobjects.MainPage;
import pageobjects.ResultPage;

public class PedidosYa extends Base{

    private MainPage mainPage;
    private AfterSearchPage afterSearchPage;
    private ResultPage resultPage;

    @BeforeTest
    public void Initialize(){
        driver=initializeDriver();
        mainPage = new MainPage(driver);
        afterSearchPage = new AfterSearchPage(driver);
        resultPage = new ResultPage(driver);
    }

    @BeforeMethod
    public void beforeMethod() throws InterruptedException {
        driver.get(mainPage.getURL());
        mainPage.Search(mainPage.getADDRESS(), mainPage.getOPTIONAL());
    }

    @Test
    public void completeFlow() {
        afterSearchPage.getResultNumber();
        afterSearchPage.applyFilter();
        afterSearchPage.getResultNumber();
        afterSearchPage.goToFirstResult();
        resultPage.showBusinessInfo();
    }

    @AfterTest
    public void closeDriver() throws InterruptedException {
        Thread.sleep(5000);
        driver.close();
    }
}
