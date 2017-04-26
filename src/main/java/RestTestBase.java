import com.jayway.restassured.RestAssured;
import utils.PropertiesManager;

/**
 * Created by adriangonciarz on 21.04.2017.
 */
public class RestTestBase {
    public static PropertiesManager CONFIG = PropertiesManager.getInstance();

    public RestTestBase() {
        RestAssured.baseURI = CONFIG.getApiEndpoint();
        RestAssured.port = CONFIG.getApiPort();
    }
}
