package agency;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
//import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@EnableDiscoveryClient
@RestController
//@EnableCircuitBreaker
public class AgencyApplication {

    @Autowired
    TravelAgent travelAgent;

    public static void main(String[] args) {
        SpringApplication.run(AgencyApplication.class, args);
    }

    @RequestMapping("/")
    public String guide() {
        String message = travelAgent.getGuide();
        return String.format("Your guide will be: %s", message);
    }

}

