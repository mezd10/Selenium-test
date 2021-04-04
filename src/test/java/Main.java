import FirstTest.FirstTests;
import org.junit.Test;
import org.openqa.selenium.WebDriver;

public class Main {

    private FirstTests firstTests;
    public Main() {
        firstTests = new FirstTests();
    }

    @Test
    public void myFirstTest() {
        firstTests.start();
        firstTests.myFirstTest();
        firstTests.stop();
    }
}
