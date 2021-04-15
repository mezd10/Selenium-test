import AuthLitecart.Authorization;
import FirstTest.FirstTests;
import Task7.SearchElement;
import Task8.InitialDriver;
import Task8.SearchLabel;
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
        SearchElement searchElementCSS = new SearchElement(authorization.gerDriver());
        searchElementCSS.checkAppearence();
        searchElementCSS.checkCatalog();
        searchElementCSS.checkCountries();
        searchElementCSS.checkCurrencies();
        searchElementCSS.checkCustomers();
        searchElementCSS.checkGeoZones();
        searchElementCSS.checkLanguages();
        searchElementCSS.checkModules();
        searchElementCSS.checkOrders();
        searchElementCSS.checkPages();
        searchElementCSS.checkReports();
        searchElementCSS.checkSettings();
        searchElementCSS.checkSlides();
        searchElementCSS.checkTax();
        searchElementCSS.checkTranslation();
        searchElementCSS.checkUsers();
        searchElementCSS.checkvQmods();
        authorization.stop();
    }
//тест к заданию 8(проверить, что у всех товаров есть стикеры)
    @Test
    public void checkLabel() {
        initialDriver.start();
        initialDriver.transition();
        SearchLabel searchLabel = new SearchLabel(initialDriver.gerDriver());
        searchLabel.checkLabel();
        initialDriver.stop();
    }
}
