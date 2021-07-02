package com.ds.user.dto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * @author ds
 */
@Data
@ApiModel("user修改参数")
public class UserUpdateParam {
    /**
     * id
     */
    @ApiModelProperty(value = "id" , required = true)
    private String id;

    /**
     * 用户名
     */
    @ApiModelProperty(value = "姓名" , required = true)
    private String name;

    /**
     * 是否删除
     */
    @ApiModelProperty(value = "是否删除")
    private Boolean isDelete;
}
