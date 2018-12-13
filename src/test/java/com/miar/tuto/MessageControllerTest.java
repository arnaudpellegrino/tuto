package com.miar.tuto;

import org.hamcrest.Matchers;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import io.restassured.RestAssured;

import static io.restassured.RestAssured.get;
import static io.restassured.RestAssured.preemptive;
import static org.springframework.boot.test.context.SpringBootTest.WebEnvironment.RANDOM_PORT;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = { TutoApplication.class }, webEnvironment = RANDOM_PORT)
public class MessageControllerTest {

	  @Value("${local.server.port}")
	  private int port;

	  @Before
	  public void setUp() {
	    RestAssured.authentication = preemptive().basic("testuser", "test123");
	  }

	  @Test
	  public void shouldSayHello() {
		  
		String url_test = "http://localhost:" + port + "/miar/hello";   
		System.out.println("URL = " + url_test);  
	    get(url_test)
	      .then()
	      .assertThat()
	      .statusCode(200)
	      .body("firstname", Matchers.equalTo("Bernardo"))
	      .and()
	      .body("lastname", Matchers.equalTo("SMITH"));
	  }

}

