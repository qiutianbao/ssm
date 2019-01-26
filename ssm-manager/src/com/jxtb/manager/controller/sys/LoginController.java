package com.jxtb.manager.controller.sys;

import com.jxtb.common.constants.BaseConstants;
import com.jxtb.base.manager.controller.BaseController;
import com.jxtb.utils.MD5;
import com.jxtb.manager.entity.SessionUser;
import com.jxtb.manager.entity.sys.*;
import com.jxtb.manager.service.sys.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.*;

/**
 * Created with IntelliJ IDEA.
 * User: Administrator
 * Date: 16-11-28
 * Time: 下午2:05
 * 登录
 */
@Controller
public class LoginController extends BaseController {
    @Autowired
    private ISysLoginService sysLoginService;
    @Autowired
    private ISysLoginLogService sysLoginLogService;
    @Autowired
    private ISysUserService sysUserService;
    @Autowired
    private ISysRoleUserService sysRoleUserService;
    @Autowired
    private ISysRoleMenuService sysRoleMenuService;
    @Autowired
    private ISysRoleService sysRoleService;
    @Autowired
    private ISysMenuService sysMenuService;

    @RequestMapping("/login")
    public String loginHandler(HttpServletRequest request,HttpServletResponse response, ModelMap model) throws ServletException {
        String action = this.getParameter(request, "action");
        if("do".equals(action)){
            String loginname = this.getParameter(request, "loginname");
            String password = this.getParameter(request, "password");
            String loginInfo = "";
            Map<String, Object> param = new HashMap<String, Object>();
            SysLogin sysLogin;
            List<SysLogin> sysLoginList;  //登录信息
            SysUser sysUser = null;
            List<SysUser> sysUserList;    //用户信息

            if(!"".equals(loginname) && !"".equals(password)){
                //查询用户基本信息
                param.put("loginName", loginname);

                sysLoginList = sysLoginService.list(param);

                if(sysLoginList != null && sysLoginList.size()>0){
                    sysLogin = sysLoginList.get(0);
                    String encypassword = MD5.MD5Encode(password); //使用MD5加密
                    if(sysLogin.getLoginPwd().equals(encypassword)){
                        loginInfo = "登录成功！";
                        param.put("userId",sysLogin.getId());
                        sysUserList=sysUserService.list(param);      //登录成功后，将用户信息放入session中
                        if(sysUserList!=null && sysUserList.size()>0){
                            sysUser=sysUserList.get(0);
                        }
                    }else{
                        loginInfo = "登录失败：密码错误！";
                        model.put("errMsg", "用户名或密码有误！");
                        return "login";
                    }

                    String ip = request.getRemoteAddr();
                    SysLoginLog loginlog = new SysLoginLog();
                    loginlog.setSystemCode(BaseConstants.DC_SYSCODE);
                    loginlog.setLoginName(loginname);
                    loginlog.setLoginTime(new Date());
                    loginlog.setLoginIp(ip);
                    loginlog.setLoginInfo(loginInfo);
                    sysLoginLogService.insert(loginlog);

                    Map<String, Object> userparam = new HashMap<String, Object>();
                    userparam.put("userId", sysLogin.getId());
                    List<SysRoleUser> roleUserlist = sysRoleUserService.list(userparam);
                    List<SysRole> roleList = new ArrayList<SysRole>();
                    List<SysMenu> menuList = new ArrayList<SysMenu>();
                    for(int i=0;i<roleUserlist.size();i++){
                        Long roleId = roleUserlist.get(i).getRoleId();
                        Map<String, Object> roleparam = new HashMap<String, Object>();
                        roleparam.put("id", roleId);
                        SysRole role = sysRoleService.get(roleparam);
                        roleList.add(role);
                        List<SysRoleMenu> roleMenuList = sysRoleMenuService.list(userparam);
                        for(int j=0;j<roleMenuList.size();j++){
                            Long menuCode = roleMenuList.get(j).getMenuCode();
                            Map<String, Object> menuparam = new HashMap<String, Object>();
                            menuparam.put("menuCode", menuCode);
                            List<SysMenu> l = sysMenuService.list(menuparam);
                            menuList.add(l.get(0));
                        }
                    }

                    SessionUser sessionUser = new SessionUser();
                    sessionUser.setSysLogin(sysLogin);
                    sessionUser.setSysUser(sysUser);
                    sessionUser.setSysLoginList(sysLoginList);
                    sessionUser.setSysUserList(sysUserList);
                    sessionUser.setRoleList(roleList);
                    sessionUser.setMenuList(menuList);
                    this.setSessionObject(request,BaseConstants.SESSION_USER, sessionUser);
                    return "redirect:index.do";

                }else{ //数据库验证
                    model.put("errMsg", "用户名或密码有误！");
                    return "login";
                }
            }else{
                model.put("errMsg", "用户名或密码有误！");
                return "login";
            }
        }else{
            return "/login";
        }

    }

    /**
     * 退出
     *
     * @param request
     * @param response
     * @param model
     * @return
     * @throws ServletException
     */
    @RequestMapping("/login_out")
    public String loginOutHandler(HttpServletRequest request, HttpServletResponse response, ModelMap model) throws ServletException {
        this.setSessionObject(request, BaseConstants.SESSION_USER, null);
        request.getSession().removeValue(BaseConstants.SESSION_USER);
        return "redirect:login";
    }


}
