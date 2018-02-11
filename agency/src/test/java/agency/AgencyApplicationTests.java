//package agency;
//
//import org.junit.AfterClass;
//import org.junit.BeforeClass;
//import org.junit.Test;
//import org.junit.runner.RunWith;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.SpringApplication;
//import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
//import org.springframework.boot.context.embedded.LocalServerPort;
//import org.springframework.boot.test.context.SpringBootTest;
//import org.springframework.boot.test.web.client.TestRestTemplate;
//import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
//import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;
//import org.springframework.context.ConfigurableApplicationContext;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.http.HttpStatus;
//import org.springframework.http.ResponseEntity;
//import org.springframework.test.context.ActiveProfiles;
//import org.springframework.test.context.junit4.SpringRunner;
//import org.springframework.web.bind.annotation.RequestMapping;
//
//import java.util.Arrays;
//import java.util.List;
//import java.util.Random;
//
//import static org.assertj.core.api.BDDAssertions.then;
//
///**
// * @author Marcin Grzejszczak
// */
//@RunWith(SpringRunner.class)
//@SpringBootTest(classes = AgencyApplication.class, webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
//@ActiveProfiles("test")
//public class AgencyApplicationTests {
//
//    static ConfigurableApplicationContext eurekaServer;
//    static ConfigurableApplicationContext companyApplication;
//
//    @BeforeClass
//    public static void startEureka() {
//        eurekaServer = SpringApplication.run(EurekaServer.class,
//                "--server.port=8761",
//                "--eureka.instance.leaseRenewalIntervalInSeconds=1");
//        companyApplication = SpringApplication.run(CompanyApplication.class, "--server.port=9001 --spring.application.name=company");
//    }
//
//    @AfterClass
//    public static void closeEureka() {
//        eurekaServer.close();
//        companyApplication.close();
//    }
//
//    @LocalServerPort
//    private int port;
//
//    @Autowired
//    private TestRestTemplate testRestTemplate;
//
//    @Test
//    public void shouldRegisterClientInEurekaServer() throws InterruptedException {
//        // registration has to take place...
//        Thread.sleep(3000);
//
//        ResponseEntity<String> response = this.testRestTemplate.getForEntity("http://localhost:" + this.port , String.class);
//
//        then(response.getStatusCode()).isEqualTo(HttpStatus.OK);
//        then(response.getBody()).contains("Your guide will be:");
//    }
//
//    @Configuration
//    @EnableAutoConfiguration
//    @EnableEurekaServer
//    static class EurekaServer {
//    }
//
//    @Configuration
//    @EnableAutoConfiguration
//    @EnableDiscoveryClient
//    static class CompanyApplication {
//        @RequestMapping("/available")
//        public String available() {
//            return "Melchior";
//        }
//    }
//}
