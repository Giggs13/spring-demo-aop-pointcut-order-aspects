package com.giggs13.aop.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Aspect
@Component
@Order(2)
public class LoggingAspect {

    @Before("com.giggs13.aop.aspect.AopExpressions.daoPackageExcludingGettersAndSetters()")
    private void beforeAddAccountAdvice() {
        System.out.println("\n---> Executing @Before advice on method");
    }
}
