package in.retailio.msclientservice.config;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.context.annotation.Configuration;

@Data
@NoArgsConstructor
@AllArgsConstructor
@RefreshScope
@Configuration
public class ConfigData {
    @Value("${configA}")
    private String configA;

    @Value("${configB}")
    private String configB;

    @Value("my name is niraj tailor")
    private String message;

    @Value("${spring.application.name}")
    private String name;
}