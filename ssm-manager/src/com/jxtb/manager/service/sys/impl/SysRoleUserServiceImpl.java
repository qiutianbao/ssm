package com.jxtb.manager.service.sys.impl;

import com.jxtb.base.manager.service.impl.BaseServiceImpl;
import com.jxtb.manager.entity.sys.SysRoleUser;
import com.jxtb.manager.mapper.sys.SysRoleUserMapper;
import com.jxtb.manager.service.sys.ISysRoleUserService;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

/**
 * Created with IntelliJ IDEA.
 * User: Administrator
 * Date: 16-11-28
 * Time: 下午2:22
 * To change this template use File | Settings | File Templates.
 */
@Service(value="sysRoleUserService")
public class SysRoleUserServiceImpl extends BaseServiceImpl<SysRoleUser,SysRoleUserMapper> implements ISysRoleUserService ,InitializingBean {
    @Autowired
    private SysRoleUserMapper sysRoleUserMapper;
    @Override
    public void afterPropertiesSet() throws Exception {
        super.setBaseMapper(sysRoleUserMapper);
    }

    @Override
    public List<Map<String, Object>> findRoleUserByRoleId(String roleId) {
        return sysRoleUserMapper.findRoleUserByRoleId(roleId);
    }
}
