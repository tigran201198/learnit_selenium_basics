package pages.impl;

import components.impl.SearchResultItemComponent;
import entities.SearchResultItem;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import pages.WebPage;

import java.util.List;
import java.util.stream.Collectors;

public class SearchResultsPage extends WebPage {

    private static final By SEARCH_RESULT_ITEM_SELECTOR = By.cssSelector("[data-component-type='s-search-result']");

    public SearchResultsPage(WebDriver driver) {
        super(driver);
    }

    public List<SearchResultItem> searchResultsItems() {
        return searchResultItemComponents().stream()
                .map(SearchResultItemComponent::convertToSearchResultItem)
                .collect(Collectors.toList());
    }

    public List<SearchResultItem> searchResultsItemsWithText(String searchPhrase) {
        return searchResultsItems().stream()
                .filter(item -> item.getTitle().contains(searchPhrase) || item.getHrefValue().contains(searchPhrase))
                .collect(Collectors.toList());
    }

    private List<SearchResultItemComponent> searchResultItemComponents() {
        return findElements(SEARCH_RESULT_ITEM_SELECTOR).stream()
                .map(SearchResultItemComponent::new)
                .collect(Collectors.toList());
    }
}
