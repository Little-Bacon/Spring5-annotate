package example.life;

import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
public class Product {
    @PostConstruct
    public void myInit(){
		System.out.println("myinit");
    }
    @PreDestroy
    public void myDestroy(){
        System.out.println("mydestroy");
    }
}
