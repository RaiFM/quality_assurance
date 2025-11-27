package api;

import org.junit.jupiter.api.Test;
import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

public class TesteUsuarioApi {

    @Test
    void deveRetornarUsuario() {
        given()
            .baseUri("https://api.example.com")
        .when()
            .get("/users/1")
        .then()
            .statusCode(200)
            .body("name", equalTo("John Doe"));
    }
}
