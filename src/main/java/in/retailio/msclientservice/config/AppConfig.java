package in.retailio.msclientservice.config;

import in.retailio.msclientservice.Service.FooFormatter;
import in.retailio.msclientservice.Service.IFormatter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.annotation.Resource;

@Configuration
public class AppConfig {

    @Bean
    IFormatter getFormatter(){
        return new FooFormatter();
    }
}
