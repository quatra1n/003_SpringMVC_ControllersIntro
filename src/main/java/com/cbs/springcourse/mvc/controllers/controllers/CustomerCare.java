package com.cbs.springcourse.mvc.controllers.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/customer_care")
public class CustomerCare {

    @GetMapping("/thanks")
    public String thanks() {
        return "customer_care/thanks";
    }

    @GetMapping("/feedback")
    public String feedback() {
        return "customer_care/feedback";
    }

    @GetMapping("/wait24h")
    public String wait24h() {
        return "customer_care/wait24h";
    }
}
