package com.jxtb.manager.service.sys.impl;

import com.jxtb.base.manager.service.impl.BaseServiceImpl;
import com.jxtb.manager.entity.sys.SysRole;
import com.jxtb.manager.mapper.sys.SysRoleMapper;
import com.jxtb.manager.service.sys.ISysRoleService;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created with IntelliJ IDEA.
 * User: Administrator
 * Date: 16-11-28
 * Time: 下午2:23
 * To change this template use File | Settings | File Templates.
 */
@Service(value="sysRoleService")
public class SysRoleServiceImpl extends BaseServiceImpl<SysRole,SysRoleMapper> implements ISysRoleService ,InitializingBean {
    @Autowired
    private SysRoleMapper sysRoleMapper;
    @Override
    public void afterPropertiesSet() throws Exception {
        super.setBaseMapper(sysRoleMapper);
    }
}
