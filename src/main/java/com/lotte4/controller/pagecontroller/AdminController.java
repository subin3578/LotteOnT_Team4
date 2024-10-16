package com.lotte4.controller.pagecontroller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AdminController {

    @GetMapping("/admin/index")
    public String Adminhome(){
        return "admin/index";
    }

    @GetMapping("/admin/member/list")
    public String Adminmemberlist(){
        return "admin/member_list";
    }

    @GetMapping("/admin/member/point")
    public String Adminmemberpoint(){
        return "admin/member_point";
    }

}
