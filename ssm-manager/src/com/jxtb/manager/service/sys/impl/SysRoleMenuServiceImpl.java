package com.jxtb.manager.service.sys.impl;

import com.jxtb.base.manager.service.impl.BaseServiceImpl;
import com.jxtb.manager.entity.sys.SysRoleMenu;
import com.jxtb.manager.mapper.sys.SysRoleMenuMapper;
import com.jxtb.manager.service.sys.ISysRoleMenuService;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created with IntelliJ IDEA.
 * User: Administrator
 * Date: 16-11-28
 * Time: 下午2:22
 * To change this template use File | Settings | File Templates.
 */
@Service(value="sysRoleMenuService")
public class SysRoleMenuServiceImpl extends BaseServiceImpl<SysRoleMenu,SysRoleMenuMapper> implements ISysRoleMenuService ,InitializingBean {
    @Autowired
    private SysRoleMenuMapper sysRoleMenuMapper;
    @Override
    public void afterPropertiesSet() throws Exception {
       super.setBaseMapper(sysRoleMenuMapper);
    }
}
