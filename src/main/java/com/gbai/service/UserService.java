package com.gbai.service;

import com.baomidou.mybatisplus.service.IService;
import com.gbai.entity.SysUserEntity;

/**
 * @program: logproject
 * @description:
 * @author: gbai
 * @create: 2018-08-31 11:18
 **/
public interface UserService extends IService<SysUserEntity> {

    /**
     * 保存用户
     * @param user
     */
    void save(SysUserEntity user);
}
