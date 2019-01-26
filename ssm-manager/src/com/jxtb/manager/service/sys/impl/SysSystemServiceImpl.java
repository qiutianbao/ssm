package com.jxtb.manager.service.sys.impl;

import com.jxtb.base.manager.service.impl.BaseServiceImpl;
import com.jxtb.manager.entity.sys.SysSystem;
import com.jxtb.manager.mapper.sys.SysSystemMapper;
import com.jxtb.manager.service.sys.ISysSystemService;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created with IntelliJ IDEA.
 * User: Administrator
 * Date: 16-11-28
 * Time: 下午8:35
 * To change this template use File | Settings | File Templates.
 */
@Service(value = "sysSystemService")
public class SysSystemServiceImpl extends BaseServiceImpl<SysSystem,SysSystemMapper> implements ISysSystemService,InitializingBean {

    @Autowired
    private SysSystemMapper sysSystemMapper;
    @Override
    public void afterPropertiesSet() throws Exception {
       super.setBaseMapper(sysSystemMapper);
    }
}
