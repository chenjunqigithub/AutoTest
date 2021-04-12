package com.course.model;

import lombok.Data;

/**
 * 添加用户接口的测试用例
 */
@Data
public class AddUserCase {
    private String userName;
    private String password;
    private String sex;
    private int age;
    private int permission;
    private int isDelete;
    private String expected;
}

