package org.spring.dao;

import org.spring.model.User;
import org.springframework.stereotype.Component;

@Component
public class PostDaoImpl implements PostDao {
    @Override
    public void allPosts(User user) {
        System.out.println("My Posts Dao..............");
    }

    @Override
    public String allLikes(User user, int result) {
        return "My Posts Like Dao................";
    }

    @Override
    public void funDao() {
        System.out.println("Fun Dao........");
    }
}
