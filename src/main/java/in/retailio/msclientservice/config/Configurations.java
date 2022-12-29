package in.retailio.msclientservice.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Configuration
@ConfigurationProperties(prefix = "app.config")
@EnableConfigurationProperties
@Data
public class Configurations {
    String configA;
    String configB;
    String configC;
    String configD;

}
