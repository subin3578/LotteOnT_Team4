package com.lotte4.controller.pagecontroller.admin.config;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class ConfigController {
    
    //배너관리
    @GetMapping("/admin/config/banner")
    public String AdminconfigBanner() {
        return "/admin/config/banner";
    }

    //기본설정
    @GetMapping("/admin/config/basic")
    public String AdminconfigBasic() {
        return "/admin/config/basic";
    }
    
    //약관관리
    @GetMapping("/admin/config/policy")
    public String AdminconfigPolicy() {
        return "/admin/config/policy";
    }
    
    //버전관리
    @GetMapping("/admin/config/version")
    public String AdminconfigVersion() {
        return "/admin/config/version";
    }



}
