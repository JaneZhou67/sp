package com.zb.sp.controller;

import com.zb.sp.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
public class UserController {
    @Autowired
    UserService userService;

    @Value("${server.port}")
    String port;

    @RequestMapping("/hi")
    public String hello(){
        System.out.println(port);
        return "Welcome to SpringCloud!!!";
    }

    @RequestMapping("/list")
    public List<Map> list(@RequestParam Map map){
        System.out.println("list:"+map);
        return userService.list(map);
    }

    @RequestMapping("/getAllRoles")
    public List<Map> getAllRoles(){
        return userService.getAllRoles();
    }

    @RequestMapping("/save")
    public int save(@RequestParam Map map){
        System.out.println("save:"+map);
        return userService.save(map);
    }
}
