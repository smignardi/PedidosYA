package dataprovider;

import org.testng.annotations.DataProvider;

public class MainPageDataProvider {

    @DataProvider(name = "fill fields")
    public Object[][] correctFields() {
        return new Object[][]{
                {"Santos 185", "Pizza"}
        };
    }

}
