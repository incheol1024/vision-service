package team.rest.visionservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.context.config.annotation.RefreshScope;

@SpringBootApplication
@RefreshScope
public class VisionServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(VisionServiceApplication.class, args);
    }

}
