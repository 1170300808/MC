package com.matcloud.mc.realm;

import com.matcloud.mc.entity.User;
import com.matcloud.mc.service.AdminPermissionService;
import com.matcloud.mc.service.AdminRoleService;
import com.matcloud.mc.service.UserService;
import org.apache.shiro.authc.*;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.authz.SimpleAuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;
import org.apache.shiro.util.ByteSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.ObjectUtils;

import java.util.Set;

public class MCRealm extends AuthorizingRealm {

    @Autowired
    private UserService userService;
    @Autowired
    private AdminPermissionService adminPermissionService;
    @Autowired
    private AdminRoleService adminRoleService;

    // 重写获取授权信息方法
    @Override
    protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principalCollection) {
        // 获取当前用户的所有权限
        String username = principalCollection.getPrimaryPrincipal().toString();
        Set<String> permissions = adminPermissionService.listPermissionURLsByUser(username);

        // 将权限放入授权信息中
        SimpleAuthorizationInfo s = new SimpleAuthorizationInfo();
        s.setStringPermissions(permissions);
        return s;
    }

    // 获取认证信息，即根据 token 中的用户名从数据库中获取密码、盐等并返回
    @Override
    protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken token) throws AuthenticationException {
        String userName = token.getPrincipal().toString();
        User user = userService.findByUsername(userName);
        if (ObjectUtils.isEmpty(user)) {
            throw new UnknownAccountException();
        }
        String passwordInDB = user.getPassword();
        String salt = user.getSalt();
        SimpleAuthenticationInfo authenticationInfo = new SimpleAuthenticationInfo(userName, passwordInDB, ByteSource.Util.bytes(salt), getName());
        return authenticationInfo;
    }
}
