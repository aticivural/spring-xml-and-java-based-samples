package com.vural;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class MessageManager {

    @Autowired
    private HelloWorldService helloWorldService;

    public void printMessage(){
        System.out.println(this.helloWorldService.getMessage());
    }
}
