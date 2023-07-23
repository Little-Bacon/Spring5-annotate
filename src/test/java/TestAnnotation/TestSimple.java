package TestAnnotation;

import config.AppConfig;
import example.bean.User;
import example.injection.Catagory;
import example.injection.UserService;
import example.life.Product;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import javax.security.auth.login.AccountException;

public class TestSimple {


    @Test
    public void test1(){
        ApplicationContext ctx = new ClassPathXmlApplicationContext("/applicationContext.xml");
        User user = (User) ctx.getBean("u");

        System.out.println("user = "+user);
        User user1 = (User) ctx.getBean("u");
        System.out.println("user1 = "+user1);
    }

    @Test
    public void test2(){
//        只有ClassPathXmlApplicationContext才有关闭，才能演示destroy的效果
        ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("/applicationContext.xml");
        Product product = (Product) ctx.getBean("product");
        System.out.println(product);
        ctx.close();
    }

    @Test
    public void test3(){
        ApplicationContext ctx = new ClassPathXmlApplicationContext("/applicationContext.xml");
        UserService userServiceImpl = (UserService) ctx.getBean("userServiceImpl");	// 因为在UserServiceImpl上加的@Service
        userServiceImpl.register();
    }

    @Test
    public void test4(){
        ApplicationContext ctx = new ClassPathXmlApplicationContext("/applicationContext.xml");
        Catagory catagory = (Catagory) ctx.getBean("catagory");
        System.out.println("name="+catagory.getName());
        System.out.println("id="+catagory.getId());
    }

    @Test
    public void test5(){
//        ApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);
//        或
        ApplicationContext ctx = new AnnotationConfigApplicationContext("/config");
    }

    @Test
    public void test6(){
//        ApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);
//        或
        ApplicationContext ctx = new AnnotationConfigApplicationContext("/config");
        User user = (User) ctx.getBean("user");
        System.out.println(user);
    }
    @Test

    public void test7(){

        ApplicationContext ctx = new AnnotationConfigApplicationContext("/config");
//        Spring创建的对象名称
        String[] beanDefinitionNames = ctx.getBeanDefinitionNames();
        System.out.println(beanDefinitionNames);
    }
}
