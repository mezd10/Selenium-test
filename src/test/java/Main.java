import AuthLitecart.Authorization;
import FirstTest.FirstTests;
import Task10.CheckProductPage;
import Task7.CorrectionSearchElement;
import Task7.SearchElement;
import Task8.InitialDriver;
import Task8.SearchLabel;
import Task9.CheckCountries;
import Task9.CheckGeoZone;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Main {

    private FirstTests firstTests;
    private Authorization authorization;
    private InitialDriver initialDriver;


    public Main() {
        firstTests = new FirstTests();
        authorization = new Authorization();
        initialDriver = new InitialDriver();
    }

    @Test
    public void myFirstTest() {
        firstTests.start();
        firstTests.myFirstTest();
        firstTests.stop();
    }

    @Test
    public void authorizationLiteCart() {
        authorization.start();
        authorization.authorization();
        authorization.stop();
    }
//тест к 7 заданию(поиск всех боковых элементов)
    @Test
    public void search()  {
        authorization.start();
        authorization.authorization();
        CorrectionSearchElement correctionSearchElement = new CorrectionSearchElement(authorization.gerDriver());
        correctionSearchElement.checkElement();
        authorization.stop();
    }
//тест к заданию 8(проверить, что у всех товаров есть стикеры)
    @Test
    public void checkLabel() throws Exception {
        initialDriver.start();
        initialDriver.transition();
        SearchLabel searchLabel = new SearchLabel(initialDriver.gerDriver());
        searchLabel.checkLabel();
        initialDriver.stop();
    }

    //тест к 9 заданию
    @Test
    public void test9() {
        authorization.start();
        authorization.authorization();
        CheckCountries checkCountries = new CheckCountries(authorization.gerDriver());
        checkCountries.check();
        authorization.stop();
    }

    @Test
    public void test9_2() {
        authorization.start();
        authorization.authorization();
        CheckGeoZone checkGeoZone = new CheckGeoZone(authorization.gerDriver());
        checkGeoZone.check();
        authorization.stop();
    }

    @Test
    public void test10() {
        initialDriver.start();
        initialDriver.transition();
        CheckProductPage checkProductPage = new CheckProductPage(initialDriver.gerDriver());
        checkProductPage.checkProductName();
        checkProductPage.checkProductPrice();
        checkProductPage.checkColorPrice();
        checkProductPage.checkSizePrice();
        initialDriver.stop();
    }
}
