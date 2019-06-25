package com.fosterpet.cmlx.fosterpetcmlxtest.service;

import com.fosterpet.cmlx.fosterpetcmlxtest.service.mail.impl.MailServiceImpl;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @Author cmlx
 * @Date 2019-6-24 0024 18:16
 * @Version 1.0
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class MaliService {

    @Autowired
    private MailServiceImpl mailService;

    @Test
    public void testSimpleMail() throws Exception {
        mailService.sendSimpleMail("861500116@qq.com","test simple mail"," hello this is simple mail");
    }


}
