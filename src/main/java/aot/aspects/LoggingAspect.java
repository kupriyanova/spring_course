package aot.aspects;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class LoggingAspect {

    @Before("execution(public void aot.UnyLibrary.getBook())")
    public void beforeGetBookAdvice(){
        System.out.println("beforeGetBookAdvice: попытка получить книгу");
    }

    @Before("execution(public void get*())")
    public void beforeAnyGetAdvice(){
        System.out.println("beforeAnyGetAdvice");
    }

    @Before("execution(* getBook())")
    public void beforeAnyAdvice(){
        System.out.println("beforeAnyGetAdvice");
    }

    @Before("execution(* *)")
    public void beforeAdvice(){
        System.out.println("beforeAnyGetAdvice");
    }
}
