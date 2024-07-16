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
public class Dicitem implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "dicItemId", type = IdType.AUTO)
    private Integer dicItemId;//字典条目ID

    private Integer dicTypeCode;//字典分类编码

    private Integer dicItemCode;//字典条目编码

    private String dicItemName;//字典条目名称
}
