import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.Matchers.hasSize;

public class ApiTest {


    @Test
    public void apitest() {
        given().when().get("http://ergast.com/api/f1/2017/circuits.json")
                .then().assertThat().statusCode(200).and().body("MRData.CircuitTable.Circuits.circuitId", hasSize(21))
                .and().header("content-length", equalTo("4552"));


    }
}
