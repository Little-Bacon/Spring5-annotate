package TestAnnotation;


import config.AOPConfig.AppConfig;
import example.aop.UserService;
import example.mybatis.User;
import example.mybatis.UserDAO;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author bacon
 * @date 2023/7/23 16:42
 */
public class TestAOP {
    @Test
    public void test1(){
        ApplicationContext ctx = new AnnotationConfigApplicationContext("config/AOPConfig");
        UserService userService = (UserService) ctx.getBean("userServiceImpl");
        userService.register();
        userService.login();
    }

    /**
     * 测试一下MyBatis纯注解整合
     */
    @Test
    public void test2(){
        ApplicationContext ctx = new AnnotationConfigApplicationContext("config/MyBatisConfig");
        UserDAO userDAO = (UserDAO) ctx.getBean("userDAO");
        User user = new User(1,"bacon","456789");
        userDAO.save(user);
    }
}
