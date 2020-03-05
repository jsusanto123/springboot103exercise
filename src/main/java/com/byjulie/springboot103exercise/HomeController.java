package com.byjulie.springboot103exercise;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
    @RequestMapping("/")
    public String mystupidpage (){
        return "mystupidtemplate";
    }
}
