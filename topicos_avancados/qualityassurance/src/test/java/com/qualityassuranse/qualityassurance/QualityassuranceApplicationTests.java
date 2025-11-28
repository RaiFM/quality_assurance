package com.qualityassuranse.qualityassurance;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.resttestclient.TestRestTemplate;
import org.springframework.boot.resttestclient.autoconfigure.AutoConfigureTestRestTemplate;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.server.LocalServerPort;

@SpringBootTest(webEnvironment=SpringBootTest.WebEnvironment.RANDOM_PORT)
@AutoConfigureTestRestTemplate
class QualityassuranceApplicationTests {
    
    @Autowired
    public TestRestTemplate  restTest;

        
        @Test
        public void testeHelloWorld() {
            String helloWorld = restTest.getForObject("/api",  String.class);
            Assertions.assertNotNull(helloWorld);
            Assertions.assertEquals("Achou que eu tava brincando ?", helloWorld);
        }
        
        @Test
        public void createUser() {
            User newUser = new User(1L, "gabriel", Rule.ADM);
            User[] users = restTest.postForObject("/api", newUser, User[].class);
            Assertions.assertEquals(1, users.length);
            Assertions.assertEquals(newUser, users[0]);
        }

}
