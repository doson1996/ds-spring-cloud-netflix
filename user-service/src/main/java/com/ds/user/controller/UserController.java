package com.ds.user.controller;

import cn.hutool.core.bean.BeanUtil;
import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.ds.common.result.Result;
import com.ds.common.result.ResultMsg;
import com.ds.user.domain.User;
import com.ds.user.dto.UserCreateParam;
import com.ds.user.dto.UserUpdateParam;
import com.ds.user.service.UserService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author ds
 */
@Api(tags = "用户管理")
@RestController
@RequestMapping("user")
public class UserController {

    @Resource
    private UserService userService;

    /**
     * 分页查找用户
     * @param pageSize
     * @param pageNum
     * @return
     */
    @ApiOperation("分页查找用户")
    @PostMapping("search")
    public Result<Page<User>> search(@RequestParam long pageSize,
                                     @RequestParam long pageNum) {
        LambdaQueryWrapper<User> userLambdaQueryWrapper = new LambdaQueryWrapper<>();
        Page page = new Page<>(pageNum, pageSize);
        Page<User> result = userService.page(page, userLambdaQueryWrapper);

        return Result.ok(ResultMsg.QUERY_SUCCESS_MSG, result);
    }

    /**
     * 新增用户
     * @param param
     * @return
     */
    @ApiOperation("新增用户")
    @PostMapping("insert")
    public Result<String> insert(@RequestBody UserCreateParam param) {
        User user = new User();
        BeanUtil.copyProperties(param, user);
        userService.save(user);

        return Result.ok(ResultMsg.CREATE_SUCCESS_MSG);
    }

    /**
     * 根据id删除用户
     * @param id
     * @return
     */
    @ApiOperation("根据id删除用户")
    @PostMapping("delete")
    public Result<String> delete(@RequestParam Long id) {
        userService.removeById(id);

        return Result.ok(ResultMsg.DELETE_SUCCESS_MSG);
    }

    /**
     * 修改用户
     * @param param
     * @return
     */
    @ApiOperation("修改用户")
    @PostMapping("update")
    public Result<String> update(@RequestBody UserUpdateParam param) {
        User user = new User();
        BeanUtil.copyProperties(param, user);
        userService.updateById(user);

        return Result.ok(ResultMsg.UPDATE_SUCCESS_MSG);
    }

    /**
     * 根据用户名模糊查询
     * @param name 用户名
     * @return
     */
    @ApiOperation("根据用户名模糊查询")
    @GetMapping("findByName")
    public Result<List<User>> findByName(@RequestParam(value = "name") String name) {
        LambdaQueryWrapper<User> userLambdaQueryWrapper = new LambdaQueryWrapper<>();
        userLambdaQueryWrapper.like(User::getName, name);

        return Result.ok(ResultMsg.QUERY_SUCCESS_MSG, userService.list(userLambdaQueryWrapper));
    }

}
