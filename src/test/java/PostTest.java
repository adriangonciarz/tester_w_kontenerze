import groovy.transform.ASTTest;
import models.PostModel;
import org.testng.annotations.Test;

import static com.jayway.restassured.RestAssured.given;

public class PostTest extends RestTestBase {
    @Test
    public void createNewPost(){
        PostModel post = new PostModel().populateMinimum();
        given().
            contentType("application/json").
            body(post).log().all().
        when().
            post("/posts").
        then().
            log().all();
    }
}
