package com.cxx.controller;

import com.cxx.controller.pojo.Users;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;

/**
 * @author 陈喜喜
 * @date 2022-07-31 22:11
 */
@Controller
public class DataSubmitAction {
    /**
     *  姓名<input name="uname"><br>
     *  年龄<input name="uage"><br>
     */
    @RequestMapping(value = "/one.action")
    public String one(String uname,int uage) {
        System.out.println("uname="+uname+" uage="+uage+100);
        return "main";
    }

    /**
     *  姓名<input name="name"><br>   private-String name;
     *  年龄<input name="age"><br>    private-int age;
     */
    @RequestMapping(value = "/two.action")
    public String one(Users u) {
        System.out.println(u);
        return "main";
    }

    /**
     * <a href="${pageContext.request.contextPath}/three/张三/20.action">动态占位符提交</a>
     */
    @RequestMapping(value = "/three/{uname}/{age}.action")
    public String three(
            @PathVariable("uname") String name,
            @PathVariable int age) {
        System.out.println("name: " + name + " age: " + (age+100));
        return "main";
    }

    /**
     * 姓名<input name="uname"><br>
     * 年龄<input name="uage"><br>
     */
    @RequestMapping(value = "/four.action")
    public String four(
            @RequestParam("uname") String name,
            @RequestParam("uage")int age) {
        System.out.println("name: " + name + " age: " + (age+100));
        return "main";
    }
    /**
     * 姓名<input name="name"><br>
     * 年龄<input name="age"><br>
     */
    @RequestMapping(value = "/five.action")
    public String five(HttpServletRequest req) {
        String name = req.getParameter("name");
        int age = Integer.parseInt(req.getParameter("age"));
        System.out.println("name: " + name + " age: " + (age+100));
        return "main";
    }
}
