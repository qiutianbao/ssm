package com.jxtb.manager.service.sys;

import com.jxtb.base.manager.service.IBaseService;
import com.jxtb.manager.entity.sys.SysRoleUser;

import java.util.List;
import java.util.Map;

/**
 * Created with IntelliJ IDEA.
 * User: Administrator
 * Date: 16-11-28
 * Time: 下午2:22
 * To change this template use File | Settings | File Templates.
 */
public interface ISysRoleUserService extends IBaseService<SysRoleUser>{
    //根据RoleId查找角色对应的哪些用户
    public abstract List<Map<String, Object>> findRoleUserByRoleId(String roleId);

}
