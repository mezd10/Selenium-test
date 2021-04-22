package Task8;

import jdk.nashorn.internal.objects.annotations.Getter;
import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class InitialDriver {

    private WebDriver driver;

    @Before
    public void start() {
        driver = new FirefoxDriver();
        //driver = new ChromeDriver();
    }

    public void transition() {
        driver.navigate().to("http://localhost/litecart/en/");
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
