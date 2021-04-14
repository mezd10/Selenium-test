import AuthLitecart.Authorization;
import FirstTest.FirstTests;
import Task7.SearchElement;
import org.junit.Test;

public class Main {

    private FirstTests firstTests;
    private Authorization authorization;
    public Main() {
        firstTests = new FirstTests();
        authorization = new Authorization();
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
}
