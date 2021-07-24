package com.study.springbootdemo.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.study.springbootdemo.mapper.UserMapper;
import com.study.springbootdemo.model.User;
import com.study.springbootdemo.service.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author markcwg
 * @date 2021/7/24 4:22 下午
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService {
    @Resource
    private UserMapper userMapper;
    @Override
    public List<User> listAll() {
        return userMapper.selectList(null);
    }

    @Override
    public User getByIdMySelf(Integer id) {
        return userMapper.selectById(id);
    }

    @Override
    public Boolean create(User user) {
       return userMapper.insert(user) > 0;
    }

    @Override
    public Boolean delete(Integer id) {
        return userMapper.deleteById(id) > 0;
    }

    @Override
    public Boolean update(User user) {
        return userMapper.updateById(user) > 0;
    }
}
