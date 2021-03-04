import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;
import java.util.stream.Collectors;

public class SeleniumRunner {

    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://www.amazon.com/");

        WebElement searchInput = driver.findElement(By.cssSelector("#twotabsearchtextbox"));

        String searchPhrase = "iphone";

        searchInput.sendKeys(searchPhrase);
        searchInput.sendKeys(Keys.ENTER);

        List<String> actualItems = driver.findElements(By.cssSelector("[data-component-type='s-search-result'] h2 .a-link-normal"))
                .stream()
                .map(element -> element.getText().toLowerCase() + element.getAttribute("href").toLowerCase())
                .collect(Collectors.toList());
        List<String> expectedItems = actualItems.stream()
                .filter(item -> item.contains(searchPhrase))
                .collect(Collectors.toList());

        Assert.assertEquals(expectedItems, actualItems);

        driver.quit();
    }
}
