package com.vural;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * Hello world!
 *
 */

@Configuration
@ComponentScan
public class App
{
    @Bean
    public HelloWorldService getMessageService(){
        return new HelloWorldServiceImpl();
    }

    public static void main( String[] args )
    {
        ApplicationContext context = new AnnotationConfigApplicationContext(App.class);
        MessageManager manager = context.getBean(MessageManager.class);
        manager.printMessage();
    }
}
