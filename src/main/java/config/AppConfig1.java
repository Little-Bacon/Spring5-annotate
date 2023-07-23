package config;

import example.injection.UserDAO;
import example.injection.UserService;
import example.injection.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;


@Configuration
@Import(AppConfig2.class)
public class AppConfig1 {
    @Autowired
	private UserDAO userDAO;
    @Bean
    public UserService userService(){
        UserServiceImpl userService = new UserServiceImpl();
        return userService;
    }

}
