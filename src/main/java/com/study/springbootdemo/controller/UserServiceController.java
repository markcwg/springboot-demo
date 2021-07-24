package com.study.springbootdemo.controller;

import com.github.xiaoymin.knife4j.annotations.ApiOperationSupport;
import com.github.xiaoymin.knife4j.annotations.ApiSupport;
import com.study.springbootdemo.model.User;
import com.study.springbootdemo.service.UserService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * 利用 Mybatis-Plus 框架的 service 自带的方法实现CRUD
 * @author markcwg
 * @date 2021/7/24 4:24 下午
 */
@RestController
@RequestMapping("service")
@Api(value = "service", tags = "2. Service接口列表")
@ApiSupport(order = 2)
public class UserServiceController {
    @Autowired
    private UserService userService;

    @GetMapping("list")
    @ApiOperation(value = "2.1 列出所有数据")
    @ApiOperationSupport(order = 1)
    public List<User> listAll () {
        return userService.list();
    }

    @GetMapping("one")
    @ApiOperation(value = "2.2 通过 id 查询一条数据")
    @ApiOperationSupport(order = 2)
    public User getById (Integer id) {
        return userService.getByIdMySelf(id);
    }

    @DeleteMapping("remove")
    @ApiOperation(value = "2.3 通过 id 删除一条数据")
    @ApiOperationSupport(order = 3)
    public Boolean deleteById (Integer id) {
        return userService.delete(id);
    }

    @PutMapping("update")
    @ApiOperation(value = "2.4 修改数据")
    @ApiOperationSupport(order = 4)
    public Boolean update (User user) {
        return userService.update(user);
    }

    @PostMapping("update")
    @ApiOperation(value = "2.5 新增一条数据")
    @ApiOperationSupport(order = 5)
    public Boolean create (User user) {
        return userService.create(user);
    }
}
