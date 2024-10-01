package com.david.curso.springboot.interceptor.springboot_interceptor;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class MvcConfig implements WebMvcConfigurer {

    @Autowired
    @Qualifier("loadingTimeInterceptor")
    private HandlerInterceptor timeInterceptor;

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        // asi se agrega a los que quieras que se ejecuten
        /*
         * registry.addInterceptor(timeInterceptor).addPathPatterns("/app/bar",
         * "/app/baz");
         */
        // asi se excluye
        registry.addInterceptor(timeInterceptor).excludePathPatterns("/app/bar", "/app/baz");
    }

}
