package components.impl;

import components.WebComponent;
import entities.SearchResultItem;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class SearchResultItemComponent extends WebComponent {

    private static final By TITLE_SELECTOR = By.cssSelector("h2 .a-link-normal");

    public SearchResultItemComponent(WebElement rootElement) {
        super(rootElement);
    }

    public SearchResultItem convertToSearchResultItem() {
        return new SearchResultItem(
                findElement(TITLE_SELECTOR).getText(),
                findElement(TITLE_SELECTOR).getAttribute("href")
        );
    }
}
