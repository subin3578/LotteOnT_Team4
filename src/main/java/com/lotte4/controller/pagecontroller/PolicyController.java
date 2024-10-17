package com.lotte4.controller.pagecontroller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller()
public class PolicyController {

    @GetMapping("/policy/buy")
    public String buy() {
        return "buyer";
    }

    @GetMapping("/policy/finance")
    public String finance() {
        return "/policy/finance";
    }

    @GetMapping("/policy/location")
    public String location() {
        return "/policy/location";
    }

    @GetMapping("/policy/privacy")
    public String privacy() {
        return "/policy/privacy";
    }

    @GetMapping("/policy/seller")
    public String seller() {
        return "/policy/seller";
    }
}
