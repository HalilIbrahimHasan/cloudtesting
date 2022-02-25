import io.restassured.response.Response;
import org.junit.Test;

import static io.restassured.RestAssured.given;

public class Test1 {


    @Test
    public void get01(){

        //1.set the url
        String url = "https://restful-booker.herokuapp.com/booking/3";

        //2.Set the expected data


        //3.Send the request and get the response
        Response response  = given().when().get(url);

        response.prettyPrint();



        //Do assertions / Do validations
        //we are making "Hard Assertion"
        response.then().assertThat().statusCode(200).contentType("application/json").statusLine("HTTP/1.1 200 OK");






    }




}
