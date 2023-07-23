package config;

import example.bean.ConnectionFactoryBean;
import example.bean.User;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

@Configuration
public class AppConfig {
//    必须是public，
//    return：需要创建的对象类型
//    方法名：对应bean的id
//    如何创建对象写在方法体中
    @Bean("u")
    @Scope("prototype")
    public User user(){
        return new User();
    }

    @Bean
    public Connection conn() throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.jdbc.Driver");
        Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3303/learn?useSSL=false","bacon","123456");
        return conn;

    }

    public Connection conn1() throws Exception {
        Connection connection = null;
        ConnectionFactoryBean factoryBean = new ConnectionFactoryBean();
        connection = factoryBean.getObject();
        return connection;
    }

}
