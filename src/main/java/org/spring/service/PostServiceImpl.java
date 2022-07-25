package org.spring.service;

import org.springframework.stereotype.Component;

@Component
public class PostServiceImpl implements PostService{
    @Override
    public String allPosts() {
       return  " All Posts Service.............";
    }
}
