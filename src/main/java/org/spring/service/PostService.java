package org.spring.service;

import org.spring.model.User;

public interface PostService {

    public String allPosts(User user, int result);

    public String allLikes(User user);

    public void startService();
}
