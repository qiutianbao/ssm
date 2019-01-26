package com.jxtb.portal.filter;

import com.jxtb.common.constants.BaseConstants;

import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @description 检查用户登录状态的Filter，过滤所有的url请求
 */
public class CheckSessionOutFilter implements Filter {
    protected FilterConfig filterConfig = null;

    /**
     * Take this filter out of service.
     */
    public void destroy() {
        this.filterConfig = null;
    }

    public void doFilter(ServletRequest request, ServletResponse response,
                         FilterChain chain) throws IOException, ServletException {
        HttpServletRequest hsrq = (HttpServletRequest) request;
        HttpServletResponse hsrp = (HttpServletResponse) response;
       //SessionUser person = null;
        String reqPage = hsrq.getServletPath();
	/*	if (!reqPage.trim().equals("/login.do") && !reqPage.trim().equals("/login_out.do")) {

			person = (SessionUser) hsrq.getSession().getAttribute(DatacenterBaseConstants.SESSION_USER_KEY);
			if (person == null) {
				hsrp.sendRedirect("login.do");
				return;
			}
		}*/
        chain.doFilter(request, response);

    }

    public void init(FilterConfig filterConfig) throws ServletException {
        this.filterConfig = filterConfig;
    }

}

