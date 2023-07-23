package example.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

/**
 * @author bacon
 * @date 2023/7/23 16:34
 */
@Aspect
@Component
public class MyAspect {
    @Pointcut("execution(* example.aop..*.*(..))")
    public void pointCut(){}

    @Around("pointCut()")
    public Object arround(ProceedingJoinPoint joinPoint) throws Throwable {
        System.out.println("log");
        Object ret = joinPoint.proceed();
        return ret;
    }
}
