package config.AOPConfig;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

/**
 * @author bacon
 * @date 2023/7/23 16:26
 */
@Configuration
@ComponentScan("example.aop")
// 切换为CGlib
@EnableAspectJAutoProxy(proxyTargetClass = true)
public class AppConfig {
    
}
