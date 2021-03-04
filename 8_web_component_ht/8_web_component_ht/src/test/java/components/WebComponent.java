package components;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class WebComponent {

    private WebElement rootElement;

    protected WebComponent(WebElement rootElement) {
        this.rootElement = rootElement;
    }

    protected WebElement findElement(By bySelector) {
        return rootElement.findElement(bySelector);
    }

    public void sendKeys(CharSequence... keysToSend) {
        rootElement.sendKeys(keysToSend);
    }

    public String getText() {
        return rootElement.getText();
    }
}
