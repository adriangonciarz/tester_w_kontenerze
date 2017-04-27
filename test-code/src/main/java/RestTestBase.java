import com.jayway.restassured.RestAssured;
import utils.PropertiesManager;

public class RestTestBase {
    public static PropertiesManager CONFIG = PropertiesManager.getInstance();

    public RestTestBase() {
        RestAssured.baseURI = CONFIG.getApiEndpoint();
        RestAssured.port = CONFIG.getApiPort();
    }
}
