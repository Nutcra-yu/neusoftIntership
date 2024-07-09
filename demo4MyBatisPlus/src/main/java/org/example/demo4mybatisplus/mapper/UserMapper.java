package org.example.demo4mybatisplus.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import org.example.demo4mybatisplus.pojo.User;

@Mapper
public interface UserMapper extends BaseMapper<User> {

}