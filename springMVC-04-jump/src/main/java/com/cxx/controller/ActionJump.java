package com.cxx.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author 陈喜喜
 * @date 2022-08-01 16:13
 * 请求转发的作用域在服务器，url不会变，只是将另外一个page转发在了这个page，以此来实现页面的跳转
 * 而重定向的作用域在客户端，通过直接改变地址栏的url来实现页面的跳转
 * 注意：带有数据的跳转不能是重定向（作用域最少高于cookie）
 * (除非携带的数据是放在Session或者Context的，如果是相同域名和path,重定向是可以携带cookie的)
 */
@Controller
public class ActionJump {
    @RequestMapping(value = "/one.action")
    public String one() {
        System.out.println("one......请求转发页面跳转");
        return "main";//默认使用视图解析器拼接路径前缀后缀来实现页面跳转
    }
    @RequestMapping(value = "/two.action")
    public String two() {
        System.out.println("two......请求转发action跳转");
        return "forward:/other.action";//可以屏蔽视图解析器的前后缀的拼接
    }
    @RequestMapping(value = "/other.action")
    public String other() {
        System.out.println("这是other.action");
        return "main";//
    }
    @RequestMapping(value = "/three.action")
    public String three() {
        System.out.println("three......重定向页面跳转");
        return "redirect:/admin/main.jsp";//可以屏蔽视图解析器的前后缀的拼接
    }
    @RequestMapping(value = "/four.action")
    public String four() {
        System.out.println("four......重定向action跳转");
        return "redirect:/other.action";//可以屏蔽视图解析器的前后缀的拼接
    }
}
