package com.cxx.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author 陈喜喜
 * @date 2022-07-31 17:10
 */
@Controller  //交给spring去创建对象
public class DemoAction {
    /**
     *以前的Servlet的规范
     * protected void doPost (Ht tpServletRequest request, Ht tpServletResponse response) throws
ServletException IOException { }
     * action中所有的功能实现都是由方法来完成的
     * action方法的规范：
     * 1)访问权限是public
     * 2)方法的返回值任意
     * 3)方法名称任意
     * 4)方法可以没有参数，如果有可是任意类型”
     * 5)要使用@Reques tMapping注解来声明个访问的路径(名称)
     */
    @RequestMapping("/demo.action")
    public String demo(){
        System.out.println("服务器被访问了.......");
        return "main";//可以直接跳转到/admin/main.jsp页面上
    }
}
