package com.study.springbootdemo.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.study.springbootdemo.model.User;
import io.swagger.models.auth.In;

import java.util.List;

/**
 * @author markcwg
 * @date 2021/7/24 4:21 下午
 */
public interface UserService extends IService<User> {

    List<User> listAll();

    User getByIdMySelf(Integer id);

    Boolean create (User user);

    Boolean delete(Integer id);

    Boolean update(User user);
}
