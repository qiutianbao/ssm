package com.jxtb.manager.filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.jxtb.common.constants.BaseConstants;
import com.jxtb.manager.entity.SessionUser;

/**
 * @description 检查用户登录状态的Filter，过滤所有的url请求
 */
public class CheckSessionOutFilter implements Filter {
    protected FilterConfig filterConfig = null;

    public void doFilter(ServletRequest request, ServletResponse response,
                         FilterChain chain) throws IOException, ServletException {
        HttpServletRequest hsrq = (HttpServletRequest) request;
        HttpServletResponse hsrp = (HttpServletResponse) response;
        SessionUser person;
        String reqPage = hsrq.getServletPath();
        if (!reqPage.trim().equals("/login") && !reqPage.trim().equals("/login_out")) {

            person = (SessionUser) hsrq.getSession().getAttribute(BaseConstants.SESSION_USER);
            if (person == null) {
                hsrp.sendRedirect("login");
                return;
            }
        }
        chain.doFilter(request, response);

    }

    public void init(FilterConfig filterConfig) throws ServletException {
        this.filterConfig = filterConfig;
    }

    public void destroy() {
        this.filterConfig = null;
    }

}
