package com.jxtb.manager.service.sys.impl;

import com.jxtb.base.manager.service.impl.BaseServiceImpl;
import com.jxtb.manager.entity.sys.SysMenu;
import com.jxtb.manager.mapper.sys.SysMenuMapper;
import com.jxtb.manager.service.sys.ISysMenuService;
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
@Service(value="sysMenuService")
public class SysMenuServiceImpl extends BaseServiceImpl<SysMenu,SysMenuMapper> implements ISysMenuService,InitializingBean {
    @Autowired
    private SysMenuMapper sysMenuMapper;
    @Override
    public void afterPropertiesSet() throws Exception {
       super.setBaseMapper(sysMenuMapper);
    }
}
