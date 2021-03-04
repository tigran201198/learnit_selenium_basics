package components.impl;

import components.WebComponent;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class SearchResultItemComponent extends WebComponent {

    private static final By TITLE_SELECTOR = By.cssSelector(".v-align-middle");
    private static final By DESCRIPTION_SELECTOR = By.cssSelector(".mb-1");

    public SearchResultItemComponent(WebElement rootElement) {
        super(rootElement);
    }

    public boolean containsSearchPhrase(String searchPhrase) {
        return containsTextIgnoringCase(searchPhrase, TITLE_SELECTOR) || containsTextIgnoringCase(searchPhrase, DESCRIPTION_SELECTOR);
    }

    private boolean containsTextIgnoringCase(String searchPhrase, By selector) {
        return findElement(selector).getText().toLowerCase().contains(searchPhrase);
    }
}
