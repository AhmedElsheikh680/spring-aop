package org.spring.aop2;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class Database {

    @Pointcut("execution( * org.spring.dao.*.*(..))")
    public void myPointCut(){

    }
    @Before("myPointCut())")
    public void connectToDB() {
        System.out.println("Connected!!!!!!!");
    }

//    @Before("execution(* org.spring.service.*.*(..))")
    @Before("myPointCut()")
    public void login() {
        System.out.println("Login...................True");
    }
}
