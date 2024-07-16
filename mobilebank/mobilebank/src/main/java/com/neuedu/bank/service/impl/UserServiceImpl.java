package com.neuedu.bank.service.impl;

import com.neuedu.bank.pojo.User;
import com.neuedu.bank.mapper.UserMapper;
import com.neuedu.bank.service.IUserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author myw
 * @since 2024-07-11
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements IUserService {

}
