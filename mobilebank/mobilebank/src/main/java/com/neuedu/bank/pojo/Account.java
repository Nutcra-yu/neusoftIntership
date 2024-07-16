package com.neuedu.bank.pojo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;
import java.math.BigDecimal;

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
public class Account implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    private String accountName;

    private String password;//支付密码

    private BigDecimal balance;//余额

    private Integer statusId;//账户状态

    private Integer personId;//客户ID
}
