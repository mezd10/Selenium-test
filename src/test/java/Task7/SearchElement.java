package Task7;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

import static org.openqa.selenium.support.ui.ExpectedConditions.presenceOfElementLocated;

public class SearchElement {

    private WebDriver driver;
    private WebDriverWait wait;
    private List<WebElement> elements;

    public SearchElement(WebDriver driver) {
        this.driver = driver;
        wait = new WebDriverWait(driver, 10);
    }

    public void checkAppearence() {
        driver.findElement(By.xpath("//*[text() = 'Appearence']")).click();
        wait.until(presenceOfElementLocated(By.cssSelector("[name='template_form']")));

        driver.findElement(By.xpath("//*[text() = 'Logotype']")).click();
        wait.until(presenceOfElementLocated(By.cssSelector("[name='logotype_form']")));
    }

    public void checkCatalog() {
        driver.findElement(By.xpath("//*[text() = 'Catalog']")).click();
        wait.until(presenceOfElementLocated(By.cssSelector("[name='catalog_form']")));

        driver.findElement(By.xpath("//*[text() = 'Product Groups']")).click();
        wait.until(presenceOfElementLocated(By.cssSelector("[name='product_groups_form']")));

        driver.findElement(By.xpath("//*[text() = 'Option Groups']")).click();
        wait.until(presenceOfElementLocated(By.cssSelector("[name='option_groups_form']")));

        driver.findElement(By.xpath("//*[text() = 'Manufacturers']")).click();
        wait.until(presenceOfElementLocated(By.cssSelector("[name='manufacturers_form']")));

        driver.findElement(By.xpath("//*[text() = 'Delivery Statuses']")).click();
        wait.until(presenceOfElementLocated(By.cssSelector("[name='delivery_statuses_form']")));

        driver.findElement(By.xpath("//*[text() = 'Sold Out Statuses']")).click();
        wait.until(presenceOfElementLocated(By.cssSelector("[name='sold_out_statuses_form']")));

        driver.findElement(By.xpath("//*[text() = 'Quantity Units']")).click();
        wait.until(presenceOfElementLocated(By.cssSelector("[name='quantity_units_form']")));

        driver.findElement(By.xpath("//*[text() = 'CSV Import/Export']")).click();
        wait.until(presenceOfElementLocated(By.cssSelector("[name='import_categories_form']")));
    }

    public void checkCountries() {
        driver.findElement(By.xpath("//*[text() = 'Countries']")).click();
        wait.until(presenceOfElementLocated(By.cssSelector("[name='countries_form']")));
    }

    public void checkCurrencies() {
        driver.findElement(By.xpath("//*[text() = 'Currencies']")).click();
        wait.until(presenceOfElementLocated(By.cssSelector("[name='currencies_form']")));
    }

    public void checkCustomers() {
        driver.findElement(By.xpath("//*[text() = 'Customers']")).click();
        wait.until(presenceOfElementLocated(By.cssSelector("[name='customers_form']")));

        driver.findElement(By.xpath("//*[text() = 'CSV Import/Export']")).click();
        wait.until(presenceOfElementLocated(By.cssSelector("[name='import_form']")));

        driver.findElement(By.xpath("//*[text() = 'Newsletter']")).click();
        wait.until(presenceOfElementLocated(By.cssSelector("[name='subscribers']")));
    }

    public void checkGeoZones() {
        driver.findElement(By.xpath("//*[text() = 'Geo Zones']")).click();
        wait.until(presenceOfElementLocated(By.cssSelector("[name='geo_zones_form']")));
    }

    public void checkLanguages() {
        driver.findElement(By.xpath("//*[text() = 'Languages']")).click();
        wait.until(presenceOfElementLocated(By.cssSelector("[name='languages_form']")));

        driver.findElement(By.xpath("//*[text() = 'Storage Encoding']")).click();
        wait.until(presenceOfElementLocated(By.cssSelector("h1")));
    }

    public void checkModules(){
        driver.findElement(By.xpath("//*[text() = 'Modules']")).click();
        wait.until(presenceOfElementLocated(By.cssSelector("[name='modules_form']")));

        driver.findElement(By.xpath("//*[text() = 'Customer']")).click();
        wait.until(presenceOfElementLocated(By.cssSelector("[name='modules_form']")));

        driver.findElement(By.xpath("//*[text() = 'Shipping']")).click();
        wait.until(presenceOfElementLocated(By.cssSelector("[name='modules_form']")));

        driver.findElement(By.xpath("//*[text() = 'Payment']")).click();
        wait.until(presenceOfElementLocated(By.cssSelector("[name='modules_form']")));

        driver.findElement(By.xpath("//*[text() = 'Order Total']")).click();
        wait.until(presenceOfElementLocated(By.cssSelector("[name='modules_form']")));

        driver.findElement(By.xpath("//*[text() = 'Order Success']")).click();
        wait.until(presenceOfElementLocated(By.cssSelector("[name='modules_form']")));

        driver.findElement(By.xpath("//*[text() = 'Order Action']")).click();
        wait.until(presenceOfElementLocated(By.cssSelector("[name='modules_form']")));
    }

    public void checkOrders() {
        driver.findElement(By.xpath("//*[text() = 'Orders']")).click();
        wait.until(presenceOfElementLocated(By.cssSelector("[name='orders_form']")));

        driver.findElement(By.xpath("//*[text() = 'Order Statuses']")).click();
        wait.until(presenceOfElementLocated(By.cssSelector("[name='order_statuses_form']")));
    }

    public void checkPages() {
        driver.findElement(By.xpath("//*[text() = 'Pages']")).click();
        wait.until(presenceOfElementLocated(By.cssSelector("[name='pages_form']")));
    }

    public void checkReports() {
        driver.findElement(By.xpath("//*[text() = 'Reports']")).click();
        wait.until(presenceOfElementLocated(By.cssSelector("h1")));

        driver.findElement(By.xpath("//*[text() = 'Most Sold Products']")).click();
        wait.until(presenceOfElementLocated(By.cssSelector("h1")));

        driver.findElement(By.xpath("//*[text() = 'Most Shopping Customers']")).click();
        wait.until(presenceOfElementLocated(By.cssSelector("h1")));
    }

    public void checkSettings() {
        driver.findElement(By.xpath("//*[text() = 'Settings']")).click();
        wait.until(presenceOfElementLocated(By.cssSelector("h1")));

        driver.findElement(By.xpath("//*[text() = 'Defaults']")).click();
        wait.until(presenceOfElementLocated(By.cssSelector("h1")));

        driver.findElement(By.xpath("//*[text() = 'General']")).click();
        wait.until(presenceOfElementLocated(By.cssSelector("h1")));

        driver.findElement(By.xpath("//*[text() = 'Listings']")).click();
        wait.until(presenceOfElementLocated(By.cssSelector("h1")));

        driver.findElement(By.xpath("//*[text() = 'Images']")).click();
        wait.until(presenceOfElementLocated(By.cssSelector("h1")));

        driver.findElement(By.xpath("//*[text() = 'Checkout']")).click();
        wait.until(presenceOfElementLocated(By.cssSelector("h1")));

        driver.findElement(By.xpath("//*[text() = 'Advanced']")).click();
        wait.until(presenceOfElementLocated(By.cssSelector("h1")));

        driver.findElement(By.xpath("//*[text() = 'Security']")).click();
        wait.until(presenceOfElementLocated(By.cssSelector("h1")));
    }

    public void checkSlides() {
        driver.findElement(By.xpath("//*[text() = 'Slides']")).click();
        wait.until(presenceOfElementLocated(By.cssSelector("h1")));
    }

    public void checkTax() {
        driver.findElement(By.xpath("//*[text() = 'Tax']")).click();
        wait.until(presenceOfElementLocated(By.cssSelector("[name='tax_classs_form']")));

        driver.findElement(By.xpath("//*[text() = 'Tax Rates']")).click();
        wait.until(presenceOfElementLocated(By.cssSelector("[name='tax_rates_form']")));
    }

    public void checkTranslation() {
        driver.findElement(By.xpath("//*[text() = 'Translations']")).click();
        wait.until(presenceOfElementLocated(By.cssSelector("[name='translation_form']")));

        driver.findElement(By.xpath("//*[text() = 'Scan Files']")).click();
        wait.until(presenceOfElementLocated(By.cssSelector("[name='scan_form']")));

        driver.findElement(By.xpath("//*[text() = 'CSV Import/Export']")).click();
        wait.until(presenceOfElementLocated(By.cssSelector("[name='export_form']")));
    }

    public void checkUsers() {
        driver.findElement(By.xpath("//*[text() = 'Users']")).click();
        wait.until(presenceOfElementLocated(By.cssSelector("[name='users_form']")));
    }

    public void checkvQmods() {
        driver.findElement(By.xpath("//*[text() = 'vQmods']")).click();
        wait.until(presenceOfElementLocated(By.cssSelector("[name='vqmods_form']")));
    }
 }
