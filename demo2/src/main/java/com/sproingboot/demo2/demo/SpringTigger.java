package com.sproingboot.demo2.demo;

import org.springframework.web.bind.annotation.RestController;

@RestController
public class SpringTigger
{
    public void testfunction(){
        System.out.println("我可以的");
    }

    public static String testpushdevbranch(){
        System.out.println("我能成功的");
        return "ok";
    }
}
