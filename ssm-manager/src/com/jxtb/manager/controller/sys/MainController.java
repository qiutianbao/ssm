package com.jxtb.manager.controller.sys;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Created with IntelliJ IDEA.
 * User: Administrator
 * Date: 16-11-28
 * Time: 下午2:03
 * 进入管理主界面
 */
@Controller
public class MainController {

    @RequestMapping("/index")
    public ModelAndView loginHandler(HttpServletRequest request,HttpServletResponse response, ModelMap model) throws ServletException {
        ModelAndView mav = new ModelAndView("index");
        return mav;
    }

}
