package com.jxtb.manager.service.sys.impl;

import com.jxtb.base.manager.service.impl.BaseServiceImpl;
import com.jxtb.manager.entity.sys.SysLogin;
import com.jxtb.manager.mapper.sys.SysLoginMapper;
import com.jxtb.manager.service.sys.ISysLoginService;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created with IntelliJ IDEA.
 * User: Administrator
 * Date: 16-11-28
 * Time: 下午3:01
 * To change this template use File | Settings | File Templates.
 */
@Service(value="sysLoginService")
public class SysLoginServiceImpl extends BaseServiceImpl<SysLogin,SysLoginMapper> implements ISysLoginService,InitializingBean {
    @Autowired
    private SysLoginMapper sysLoginMapper;
    @Override
    public void afterPropertiesSet() throws Exception {
        super.setBaseMapper(sysLoginMapper);
    }
}
