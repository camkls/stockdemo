package cn.sz.vo;


import lombok.Data;
import lombok.ToString;

import java.io.Serializable;
import java.util.Date;

@Data
@ToString
public class User implements Serializable {
    private Integer userid;
    private String username;
    private String  password;
    private String phone;
    private String email;
    private String realname;
    private String idcard;
    private Integer safestate;
    private Integer actualstate;
    private Date createtime;
}
