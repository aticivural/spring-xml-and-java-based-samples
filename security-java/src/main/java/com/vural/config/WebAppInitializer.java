package com.vural.config;

import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.ContextLoaderListener;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;
import org.springframework.web.servlet.support.AbstractDispatcherServletInitializer;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRegistration;

public class WebAppInitializer implements WebApplicationInitializer {

    @Override
    public void onStartup(ServletContext servletContext) throws ServletException {

        AnnotationConfigWebApplicationContext rootContext = new AnnotationConfigWebApplicationContext();
        rootContext.register(AppConfig.class);
        servletContext.addListener(new ContextLoaderListener(rootContext));


        AnnotationConfigWebApplicationContext dispatcherContext = new AnnotationConfigWebApplicationContext();
        dispatcherContext.register(MvcConfig.class);

        ServletRegistration.Dynamic dispatcherServlet = servletContext.addServlet("dispatcher", new DispatcherServlet(dispatcherContext));
        dispatcherServlet.setLoadOnStartup(1);
        dispatcherServlet.addMapping("/");
    }
}


    /*AnnotationConfigWebApplicationContext rootContext = new AnnotationConfigWebApplicationContext();
        rootContext.register(MvcConfig.class);
        servletContext.addListener(new ContextLoaderListener(rootContext));


        AnnotationConfigWebApplicationContext dispatcherContext = new AnnotationConfigWebApplicationContext();
        dispatcherContext.register(MvcConfig.class);

        ServletRegistration.Dynamic dispatcherServlet = servletContext.addServlet("dispatcher", new DispatcherServlet(dispatcherContext));
        dispatcherServlet.setLoadOnStartup(1);
        dispatcherServlet.addMapping("/");*/




    /*old config*/

    /*AnnotationConfigWebApplicationContext webApplicationContext = new AnnotationConfigWebApplicationContext();
        webApplicationContext.register(MvcConfig.class);

        servletContext.addListener(new ContextLoaderListener(webApplicationContext));

        webApplicationContext.setServletContext(servletContext);

        ServletRegistration.Dynamic dispatcherServlet = servletContext.addServlet("dispatcher", new DispatcherServlet(webApplicationContext));
        dispatcherServlet.setLoadOnStartup(1);
        dispatcherServlet.addMapping("/");*/