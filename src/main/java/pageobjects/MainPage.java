package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MainPage {

    private final WebDriver driver;

    @FindBy(name="address")
    private WebElement txtAddress;

    @FindBy(name="optional")
    private WebElement txtOptional;

    @FindBy(id="search")
    private WebElement btnSearch;

    @FindBy(id="confirm")
    private WebElement btnConfirm;

    private final String url="https://www.pedidosya.com.uy/";
    private final String address="Santos 185";
    private final String optional="";

    public MainPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }

    public String getURL(){
        return url;
    }

    public String getADDRESS(){
        return address;
    }

    public String getOPTIONAL(){
        return optional;
    }

    public boolean confirmElementIsDisplayed(){
        return btnConfirm.isDisplayed();
    }

    public void Search(String address, String optional) throws InterruptedException {
        if(address!=null){
            txtAddress.sendKeys(address);
        }

        if(optional!=null){
            txtOptional.sendKeys(optional);
        }

        btnSearch.click();

        Thread.sleep(2000); //PREGUNTAR POR ESTE WAIT
        if(confirmElementIsDisplayed()){
            btnConfirm.click();
        }
    }
}
