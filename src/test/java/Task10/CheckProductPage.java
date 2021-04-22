package Task10;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import static org.junit.Assert.*;

import static org.openqa.selenium.support.ui.ExpectedConditions.presenceOfElementLocated;

public class CheckProductPage {

    private WebDriver driver;
    private WebDriverWait wait;

    public CheckProductPage(WebDriver driver) {
        this.driver = driver;
        wait = new WebDriverWait(driver, 10);
    }

    private void toProduct() {
        driver.findElement(By.cssSelector("[id = 'box-campaigns'] li")).click();
        wait.until(presenceOfElementLocated(By.cssSelector("[id='box-product']")));
    }

    private void toMainPage() {
        driver.findElement(By.cssSelector("[title = 'Home']")).click();
        wait.until(presenceOfElementLocated(By.cssSelector("[id='slider-wrapper']")));
    }

    public void checkProductName() {
        String mainName = driver.findElement(
                By.cssSelector("[id = 'box-campaigns'] [class='name']")).getAttribute("textContent");
        toProduct();
        String pageName = driver.findElement(By.cssSelector("h1.title")).getAttribute("textContent");
        assertEquals(mainName, pageName);
        toMainPage();
    }

    public void checkProductPrice() {
        String mainPrice = driver.findElement(
                By.cssSelector("[id = 'box-campaigns'] [class='regular-price']")).getAttribute("textContent");
        String label = driver.findElement(
                By.cssSelector("[class*='sticker']")).getAttribute("textContent");
        if (label.equals("Sale")) {
            String mainSalePrice = driver.findElement(
                    By.cssSelector("[id = 'box-campaigns'] [class='campaign-price']")).getAttribute("textContent");
            toProduct();
            String pageSalePrice = driver.findElement(
                    By.cssSelector("[class = 'price-wrapper'] [class='campaign-price']")).getAttribute("textContent");
            assertEquals(mainSalePrice, pageSalePrice);
        } else {
            toProduct();
        }

        String pagePrice = driver.findElement(
                By.cssSelector("[class = 'price-wrapper'] [class='regular-price']")).getAttribute("textContent");
        assertEquals(mainPrice, pagePrice);
        toMainPage();
    }

    public void checkColorPrice() {
        String colorMainRegularPrice = driver.findElement(
                By.cssSelector("[id = 'box-campaigns'] [class='regular-price']")).getCssValue("color");
        checkColor(colorMainRegularPrice, "grey");
        String label = driver.findElement(
                By.cssSelector("[class*='sticker']")).getAttribute("textContent");
        if (label.equals("Sale")) {
            String colorMainSalePrice = driver.findElement(
                    By.cssSelector("[id = 'box-campaigns'] [class='campaign-price']")).getCssValue("color");
            checkColor(colorMainSalePrice, "red");
            toProduct();
            String colorPageSalePrice = driver.findElement(
                    By.cssSelector("[class = 'price-wrapper'] [class='campaign-price']")).getCssValue("color");
            checkColor(colorPageSalePrice, "red");
        } else {
            toProduct();
        }
        String colorPageRegularPrice = driver.findElement(
                By.cssSelector("[class = 'price-wrapper'] [class='regular-price']")).getCssValue("color");
        checkColor(colorPageRegularPrice, "grey");
        toMainPage();
    }

    private void checkColor(String color, String nameColor) {
        color = color.replaceAll("[a-zA-Z =()]+","");
        String[] parse = color.split(",");
        if (nameColor.equals("grey")) {
            assertEquals(parse[0], parse[1], parse[2]);
        }else if (nameColor.equals("red")) {
            assertEquals(parse[1], parse[2], "0");
        }
    }

    public void checkSizePrice() {
        checkSize("[id = 'box-campaigns'] [class='regular-price']",
                "[id = 'box-campaigns'] [class='campaign-price']");
        toProduct();
        checkSize("[class = 'price-wrapper'] [class='regular-price']",
                "[class = 'price-wrapper'] [class='campaign-price']");
        toMainPage();
    }

    private void checkSize(String regularWay, String saleWay) {
        String regularSize = driver.findElement(By.cssSelector(regularWay)).getCssValue("font-size");
        String saleSize = driver.findElement(By.cssSelector(saleWay)).getCssValue("font-size");
        assertTrue(Double.parseDouble(saleSize.replaceAll("px", ""))
                > Double.parseDouble(regularSize.replace("px","")));
    }
}
