package components.impl;

import components.WebComponent;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class SearchResultItemComponent extends WebComponent {

    private static final By TITLE_SELECTOR = By.cssSelector("h2 .a-link-normal");

    public SearchResultItemComponent(WebElement rootElement) {
        super(rootElement);
    }

    public boolean containsSearchPhrase(String searchPhrase) {
        WebElement title = findElement(TITLE_SELECTOR);
        return containsText(title.getText(), searchPhrase) || containsText(title.getAttribute("href"), searchPhrase);
    }

    private boolean containsText(String text, String searchPhrase) {
        return text.toLowerCase().contains(searchPhrase);
    }
}
