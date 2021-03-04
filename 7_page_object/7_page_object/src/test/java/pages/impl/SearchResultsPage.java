package pages.impl;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.WebPage;

import java.util.List;
import java.util.stream.Collectors;

public class SearchResultsPage extends WebPage {

    @FindBy(css = ".repo-list-item")
    private List<WebElement> searchResultsItems;

    public SearchResultsPage(WebDriver driver) {
        super(driver);
    }

    public List<String> searchResultsItemsText() {
        return searchResultsItems.stream()
                .map(element -> element.getText().toLowerCase())
                .collect(Collectors.toList());
    }

    public List<String> searchResultsItemsWithText(String searchText) {
        return searchResultsItemsText().stream()
                .filter(item -> item.contains(searchText))
                .collect(Collectors.toList());
    }
}
