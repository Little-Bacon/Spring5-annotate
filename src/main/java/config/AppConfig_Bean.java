package config;

import example.bean.User;
import example.injection.UserDAO;
import example.injection.UserDAOImpl;
import example.injection.UserService;
import example.injection.UserServiceImpl;
import org.springframework.context.annotation.*;
import org.springframework.stereotype.Service;

/**
 * @author bacon
 * @date 2023/7/21 21:32
 */
@Configuration
@PropertySource("classpath:/Proper/init.properties")
@ComponentScan(basePackages = "example",
        excludeFilters = {@ComponentScan.Filter(type= FilterType.ANNOTATION,value ={User.class}),
        				  @ComponentScan.Filter(type = FilterType.ASPECTJ,pattern = {"example..*"})})
public class AppConfig_Bean {
    @Bean
	public UserDAO userDAO(){
        return new UserDAOImpl();
    }

    @Bean
    public UserService userService(UserDAO userDAO){
		UserServiceImpl userService = new UserServiceImpl();
        userService.setUserDAO(userDAO);
        return userService;
    }

    @Bean
    public User user(){
        User user = new User();
        user.setId(1);
        user.setName("bacon");
        return user;
    }
}
