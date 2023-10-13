package pages;

public class SauceDemoPage extends BasePage {
    public SauceDemoPage (){
        super(driver);
    }
    
    public void navigateToSauce(){
        navigateTo("https://www.saucedemo.com/v1/index.html");

    }
}
