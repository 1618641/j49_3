package org.java.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by 马果 on 2018/7/9.
 */
@Controller
public class FirstController {

    @RequestMapping("/first")
    @ResponseBody
    public String load(){
        System.out.println("------------->>>>>>>load");
        return "hello world";
    }
}
