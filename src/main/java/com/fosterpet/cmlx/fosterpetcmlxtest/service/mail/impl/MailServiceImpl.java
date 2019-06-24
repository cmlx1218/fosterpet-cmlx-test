package com.fosterpet.cmlx.fosterpetcmlxtest.service.mail.impl;

import com.fosterpet.cmlx.fosterpetcmlxtest.service.mail.IMailService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Component;

/**
 * @Author cmlx
 * @Date 2019-6-24 0024 11:36
 * @Version 1.0
 */
@Component
public class MailServiceImpl implements IMailService {

    @Autowired
    private JavaMailSender javaMailSender;

    @Value("${mail.fromMail.addr}")
    private String from;


    private final Logger logger = LoggerFactory.getLogger(this.getClass());
    @Override
    public void sendSimpleMail(String to, String subject, String content) {

        SimpleMailMessage message = new SimpleMailMessage();
        message.setFrom(from);
        message.setTo(to);
        message.setSubject(subject);
        message.setText(content);

        try {
            javaMailSender.send(message);
            logger.info("简单邮件已发送");
        }catch (Exception e){
            logger.error("发送失败");
        }

    }
}
