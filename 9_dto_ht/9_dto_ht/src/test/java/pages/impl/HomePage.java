package pages.impl;

import components.impl.SearchComponent;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import pages.WebPage;

public class HomePage extends WebPage {

    private static final By SEARCH_COMPONENT_SELECTOR = By.cssSelector("#twotabsearchtextbox");

    public HomePage(WebDriver driver) {
        super(driver);
    }

    public SearchComponent searchComponent() {
        return new SearchComponent(findElement(SEARCH_COMPONENT_SELECTOR));
    }
}
