package com.gbai.controller;

import com.gbai.entity.SysUserEntity;
import com.gbai.tips.Result;
import com.gbai.tips.Tip;
import org.apache.commons.collections.MapUtils;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.subject.Subject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

/**
 * @program: logproject
 * @description:
 * @author: gbai
 * @create: 2018-08-30 18:20
 **/
@RestController
@RequestMapping("/user")
public class UserController {
    private static Logger log = LoggerFactory.getLogger(UserController.class);

    @PostMapping("/login")
    public Tip login(SysUserEntity user){
        Map<String,String> map = MapUtils.EMPTY_MAP;
        Subject subject = SecurityUtils.getSubject();
        UsernamePasswordToken usernamePasswordToken = new UsernamePasswordToken(user.getUsername(),user.getPassword());
        try{
            subject.login(usernamePasswordToken);
            String sessionId = (String) subject.getSession().getId();
            map.put("sessionId",sessionId);
        }catch (Exception e){
            log.error(e.getMessage());
        }

        return Result.success(map);
    }
}
