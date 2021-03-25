package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.Iterator;
import java.util.List;

public class AfterSearchPage {
    private final WebDriver driver;

    @FindBy(xpath = "//span[text()='Tarjeta']")
    private WebElement filterCard;

    @FindBy(xpath = "//span[@class='ranking']/i")
    private List<WebElement> results;

    @FindBy(xpath = "//section[@class='restaurantData']//a[@class='arrivalName']")
    private List<WebElement> linkResults;

    public AfterSearchPage(WebDriver driver) {
        this.driver=driver;
        PageFactory.initElements(driver,this);
    }

    public void getResultNumber(){
        Iterator<WebElement> itr = results.iterator();
        System.out.println("\n"+"Number of results: "+results.size()+"\n");
        while(itr.hasNext()){
            System.out.println(itr.next().getText());
        }
        System.out.println("\n");
    }

    public void applyFilter(){
        filterCard.click();
    }

    public void goToFirstResult(){
       for(WebElement option:results){
           option.click();
           break;
       }
    }
}
