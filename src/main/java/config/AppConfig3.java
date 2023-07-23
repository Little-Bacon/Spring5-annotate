package config;

import example.injection.UserDAO;
import example.injection.UserDAOImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;
import org.springframework.core.io.ClassPathResource;


@Configuration
@ComponentScan("example")
public class AppConfig3 {

    @Bean
    public PropertySourcesPlaceholderConfigurer configurer(){
		PropertySourcesPlaceholderConfigurer configurer = new PropertySourcesPlaceholderConfigurer();
        configurer.setLocation(new ClassPathResource("/Proper/init.properties"));
        return configurer;
    }

}
