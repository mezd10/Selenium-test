package Task7;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

import static org.openqa.selenium.support.ui.ExpectedConditions.presenceOfElementLocated;

public class CorrectionSearchElement {

    private WebDriver driver;
    private WebDriverWait wait;
    private List<WebElement> elements;
    private List<WebElement> subElements;

    public CorrectionSearchElement(WebDriver driver) {

        this.driver = driver;
        wait = new WebDriverWait(driver, 10);
    }

    public void checkElement() {
        elements = driver.findElements(By.cssSelector("#box-apps-menu>#app-"));

        for (int i = 1; i <= elements.size(); i++) {
            driver.findElement(By.cssSelector("#box-apps-menu>#app-:nth-of-type("+i+")")).click();
            wait.until(presenceOfElementLocated(By.cssSelector("h1")));
            subElements = driver.findElements(By.cssSelector
                    ("#box-apps-menu > #app-:nth-of-type("+i+") > ul > li"));
            if (subElements.size() > 1) {
                for (int j = 1; j <= subElements.size(); j ++) {
                    driver.findElement(By.cssSelector
                            ("#box-apps-menu > #app-:nth-of-type("+i+") > ul > li:nth-of-type("+j+")")).click();
                    wait.until(presenceOfElementLocated(By.cssSelector("h1")));
                }
            }
        }
    }
}
