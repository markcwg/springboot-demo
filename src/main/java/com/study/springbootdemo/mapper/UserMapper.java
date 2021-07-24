package com.study.springbootdemo.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.study.springbootdemo.model.User;
import org.mapstruct.Mapper;

/**
 * @author markcwg
 * @date 2021/7/24 4:20 下午
 */
@Mapper
public interface UserMapper extends BaseMapper<User> {
}
