package com.gbai.service.impl;

import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.gbai.dao.SysUserDao;
import com.gbai.entity.SysUserEntity;
import com.gbai.service.UserService;
import com.gbai.shiro.ShiroUtils;
import org.apache.commons.lang3.RandomStringUtils;
import org.springframework.stereotype.Service;

import java.util.Date;

/**
 * @program: logproject
 * @description:
 * @author: gbai
 * @create: 2018-08-31 11:19
 **/
@Service
public class UserServiceImpl extends ServiceImpl<SysUserDao, SysUserEntity> implements UserService {

    @Override
    public void save(SysUserEntity user) {
        user.setCreateTime(new Date());
        //sha256加密
        String salt = RandomStringUtils.randomAlphanumeric(20);
        user.setSalt(salt);
        user.setPassword(ShiroUtils.sha256(user.getPassword(), user.getSalt()));
        this.insert(user);
    }
}
