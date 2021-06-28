package com.ds.user.dto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * @author ds
 */
@Data
@ApiModel("user新增参数")
public class UserCreateParam {
    /**
     * 用户名
     */
    @ApiModelProperty(value = "姓名" , required = true)
    private String name;

    /**
     * 密码
     */
    @ApiModelProperty(value = "密码" , required = true)
    private String password;

    /**
     * 邮箱
     */
    @ApiModelProperty(value = "邮箱")
    private String email;
}
