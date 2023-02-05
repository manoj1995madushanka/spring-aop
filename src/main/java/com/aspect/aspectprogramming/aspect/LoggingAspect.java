package com.aspect.aspectprogramming.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class LoggingAspect {

    /**
     * this is Before advice
     * this will execute before addAccount method evaluate
     */
    @Before("execution(public void addAccount())") // this is pointcut expression
    public void beforeAddAccountAdvice() {
        System.out.println("\n ==============> before addAccount advice ========");
    }
}
