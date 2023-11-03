package com.anurag.HelloWorld.controller;

import com.anurag.HelloWorld.Greeting;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.concurrent.atomic.AtomicLong;

@Controller
public class GreetingController {
private final AtomicLong counter=new AtomicLong();
private static final String template = "Hello, %s!";
    @RequestMapping("/greeting")
    @ResponseBody
    public Greeting greeting(@RequestParam(value="name",defaultValue = "World")String name){
        return new Greeting(counter.incrementAndGet(),String.format(template,name));
    }
}
