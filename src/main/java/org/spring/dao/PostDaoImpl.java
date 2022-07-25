package org.spring.dao;

import org.springframework.stereotype.Component;

@Component
public class PostDaoImpl implements PostDao {
    @Override
    public void allPosts() {
        System.out.println("My Posts Dao..............");
    }

    @Override
    public String allLikes() {
        return "My Posts Like Dao................";
    }
}
