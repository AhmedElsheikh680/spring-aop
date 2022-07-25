package org.spring.service;

import org.springframework.stereotype.Component;

@Component
public class PostServiceImpl implements PostService{
    @Override
    public void allPosts() {
        System.out.println(" All Posts Service.............");
    }
}
