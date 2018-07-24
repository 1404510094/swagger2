package com.tanyboye.swagger2.domain;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * @author:chengbg
 * @date:2018/7/24
 */
@ApiModel(value = "用户实体", description = "用户对象")
public class User {

    @ApiModelProperty(hidden = true)
    private Integer id;

    @ApiModelProperty(value = "用户名", name = "username", example = "tanyboye", required = true)
    private String username;

    @ApiModelProperty(value = "密码", name = "password", example = "123456", required = true)
    private String password;

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
}
