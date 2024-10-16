package com.lotte4.controller.pagecontroller.admin.user;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class memberComtroller {

    @GetMapping("/admin/member/list")
    public String Adminmemberlist(){
        return "admin/member_list";
    }

    @GetMapping("/admin/member/point")
    public String Adminmemberpoint(){
        return "admin/member_point";
    }
}
