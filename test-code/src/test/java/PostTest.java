import models.Post;
import org.junit.Test;

import static com.jayway.restassured.RestAssured.given;
import static com.jayway.restassured.RestAssured.when;
import static org.hamcrest.core.IsEqual.equalTo;

public class PostTest extends RestTestBase {
    @Test
    public void shouldGetPostWithId(){
        int id = 1;
        when().
                get("posts/" + id).
        then().
                body("id", equalTo(id));
    }

    @Test
    public void shouldCreateNewPost(){
        Post post = new Post(1, "My title", "My post body");
        given().
            contentType("application/json").
            body(post).
        when().
            post("/posts").
        then().
                log().body().
                assertThat().statusCode(201).
                body("userId", equalTo(1)).
                body("title", equalTo("My title")).
                body("body", equalTo("My post body"));
    }
}
