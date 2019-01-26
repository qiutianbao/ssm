package com.jxtb.base.manager.controller;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;

import com.jxtb.common.constants.BaseConstants;
import com.jxtb.common.page.PageProperty;
import com.jxtb.utils.Utils;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.web.servlet.mvc.multiaction.MultiActionController;

/**
 * @description 所有Controller都必须继承与本Controller，此类中的方法主要是Controller公用方法
 */
public abstract class BaseController extends MultiActionController {

    protected final Log log = LogFactory.getLog(this.getClass());

    protected String getParameter(HttpServletRequest request,String param){
        String value = Utils.trim(request.getParameter(param));
        return value;
    }

    protected String[] getParameters(HttpServletRequest request,String param){
        String[] values = request.getParameterValues(param);
        return values;
    }

    protected void setSessionObject(HttpServletRequest request,String key,Object obj){
        request.getSession().setAttribute(key, obj);
    }

    protected Object getSessionObject(HttpServletRequest request,String key){
        return request.getSession().getAttribute(key);
    }

    /**
     * 设置分页对象基本信息
     * @param req
     * @param pp
     */
    protected void setPageInfo(HttpServletRequest req,PageProperty pp){
//		String pageNo = getParameter(req, "pageNo");
//		String pageSize = getParameter(req, "pageSize");

        //适用于 easy ui datagrid
        String pageSize = getParameter(req, "rows");
        String pageNo = getParameter(req, "page");


        int pageNum = 1;

        int pageSizeNum = BaseConstants.PAGE_SIZE_DEFAULT; // 获取每页数据条数

        Cookie[] cooks=req.getCookies();
        if(cooks.length!=0){
            for(int i=0;i<cooks.length;i++){
                if(cooks[i].getName().equalsIgnoreCase("pageSize")){
                    pageSizeNum=Utils.parseInt(cooks[i].getValue().toString(), 20);
                }
            }
        }
        if (!"".equals(pageNo)) {
            pageNum = Utils.parseInt(pageNo, 1); // 将字符串数字转化为int型数字,把pageNo传进去，转换为整型，默认为1
        }
        if (!"".equals(pageSize)) {
            pageSizeNum = Utils.parseInt(pageSize, 1);
        }

        pp.setNpage(pageNum); // 更新页码值
        pp.setNpagesize(pageSizeNum); // 更新页面查询数量值
    }


}
