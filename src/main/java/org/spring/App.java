package org.spring;

import org.spring.config.SpringContainer;
import org.spring.dao.PostDao;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        AnnotationConfigApplicationContext annotationConfigApplicationContext = new AnnotationConfigApplicationContext(SpringContainer.class);
        PostDao postDao = annotationConfigApplicationContext.getBean("postDaoImpl", PostDao.class);
        postDao.allPosts();

    }
}
