
package TERKWAZ.RestAssured;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.notNullValue;

import org.junit.Test;


public class CatFact {

  

    @Test
    
    public void  fact () {
      
        given().pathParam("firstParam", "facts").
        pathParam("secondParam", "random").
        queryParam("animal_type", "cat").
        log().all().
              
              
        when().
        
            get("https://cat-fact.herokuapp.com/{firstParam}/{secondParam}").
            
            
         then().
            
            log().all().         
           
            assertThat(). body(notNullValue()).
        assertThat().statusCode(200);
    }

 
    }
