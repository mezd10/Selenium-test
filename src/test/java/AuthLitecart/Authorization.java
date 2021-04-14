package AuthLitecart;

import jdk.nashorn.internal.objects.annotations.Getter;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.HasCapabilities;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.GeckoDriverInfo;
import org.openqa.selenium.firefox.GeckoDriverService;
import org.openqa.selenium.safari.SafariDriver;

import static org.openqa.selenium.support.ui.ExpectedConditions.presenceOfElementLocated;

public class Authorization {
    private WebDriver driver;

    @Before
    public void start() {
        //driver = new ChromeDriver();
        driver = new FirefoxDriver();
        System.out.println(((HasCapabilities) driver).getCapabilities());
    }


    public void authorization() {
        driver.navigate().to("http://localhost/litecart/admin/login.php");
        driver.findElement(By.name("username")).sendKeys("admin");
        driver.findElement(By.name("password")).sendKeys("admin");
        driver.findElement(By.name("login")).click();

    }

    public void testt(){
        driver.findElement(By.xpath("//*[@class='fa fa-home fa-lg']")).click();
    }

    @Getter
    public WebDriver gerDriver() {
        return driver;
    }

    @After
    public void stop() {
        driver.quit();
        driver = null;
    }
}
