package org.andios.servlet.dao;

import org.andios.servlet.model.User;

public interface UserDao {
    /**
     * 用户登入的方法
     */
    public User login(User user);

    /**
     * 用户注册的方法声明
     */
    public boolean register(User user);
}
