package com.cxx.controller;

import com.cxx.pojo.Student;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * @author 陈喜喜
 * @date 2022-08-01 22:26
 */
@Controller
public class MyDateAction {
    private SimpleDateFormat sf = new SimpleDateFormat("yyyy-MM-dd");

    //注册一个全局的日期处理注解,@INitBinder可以注册很多全局的处理，日期，货币等待，且不需要驱动<mvc:annotation-driven>
    @InitBinder
    public void initBinder(WebDataBinder webDataBinder) {
        webDataBinder.registerCustomEditor(Date.class, new CustomDateEditor(sf,true));
    }

    @RequestMapping(value = "/myDate.action")
    public String action(Date myDate) {
        System.out.println(myDate);
        System.out.println(sf.format(myDate));
        return "show";
    }

    //其实是用jstl在显示的时候做处理
    @RequestMapping(value = "/list.action")
    public String action(HttpServletRequest req) throws ParseException {
        Student student = new Student("张三",sf.parse("2002-03-31"));
        Student student2 = new Student("张四",sf.parse("2003-12-24"));
        Student student3 = new Student("张五",sf.parse("1992-07-01"));
        List<Student> list = new ArrayList<Student>();
        list.add(student);
        list.add(student2);
        list.add(student3);
        req.setAttribute("list",list);
        return "show";
    }
   /*单个日期注入@DateTimeFormat(Pattern = "yyyy-MM-dd")
   public String myDate(
            @DateTimeFormat(pattern = "yyyy-MM-dd")Date myDate) {
        System.out.println(myDate);
        System.out.println(sf.format(myDate));
        return "show";
    }*/
}
