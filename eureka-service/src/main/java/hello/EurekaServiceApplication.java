package hello;

import com.netflix.appinfo.AmazonInfo;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.commons.util.InetUtils;
import org.springframework.cloud.netflix.eureka.EurekaInstanceConfigBean;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Profile;

@EnableEurekaServer
@SpringBootApplication
public class EurekaServiceApplication {

//    private static final Logger logger = LoggerFactory.getLogger(EurekaServiceApplication.class);
//
//    @Value("${server.port:8761}")
//    private int port;

    public static void main(String[] args) {
        SpringApplication.run(EurekaServiceApplication.class, args);
    }

//    @Bean
//    @Autowired
//    @Profile("aws")
//    public EurekaInstanceConfigBean eurekaInstanceConfigBean(InetUtils inetUtils) {
//        logger.info("*** Inside eurekaInstanceConfigBean ***");
//        EurekaInstanceConfigBean config = new EurekaInstanceConfigBean(inetUtils);
//        AmazonInfo info = AmazonInfo.Builder.newBuilder().autoBuild("eureka");
//        config.setHostname(info.get(AmazonInfo.MetaDataKey.publicHostname));
//        config.setIpAddress(info.get(AmazonInfo.MetaDataKey.publicIpv4));
//        logger.info("*** LOCAL HOSTNAME: {}", info.get(AmazonInfo.MetaDataKey.localHostname));
//        logger.info("*** LOCAL IP: {}", info.get(AmazonInfo.MetaDataKey.localIpv4));
//        logger.info("*** PUBLIC HOSTNAME: {}", info.get(AmazonInfo.MetaDataKey.publicHostname));
//        logger.info("*** PUBLIC IP: {}", info.get(AmazonInfo.MetaDataKey.publicIpv4));
//        config.setNonSecurePort(port);
//        config.setDataCenterInfo(info);
//        return config;
//    }
}
