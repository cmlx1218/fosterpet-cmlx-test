package com.fosterpet.cmlx.fosterpetcmlxtest.service;

import com.fosterpet.cmlx.fosterpetcmlxtest.message.model.User;
import com.fosterpet.cmlx.fosterpetcmlxtest.repository.impl.UserRepositoryImpl;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @Author cmlx
 * @Date 2019-6-25 0025 11:26
 * @Version 1.0
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class UserDaoTest {

    @Autowired
    private UserRepositoryImpl repository;

    @Test
    public void testSaveUser() throws Exception{
        User user = new User(2l,"郑强","赤名莉香");
        repository.saveUser(user);
    }


}
