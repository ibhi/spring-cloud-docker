package in.noobish.edgerouter;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@EnableZuulProxy
@EnableDiscoveryClient
@SpringBootApplication
public class EdgeRouterApplication {
	public static void main(String[] args) {
		SpringApplication.run(EdgeRouterApplication.class, args);
	}
}
