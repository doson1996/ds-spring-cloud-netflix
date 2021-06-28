package com.ds.user.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.ds.user.domain.User;
import com.ds.user.service.UserService;
import com.ds.user.mapper.UserMapper;
import org.springframework.stereotype.Service;

/**
 *
 * @author ds
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService{

}




