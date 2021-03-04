package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class WebPage {

    protected WebPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }
}
