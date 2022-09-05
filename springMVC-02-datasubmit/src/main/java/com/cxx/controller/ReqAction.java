package com.cxx.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @author 陈喜喜
 * @date 2022-07-31 22:11
 */
@Controller
public class ReqAction {
    @RequestMapping(value = "/req.action", method = RequestMethod.GET)
    public String req() {
        System.out.println("我是处理Get请求的");
        return "main";
    }
    @RequestMapping(value = "/req.action", method = RequestMethod.POST)
    public String reqQ() {
        System.out.println("我是处理Post请求的");
        return "main";
    }
}
