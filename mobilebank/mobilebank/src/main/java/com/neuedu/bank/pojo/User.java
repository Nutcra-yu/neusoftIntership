package com.neuedu.bank.pojo;

import java.io.Serializable;
import java.time.LocalDate;
import lombok.Getter;
import lombok.Setter;

/**
 * <p>
 * 
 * </p>
 *
 * @author myw
 * @since 2024-07-11
 */
@Getter
@Setter
public class User implements Serializable {

    private static final long serialVersionUID = 1L;

    private String id;

    private String username;

    private String password;

    private Integer age;

    private String gender;

    private LocalDate createTime;

    private LocalDate updateTime;

    private Integer deleted;

    private String token;
}
