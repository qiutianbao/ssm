package com.jxtb.manager.service.sys.impl;

import com.jxtb.base.manager.service.impl.BaseServiceImpl;
import com.jxtb.manager.entity.sys.SysOperateHistory;
import com.jxtb.manager.mapper.sys.SysOperateHistoryMapper;
import com.jxtb.manager.service.sys.ISysOperateHistoryService;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created with IntelliJ IDEA.
 * User: Administrator
 * Date: 16-11-28
 * Time: 下午8:27
 * To change this template use File | Settings | File Templates.
 */
@Service(value = "sysOperateHistoryService")
public class SysOperateHistoryServiceImpl extends BaseServiceImpl<SysOperateHistory,SysOperateHistoryMapper> implements ISysOperateHistoryService,InitializingBean {
    @Autowired
    private SysOperateHistoryMapper sysOperateHistoryMapper;
    @Override
    public void afterPropertiesSet() throws Exception {
       super.setBaseMapper(sysOperateHistoryMapper);
    }
}
