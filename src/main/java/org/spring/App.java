package org.spring;

import org.spring.config.SpringContainer;
import org.spring.dao.PostDao;
import org.spring.model.User;
import org.spring.service.PostService;
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
        int res=0;
        postDao.allPosts(new User());
        System.out.println(postDao.allLikes(new User(),res));
        postDao.funDao();

        System.out.println("====================================");
        PostService postService =  annotationConfigApplicationContext.getBean("postServiceImpl", PostService.class);
        System.out.println(postService.allPosts(new User(), res));
        System.out.println(postService.allLikes(new User()));
        postService.startService();
    }
}
