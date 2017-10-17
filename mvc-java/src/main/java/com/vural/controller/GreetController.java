package com.vural.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class GreetController {

    @RequestMapping(path= "/greet/{name}",method= RequestMethod.GET)
    public String greet(@PathVariable String name, ModelMap model){
        String greeting =" Hello !!!" + name + " How are You?";
        model.addAttribute("greet", greeting);
        System.out.println(greeting);

        return "greet";
    }
}
