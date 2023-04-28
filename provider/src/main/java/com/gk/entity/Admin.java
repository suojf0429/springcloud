package com.gk.entity;

import java.sql.Date;

public class Admin {
    private Integer id;
    private String username;
    private String password;
    private Date create_time;

    public Admin() {
    }

    public Admin(Integer id, String username, String password, Date create_time) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.create_time = create_time;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Date getCreate_time() {
        return create_time;
    }

    public void setCreate_time(Date create_time) {
        this.create_time = create_time;
    }

    @Override
    public String toString() {
        return "Admin{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", create_time=" + create_time +
                '}';
    }
}
