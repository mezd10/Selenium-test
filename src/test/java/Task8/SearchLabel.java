package Task8;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;


import java.util.List;

import static org.openqa.selenium.support.ui.ExpectedConditions.presenceOfElementLocated;

public class SearchLabel {

    private WebDriver driver;
    private WebDriverWait wait;

    public SearchLabel(WebDriver driver) {
        this.driver = driver;
        wait = new WebDriverWait(driver, 10);
    }

    private int getAllDucks() {
        driver.findElement(By.cssSelector(".list-vertical>[class='category-1']>a")).click();
        wait.until(presenceOfElementLocated(By.cssSelector("[title='Subcategory']")));
        return driver.findElements(By.cssSelector("[class='listing-wrapper products']> li")).size();
    }

    public void checkLabel() throws Exception {

        int ducks = getAllDucks();
        List<WebElement> labels;

        for (int i = 1; i <= ducks; i++) {

            labels = driver.findElements(By.cssSelector
                    ("[class='listing-wrapper products']> li:nth-of-type("+i+") [class*='sticker']"));

            if (labels.size() != 1) {
                throw new Exception("Labels incorrect");
            }
        }
    }
}
