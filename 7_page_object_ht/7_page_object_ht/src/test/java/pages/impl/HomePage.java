package pages.impl;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.WebPage;

public class HomePage extends WebPage {

    @FindBy(css = "#twotabsearchtextbox")
    private WebElement searchInput;

    public HomePage(WebDriver driver) {
        super(driver);
    }

    public void performSearch(String searchPhrase) {
        searchInput.sendKeys(searchPhrase);
        searchInput.sendKeys(Keys.ENTER);
    }
}
