package rs.in.staleksit.template.frog.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import rs.in.staleksit.template.frog.persistence.config.PersistenceConfig;
import rs.in.staleksit.template.frog.web.config.WebAdapterConfig;

@Configuration
@Import({
        WebAdapterConfig.class,
        PersistenceConfig.class
})
public class TemplateFrogConfig {
    //~
}
