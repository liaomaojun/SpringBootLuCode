package com.example.springbootcodedemo.bo;

/**
 * @Description: 待补充
 * @Author: mj.liao
 * @Date: 2021/1/26 18:29
 * @Version: 1.0
 */
public class User {
    private int id;
    private String username;
    private String password;
    private String email;

    public int getId() {
        return id;
    }

    public User setId(int id) {
        this.id = id;
        return this;
    }

    public String getUsername() {
        return username;
    }

    public User setUsername(String username) {
        this.username = username;
        return this;
    }

    public String getPassword() {
        return password;
    }

    public User setPassword(String password) {
        this.password = password;
        return this;
    }
}
