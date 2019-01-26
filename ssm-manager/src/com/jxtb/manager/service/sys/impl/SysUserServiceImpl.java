package com.jxtb.manager.service.sys.impl;

import com.jxtb.base.manager.service.impl.BaseServiceImpl;
import com.jxtb.manager.entity.sys.SysUser;
import com.jxtb.manager.mapper.sys.SysUserMapper;
import com.jxtb.manager.service.sys.ISysUserService;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created with IntelliJ IDEA.
 * User: Administrator
 * Date: 16-11-28
 * Time: 下午2:21
 * To change this template use File | Settings | File Templates.
 */
@Service(value="sysUserService")
public class SysUserServiceImpl extends BaseServiceImpl<SysUser,SysUserMapper> implements ISysUserService  ,InitializingBean {
    @Autowired
    private SysUserMapper sysUserMapper;
    @Override
    public void afterPropertiesSet() throws Exception {
       super.setBaseMapper(sysUserMapper);
    }
}
