import AuthLitecart.Authorization;
import FirstTest.FirstTests;
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
}
