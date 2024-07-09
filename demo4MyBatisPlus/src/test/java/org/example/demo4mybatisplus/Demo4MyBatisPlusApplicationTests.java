package org.example.demo4mybatisplus;

import com.baomidou.mybatisplus.core.conditions.Wrapper;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.conditions.update.UpdateWrapper;
import com.baomidou.mybatisplus.core.toolkit.Assert;
import org.example.demo4mybatisplus.mapper.UserMapper;
import org.example.demo4mybatisplus.pojo.User;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@SpringBootTest
class Demo4MyBatisPlusApplicationTests {

    @Autowired
    private UserMapper userMapper;

    @Test
    void contextLoads(){
//        List<User> users = userMapper.selectList(null);
//        System.out.println(users);

//        eq
//        UpdateWrapper<User> updateWrapper = new UpdateWrapper<>();
//        updateWrapper.eq("name","Jack");
//        List<User> list = userMapper.selectList(updateWrapper);
//        System.out.println(list);
//
//        updateWrapper.set("name","Jone");
//        list = userMapper.selectList(updateWrapper);
//        System.out.println(list);

        QueryWrapper<User> queryWrapper = new QueryWrapper<>();

//        ne nor
//        queryWrapper.ne("name","jack");
//        List<User> users = userMapper.selectList(queryWrapper);
//        System.out.println(users);

//        allEq and
//        Map<String,Object> map = new HashMap<>();
//        map.put("name","jack");
//        map.put("age",20);
//        queryWrapper.allEq(map);
//        List<User> users = userMapper.selectList(queryWrapper);
//        System.out.println(users);









    }

}
