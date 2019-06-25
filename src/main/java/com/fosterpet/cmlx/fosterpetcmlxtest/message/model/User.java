package com.fosterpet.cmlx.fosterpetcmlxtest.message.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * @Author cmlx
 * @Date 2019-6-25 0025 10:44
 * @Version 1.0
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class User implements Serializable {
    private static final long serialVersionUID = -6870042099899473504L;

    private Long id;
    private String userName;
    private String passWord;

}
