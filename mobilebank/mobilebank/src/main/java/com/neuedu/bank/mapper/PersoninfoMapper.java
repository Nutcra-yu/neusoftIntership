package com.neuedu.bank.mapper;

import com.neuedu.bank.pojo.Personinfo;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author myw
 * @since 2024-07-11
 */
@Mapper
public interface PersoninfoMapper extends BaseMapper<Personinfo> {
    @Select("""
            select p.id,p.realname,d.dicItemName sex,p.cardId,p.birthday,p.address,p.mail,m.telephone 
            from mobile m
                inner join personinfo p on m.telephone=p.telephone
                inner join dicitem d on d.dicTypeCode=3 and p.sex=dicItemCode
                where m.telephone=#{tel} and m.`password`=#{pwd}
            """)
    public Personinfo selectByTelandPwd(@Param("tel") String tel,@Param("pwd") String pwd);


    public Personinfo selectByTel(@Param("tel")String tel);

    public int inserByTelandPwd(String tel, String pwd);
}
