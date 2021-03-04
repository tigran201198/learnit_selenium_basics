package components.impl;

import components.WebComponent;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

public class    SearchComponent extends WebComponent {

    public SearchComponent(WebElement rootElement) {
        super(rootElement);
    }

    public void performSearch(String searchPhrase) {
        sendKeys(searchPhrase);
        sendKeys(Keys.ENTER);
    }
}
