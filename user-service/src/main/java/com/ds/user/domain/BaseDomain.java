package com.ds.user.domain;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;

/**
 * @author ds
 */
@Data
public class BaseDomain {
    /**
     * id
     */
    @TableId(type = IdType.AUTO)
    private Long id;

    private Boolean isDelete;
}
