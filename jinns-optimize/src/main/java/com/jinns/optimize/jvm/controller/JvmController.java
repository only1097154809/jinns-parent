package com.jinns.optimize.jvm.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

@RestController
@Slf4j
@RequestMapping("/jvm")
public class JvmController {

    @GetMapping("/test")
    public String test(@RequestParam("id")String id ,@RequestParam("name")String name){
        return "id是: "+id+" name是 "+name;
    }
}
