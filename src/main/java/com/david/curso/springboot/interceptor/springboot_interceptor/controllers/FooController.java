package com.david.curso.springboot.interceptor.springboot_interceptor.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collections;
import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;

@RestController
@RequestMapping("/app")
public class FooController {

    @GetMapping("/foo")
    public Map<String, String> foo() {

        return Collections.singletonMap("message", "handler foo del el controlador");

    }

    @GetMapping("/bar")
    public Map<String, String> bar() {

        return Collections.singletonMap("message", "handler bar del el controlador");

    }

    @GetMapping("/baz")
    public Map<String, String> baz() {

        return Collections.singletonMap("message", "handler baz del el controlador");

    }

}
