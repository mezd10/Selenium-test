package Task9;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import static org.junit.Assert.*;
import static org.openqa.selenium.support.ui.ExpectedConditions.presenceOfElementLocated;

public class CheckCountries {

    private WebDriver driver;
    private WebDriverWait wait;
    private ArrayList<String> list = new ArrayList<>();

    public CheckCountries(WebDriver driver) {
        this.driver = driver;
        wait = new WebDriverWait(driver, 10);
        toCountries();
    }

    private void toCountries() {
        driver.findElement(By.xpath("//*[text()= 'Countries']")).click();
        String element =  driver.findElement(By.cssSelector("h1")).getAttribute("innerText");
        assertEquals(element, " Countries");
    }

    public void check() {
        List<WebElement> elements = driver.findElements(By.cssSelector("[class='row']"));
        for (int i = 2; i <= elements.size(); i++) {
            WebElement element = driver.findElement(By.cssSelector("[class='row']:nth-of-type("+i+")"));//a
            String splitElement = element.getAttribute("innerText").split("\t")[5];
            if (!splitElement.equals("0")) {
                element = driver.findElement(By.cssSelector("[class='row']:nth-of-type("+i+") a"));
                element.click();
                wait.until(presenceOfElementLocated(By.cssSelector("[id = table-zones]")));
                List<WebElement> innerElements = driver.findElements(By.cssSelector("[id='table-zones'] tr"));
                ArrayList<String> innerList = new ArrayList<>();
                for (int j = 2; j < innerElements.size(); j++) {
                    innerList.add(driver.findElement(By.cssSelector("[id='table-zones'] tr:nth-of-type("+j+") [name*='name']")).
                            getAttribute("value"));
                }
                List<String> innerUnsortedList = innerList;
                Collections.sort(innerList);
                assertEquals(innerList, innerUnsortedList);
                driver.findElement(By.xpath("//*[text()= 'Countries']")).click();
                wait.until(presenceOfElementLocated(By.cssSelector("[name = 'countries_form']")));
            }
            list.add(driver.findElement(By.cssSelector("[class='row']:nth-of-type("+i+") a")).getAttribute("text"));
        }
        List<String> unsortedList = list;
        Collections.sort(list);
        assertEquals(list, unsortedList);
    }
}
