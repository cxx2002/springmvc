package com.cxx.controller;

import com.cxx.pojo.Student;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.List;

/**
 * @author 陈喜喜
 * @date 2022-08-01 15:33
 */
@Controller
public class StudentListAction {
    @RequestMapping(value = "/list.action")
    @ResponseBody  //专门用来解析ajax请求的，要用这个注解必须要在springmvc.xml文件添加注解驱动
    public List<Student> list() {
        List<Student> list = new ArrayList<Student>();
        list.add(new Student("张三",23));
        list.add(new Student("李四",27));
        list.add(new Student("王五",32));
        list.add(new Student("王6",342));
        list.add(new Student("王7",332));
        return list;//springMVC框架负责将集合转为json数组
    }
}
