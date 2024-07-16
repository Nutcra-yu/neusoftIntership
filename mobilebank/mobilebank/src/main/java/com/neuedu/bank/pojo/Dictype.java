package com.neuedu.bank.pojo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;

import lombok.Data;
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
@Data
public class Dictype implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "dicTypeId", type = IdType.AUTO)
    private Integer dicTypeId;

    private Integer dicTypeCode;//字典分类编码

    private String dicTypeName;//字典分类名称
}
