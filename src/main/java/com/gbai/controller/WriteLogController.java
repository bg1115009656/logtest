package com.gbai.controller;

import com.gbai.annotation.BussinessLog;
import com.gbai.tips.SuccessTip;
import com.gbai.tips.Tip;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @program: logtest
 * @description:
 * @author: gbai
 * @create: 2018-08-29 15:39
 **/
@RestController
@RequestMapping("/log")
public class WriteLogController {


    @BussinessLog(value = "获取用户列表",descr = "测试获取用户列表")
    @GetMapping("/getUser")
    public Tip getUser(){
        return new SuccessTip();
    }

}
