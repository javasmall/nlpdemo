package com.nlpdemoclient.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
public class thymleafController {


    @Value("${server.port}")
    String port;
    @Value("${eureka.instance.ip-address}")
    String ip;
    @GetMapping("index")
    public String inde(Model model)
    {
        model.addAttribute("value",ip+":"+port);
        return "index";
    }
    @GetMapping("index/{qq}")
    public String index(@PathVariable("qq") String qq,  Model model)
    {
        model.addAttribute("value",ip+":"+port);
        return "index";
    }
}
