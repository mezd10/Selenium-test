package Task9;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.openqa.selenium.support.ui.ExpectedConditions.presenceOfElementLocated;

public class CheckGeoZone {

    private WebDriver driver;
    private WebDriverWait wait;

    public CheckGeoZone(WebDriver driver) {
        this.driver = driver;
        wait = new WebDriverWait(driver, 10);
        toGeoZone();
    }

    private void toGeoZone() {
        driver.findElement(By.xpath("//*[text()='Geo Zones']")).click();
        wait.until(presenceOfElementLocated(By.cssSelector("[name = 'geo_zones_form']")));
    }

    public void check() {
        List<WebElement> elements = driver.findElements(By.cssSelector("[name='geo_zones_form'] tr"));
        List<WebElement> innerElements;
        ArrayList<String> innerAttributeText = new ArrayList<>();
        Actions act = new Actions(driver);
        for (int i = 2; i < elements.size(); i++ ) {
            WebElement ele = driver.findElement(By.cssSelector("[name='geo_zones_form'] tr:nth-of-type("+i+") a"));
            act.moveToElement(ele).click().perform();
            wait.until(presenceOfElementLocated(By.cssSelector("[id='table-zones']")));
            innerElements = driver.findElements(By.cssSelector("[id='table-zones'] tr"));
            for (int j = 2; j < innerElements.size(); j ++) {
                List<WebElement> zone = driver.findElements(By.cssSelector(
                        "[id='table-zones'] tr:nth-of-type("+j+") [name*='zone_code'] option"));
                for (int a = 1; a < zone.size(); a++) {

                    if (zone.get(a).getAttribute("selected") != null){
                        innerAttributeText.add
                                (zone.get(a).getAttribute("text"));
                    }
                }
            }
            List<String> unsortedList = innerAttributeText;
            Collections.sort(innerAttributeText);
            assertEquals(innerAttributeText, unsortedList);
            driver.findElement(By.xpath("//*[text()='Geo Zones']")).click();
        }
    }

}
