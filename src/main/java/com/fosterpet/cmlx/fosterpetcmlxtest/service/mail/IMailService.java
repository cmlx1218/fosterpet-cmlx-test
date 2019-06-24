package com.fosterpet.cmlx.fosterpetcmlxtest.service.mail;

/**
 * @Author cmlx
 * @Date 2019-6-24 0024 11:35
 * @Version 1.0
 */
public interface IMailService {

    void sendSimpleMail(String to, String subject, String content);

}
