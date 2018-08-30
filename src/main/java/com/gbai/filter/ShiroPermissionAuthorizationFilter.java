package com.gbai.filter;

import org.apache.shiro.web.filter.authz.PermissionsAuthorizationFilter;
import org.springframework.stereotype.Component;

import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import java.io.IOException;

/**
 * @program: logtest
 * @description: 权限不足处理器
 * @author: gbai
 * @create: 2018-08-30 11:02
 **/
@Component
public class ShiroPermissionAuthorizationFilter extends PermissionsAuthorizationFilter {

    @Override
    protected boolean onAccessDenied(ServletRequest request, ServletResponse response) throws IOException {
        return super.onAccessDenied(request, response);
    }
}
