package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.Iterator;
import java.util.List;

public class ResultPage {
    private final WebDriver driver;

    public ResultPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }

    @FindBy(xpath = "//h1[@itemprop='name']")
    private WebElement lblName;

    @FindBy(xpath = "//ul[@class='review_list']")
    private List<WebElement> rating;

    public void showBusinessInfo(){
        System.out.println(lblName.getText()+"\n");
        Iterator<WebElement> itr = rating.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next().getText());
        }
    }
}
