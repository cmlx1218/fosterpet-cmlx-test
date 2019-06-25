package com.fosterpet.cmlx.fosterpetcmlxtest.repository;

import com.fosterpet.cmlx.fosterpetcmlxtest.message.model.User;

/**
 * @Author cmlx
 * @Date 2019-6-25 0025 10:50
 * @Version 1.0
 */
public interface UserRepository {

    public void saveUser(User user);

    public User findUserByUserName(String userName);

    public long updateUser(User user);

    public void deleteUserById(Long id);

}
