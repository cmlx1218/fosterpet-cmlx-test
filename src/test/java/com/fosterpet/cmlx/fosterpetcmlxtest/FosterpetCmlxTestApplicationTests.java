package com.fosterpet.cmlx.fosterpetcmlxtest;

import com.fosterpet.cmlx.fosterpetcmlxtest.service.mail.impl.MailServiceImpl;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = FosterpetCmlxTestApplication.class)
public class FosterpetCmlxTestApplicationTests {

    @Autowired
    MailServiceImpl mailService;


    @Test
    public void contextLoads() {
    }

    @Test
    public void testSimpleMail() throws Exception {
        mailService.sendSimpleMail("861500116@qq.com","test simple mail"," hello this is simple mail");
    }



}
