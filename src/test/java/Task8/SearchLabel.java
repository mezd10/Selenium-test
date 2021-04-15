package Task8;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;


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
        return driver.findElements(By.cssSelector("[class='product column shadow hover-light']")).size();
    }

    public void checkLabel() {

        int ducks = getAllDucks();

        for (int i = 1; i <= ducks; i++) {
            try {
                driver.findElement(By.cssSelector("[class='product column shadow hover-light']:nth-of-type(" + i +
                        ") [class='sticker new']"));
            } catch (org.openqa.selenium.NoSuchElementException ec) {
                driver.findElement(By.cssSelector("[class='product column shadow hover-light']:nth-of-type(" + i +
                        ") [class='sticker sale']"));
            }
        }
    }
}
