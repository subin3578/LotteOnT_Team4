package com.lotte4.controller.pagecontroller.admin.shop;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class shopController {
    
    //상점목록
    @GetMapping("/admin/shop_list")
    public String Adminshoplist(){
        return "/admin/shop_list";
    }

    //판매자 정보
    @GetMapping("/admin/shop_sales")
    public String Adminshopsales(){
        return "/admin/shop_sales";
    }
}
