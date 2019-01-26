package com.jxtb.manager.service.sys.impl;

import com.jxtb.base.manager.service.impl.BaseServiceImpl;
import com.jxtb.manager.entity.sys.SysRoleRights;
import com.jxtb.manager.mapper.sys.SysRoleRightsMapper;
import com.jxtb.manager.service.sys.ISysRoleRightsService;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created with IntelliJ IDEA.
 * User: Administrator
 * Date: 16-11-28
 * Time: 下午8:33
 * To change this template use File | Settings | File Templates.
 */
@Service(value = "sysRoleRightsService")
public class SysRoleRightsServiceImpl extends BaseServiceImpl< SysRoleRights,SysRoleRightsMapper> implements ISysRoleRightsService ,InitializingBean {

    @Autowired
    private SysRoleRightsMapper sysRoleRightsMapper;
    @Override
    public void afterPropertiesSet() throws Exception {
       super.setBaseMapper(sysRoleRightsMapper);
    }
}
