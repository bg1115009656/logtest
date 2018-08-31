package com.gbai.service.impl;

import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.gbai.dao.OperationLogDao;
import com.gbai.dao.SysUserDao;
import com.gbai.entity.OperationLog;
import com.gbai.entity.SysUserEntity;
import com.gbai.service.OperationLogService;
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
public class OperationLogServiceImpl extends ServiceImpl<OperationLogDao, OperationLog> implements OperationLogService {


}
