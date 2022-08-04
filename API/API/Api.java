package API;

import API.Builder.Root;
import io.restassured.http.ContentType;
import io.restassured.mapper.ObjectMapperType;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

public class Api {
    @Test
    public void getData() {
        given().contentType(ContentType.JSON).log().all()
                .when().get("https://reqres.in/api/users?page=2")
                .then().statusCode(200).log().all().extract().response().as(Root.class);
    }
//    @Test
//    public void postData() {
//        given().contentType(ContentType.JSON).body(Root.builder().name("abc").job("abc").build(), ObjectMapperType.GSON).log().body()
//                .when().post("https://reqres.in/api/users")
//                .then().log().all();
//    }
//
//    @Test
//    public void Login(){
//        b = POJO.builder().email("eve.holt@reqres.in").password("cityslicka").build();
//        Response response = given().contentType(ContentType.JSON).body(b, ObjectMapperType.GSON).log().body()
//                .when().post("https://reqres.in/api/login")
//                .then().extract().response();
//        String result = response.body().asPrettyString();
//        System.out.println(result);
//    }

//    @Test
//    public void put(){
//        POJO b = new Builder().setName("Ishav").setJob("Default").build();
//        response = given().contentType(ContentType.JSON).body(b)
//                .when().put("https://reqres.in/api/users/2")
//                .then().extract().response();
//        System.out.println(response.asPrettyString());
//    }
}
