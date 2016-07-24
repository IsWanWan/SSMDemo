package com.planet.shiro;


import com.planet.operator.domain.Operator;
import com.planet.operator.service.OperatorService;
import com.planet.syspir.domain.Syspriv;
import com.planet.syspir.service.SysprivService;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.*;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.authz.SimpleAuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.List;


/**
 * 
 * <p>
 * Title: CustomRealm
 * </p>
 * <p>
 * Description:自定义realm
 * </p>
 * <p>
 * Company: www.itcast.com
 * </p>
 * 
 * @author 传智.燕青
 * @date 2015-3-23下午4:54:47
 * @version 1.0
 */
public class CustomRealm extends AuthorizingRealm {
	
	//注入service
	@Autowired
	private OperatorService operatorService;
	@Autowired
	private SysprivService sysprivService;

	// 设置realm的名称
	@Override
	public void setName(String name) {
		super.setName("customRealm");
	}

	//realm的认证方法，从数据库查询用户信息
	@Override
	protected AuthenticationInfo doGetAuthenticationInfo(
			AuthenticationToken authcToken) throws AuthenticationException {


		UsernamePasswordToken token = (UsernamePasswordToken) authcToken;
		// 通过表单接收的用户名
		String username = token.getUsername();

		if( username != null && !"".equals(username) ){
			Operator operator = operatorService.selectByUsername(username);
			if( operator != null ){

				return new SimpleAuthenticationInfo(
						operator,operator.getPassword(),getName() );
			}
		}

		return null;
	}

	


	// 用于授权
	@Override
	protected AuthorizationInfo doGetAuthorizationInfo(
			PrincipalCollection principals) {

		//从 principals获取主身份信息
		//将getPrimaryPrincipal方法返回值转为真实身份类型（在上边的doGetAuthenticationInfo认证通过填充到SimpleAuthenticationInfo中身份类型），
//		o activeUser =  (ActiveUser) principals.getPrimaryPrincipal();

		//根据身份信息获取权限信息
//		//从数据库获取到权限数据
		List<Syspriv> permissionList = null;
		try {
			permissionList = sysprivService.selectPrivByOperId(4);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	//	单独定一个集合对象
		List<String> permissions = new ArrayList<String>();
		if(permissionList!=null){
			for(Syspriv sysPermission:permissionList){
				//将数据库中的权限标签 符放入集合
				permissions.add(sysPermission.getCode());
			}
		}


//		List<String> permissions = new ArrayList<String>();
//		//permissions.add("TOperator:view");//用户的创建
//		permissions.add("item:query");//商品查询权限
//		permissions.add("item:add");//商品添加权限
//		permissions.add("item:edit");//商品修改权限
	//....

		//查到权限数据，返回授权信息(要包括 上边的permissions)
		SimpleAuthorizationInfo simpleAuthorizationInfo = new SimpleAuthorizationInfo();
		//将上边查询到授权信息填充到simpleAuthorizationInfo对象中
		simpleAuthorizationInfo.addStringPermissions(permissions);

		return simpleAuthorizationInfo;
	}
	
	//清除缓存
	public void clearCached() {
		PrincipalCollection principals = SecurityUtils.getSubject().getPrincipals();
		super.clearCache(principals);
	}


}
