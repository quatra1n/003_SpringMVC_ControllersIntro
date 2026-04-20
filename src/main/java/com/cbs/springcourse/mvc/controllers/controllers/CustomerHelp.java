package com.cbs.springcourse.mvc.controllers.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/customer_help")
public class CustomerHelp {
    //ссылка для браузера
    //http://localhost:8080/spring_controllers_intro_war_exploded/customer_help/visitpage

    @GetMapping("/visitpage")
    public String visitPage() {
        return "customer_help/visitpage";
    }

    @GetMapping("/faq")
    public String faq() { return "customer_help/faq"; }

    @GetMapping("/support")
    public String support() { return "customer_help/support"; }
}
