package Extras.API;

import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;

public class Execution {
    public static void main(String[] args){
        try{
            //PostBody pb = new PostBody("eve.holt@reqres.in","cityslicka");
            //ObjectMapper ob = new ObjectMapper();
            //String data = ob.writerWithDefaultPrettyPrinter().writeValueAsString(pb);
            //System.out.println(data);

            Lombok lb = new Lombok("eve.holt@reqres.in","cityslicka");

            POJO pb =  new Builder()
                    .setEmail("eve.holt@reqres.in")
                    .setPassword("cityslicka").build();

            given().contentType(ContentType.JSON).body(lb)
                    .post("https://reqres.in/api/login")
                    .then().statusCode(200).log().all();
//            Response resp =
//            System.out.println(resp.asPrettyString());
        }
        catch (Throwable t){
            t.printStackTrace();
            System.out.println("Error Occurred :(");
        }
    }
}
