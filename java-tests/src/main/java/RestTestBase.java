import com.jayway.restassured.RestAssured;

import java.util.Properties;

public class RestTestBase {
    /*
    Please keep in mind that is very dumb, improper properties management only for the sake of demo simplicity.
    In real life examples we should NEVER EVER handle property management this way.
    There should be a proper (possibly singleton) class for handling configuration
    */
    private static Properties SYSTEM_PROPERTIES = System.getProperties();

    public RestTestBase() {
        try {
            RestAssured.baseURI = getApiEndpoint();
            RestAssured.port = getApiPort();
        } catch (Exception e){
            System.err.println("Exception:" + e.getMessage());
        }
    }

    private String getApiEndpoint() {
        return SYSTEM_PROPERTIES.getProperty("api.endpoint");
    }

    private int getApiPort(){
        return Integer.valueOf(SYSTEM_PROPERTIES.getProperty("api.port"));
    }
}
