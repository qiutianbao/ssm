package com.jxtb.manager.service.sys.impl;

import com.jxtb.base.manager.service.impl.BaseServiceImpl;
import com.jxtb.manager.entity.sys.SysDept;
import com.jxtb.manager.mapper.sys.SysDeptMapper;
import com.jxtb.manager.service.sys.ISysDeptService;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created with IntelliJ IDEA.
 * User: Administrator
 * Date: 16-11-28
 * Time: 下午8:16
 * To change this template use File | Settings | File Templates.
 */
@Service(value="sysDeptService")
public class SysDeptServiceImpl extends BaseServiceImpl<SysDept,SysDeptMapper> implements ISysDeptService ,InitializingBean {
    @Autowired
    private SysDeptMapper sysDeptMapper;
    @Override
    public void afterPropertiesSet() throws Exception {
        super.setBaseMapper(sysDeptMapper);
    }
}
