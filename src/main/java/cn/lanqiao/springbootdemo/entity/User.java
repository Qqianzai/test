package cn.lanqiao.springbootdemo.entity;
import lombok.Data;

import java.util.Date;

@Data
public class User {
    private int id;
    private String userName;
    private String password;
    private Date birthday;


}
