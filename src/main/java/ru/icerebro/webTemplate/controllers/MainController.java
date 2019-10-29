package ru.icerebro.webTemplate.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MainController {


    @GetMapping(value = "/")
    private ModelAndView welcomePage(){
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("welcomePage");

        return modelAndView;
    }
}
