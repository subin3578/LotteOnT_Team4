package com.lotte4.controller.pagecontroller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class CustomerServiceController {

    @GetMapping("/cs/list")
    public String notice(){

        return "/cs/notice/list";

    }

    @GetMapping("/cs/faq/list")
    public String faq(){

        return "/cs/faq/list";

    }

    @GetMapping("/cs/index")
    public String cs(){
        return "/cs/index";
    }


}
