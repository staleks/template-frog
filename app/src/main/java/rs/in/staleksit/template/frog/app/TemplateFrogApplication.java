package rs.in.staleksit.template.frog.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.Import;
import rs.in.staleksit.template.frog.config.TemplateFrogConfig;

@Import({
        TemplateFrogConfig.class
})
@SpringBootApplication
@EnableDiscoveryClient
public class TemplateFrogApplication {

    public static void main(String[] args) {
        SpringApplication.run(TemplateFrogApplication.class, args);
    }

}
