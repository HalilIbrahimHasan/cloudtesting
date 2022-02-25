import io.github.bonigarcia.wdm.WebDriverManager;
import io.restassured.response.Response;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

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


    @Test
    public void OpenBrowser()  {
        WebDriver driver;
        WebDriverManager.chromedriver().setup();
        ChromeOptions options = new ChromeOptions();
        options.addArguments("headless");
        options.addArguments("disable-gpu");
        driver = new ChromeDriver(options);
        driver.manage().deleteAllCookies();
        driver.get("https://www.amazon.com");
        System.out.println("Title of the page is: " + driver.getTitle());
        Assert.assertTrue("This page is unexpected!",driver.getTitle().contains("Amazon"));
        System.out.println("we have a successful path that will allow executions");
        System.out.println("Medunna project was nice with you");

    }



}
