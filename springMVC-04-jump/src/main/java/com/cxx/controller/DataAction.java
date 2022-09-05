package com.cxx.controller;

import com.cxx.pojo.Users;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.util.Map;

/**
 * @author 陈喜喜
 * @date 2022-08-01 16:43
 */
@Controller
public class DataAction {
    @RequestMapping(value = "/data.action")
    public String action(HttpServletRequest request,
                         HttpServletResponse response,
                         HttpSession session,
                         ModelMap model,
                         Map map,
                         ModelMap modelMap) {
            //做一个数据，传到main. jsp页面上
            Users u = new Users("张三",22);
            //传递数据
            request. setAttribute ( "requestUsers" ,u);
            session. setAttribute ("sessionUsers" ,u) ;
            model . addAttribute ("modelUsers" ,u) ;
            map. put ("mapUsers" ,u) ;
            modelMap . addAttribute ("modelMapUsers",u) ;

            return "redirect:/admin/main.jsp"; //请求转 发方式跳转

    }
}
