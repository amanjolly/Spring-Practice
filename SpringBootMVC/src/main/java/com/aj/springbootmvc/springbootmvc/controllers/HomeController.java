package com.aj.springbootmvc.springbootmvc.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {

    @GetMapping("/")
    public String home1() {
        System.out.println("Hello World MVC");
        return "index.jsp";
    }

    @GetMapping("/modelview")
    public ModelAndView home() {
        return new ModelAndView("userinput.jsp");
    }

    @PostMapping("add")
    public ModelAndView add(@RequestParam(name = "firstNumber") int num1, @RequestParam(name =
            "secondNumber") int num2) {
        int num3 = num1 + num2;
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("userinputresult.jsp");
        modelAndView.addObject("num3", num3);
        return modelAndView;
    }
}
