package org.spring.service;

import org.spring.model.User;
import org.springframework.stereotype.Component;

@Component
public class PostServiceImpl implements PostService{
    @Override
    public String allPosts(User user, int result) {
       return  " All Posts Service.............";
    }

    @Override
    public String allLikes(User user) {
        return "All Posts Service Likes.............";
    }

    @Override
    public void startService() {
        System.out.println("Start Service...........");
    }
}
