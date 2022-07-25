package org.spring.aop2;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class Database {

    @Before("execution( * allPosts())")
    public void connectToDB() {
        System.out.println("Connected!!!!!!!");
    }
}
