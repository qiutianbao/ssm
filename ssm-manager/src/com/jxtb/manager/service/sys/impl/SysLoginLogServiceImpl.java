package com.jxtb.manager.service.sys.impl;

import com.jxtb.base.manager.service.impl.BaseServiceImpl;
import com.jxtb.manager.entity.sys.SysLoginLog;
import com.jxtb.manager.mapper.sys.SysLoginLogMapper;
import com.jxtb.manager.service.sys.ISysLoginLogService;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created with IntelliJ IDEA.
 * User: Administrator
 * Date: 16-11-28
 * Time: 下午2:21
 * 实现类
 */
@Service(value="sysLoginLogService")
public class SysLoginLogServiceImpl extends BaseServiceImpl<SysLoginLog,SysLoginLogMapper> implements ISysLoginLogService,InitializingBean {
    @Autowired
    private SysLoginLogMapper sysLoginLogMapper;

    @Override
    public void afterPropertiesSet() throws Exception {
        this.setBaseMapper(sysLoginLogMapper);
    }
}
