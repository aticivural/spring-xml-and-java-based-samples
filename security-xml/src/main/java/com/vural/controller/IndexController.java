package com.vural.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class IndexController {

    @RequestMapping(value = "/admin**", method = RequestMethod.GET)
    public ModelAndView adminPage() {

        ModelAndView model = new ModelAndView();
        model.addObject("title", "Spring Security Hello World");
        model.addObject("message", "This is protected page!");
        model.setViewName("admin");

        return model;

    }

    @RequestMapping(value = "/secure/page")
    public ModelAndView page1(final ModelMap model) {
        ModelAndView modelAndView = new ModelAndView("page");
        return modelAndView;
    }

    @RequestMapping(value = "/login")
    public String login(final ModelMap model) {
        return "login";
    }

}
