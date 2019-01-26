package com.jxtb.manager.service.sys.impl;

import com.jxtb.base.manager.service.impl.BaseServiceImpl;
import com.jxtb.manager.entity.sys.SysRights;
import com.jxtb.manager.mapper.sys.SysRightsMapper;
import com.jxtb.manager.service.sys.ISysRightsService;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created with IntelliJ IDEA.
 * User: Administrator
 * Date: 16-11-28
 * Time: 下午8:31
 * To change this template use File | Settings | File Templates.
 */
@Service(value = "sysRightsService")
public class SysRightsServiceImpl extends BaseServiceImpl<SysRights,SysRightsMapper> implements ISysRightsService,InitializingBean {

    @Autowired
    private SysRightsMapper sysRightsMapper;
    @Override
    public void afterPropertiesSet() throws Exception {
       super.setBaseMapper(sysRightsMapper);
    }
}
