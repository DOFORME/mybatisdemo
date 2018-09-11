package com.lc.web;

import com.lc.pojo.Student;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("school/student")
public class StudentController {

    @RequestMapping("/list")
    @ResponseBody
    public Student list(Student request, Model model) {
        model.addAttribute("test", "istest");
        String s = "teststring";
        return request;
    }
}
