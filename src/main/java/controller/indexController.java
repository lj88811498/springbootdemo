package controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

/**
 * @Author: Monkey
 * @Date: Created in 15:30  2018/11/2.
 * @Description:
 */
@Controller
@RequestMapping("/index")
public class indexController {

    @GetMapping("/hello/{name}")
    @ResponseBody
    public Object hello(@PathVariable("name") String name){

        return "hello " + name;
    }
    @GetMapping("")
    @ResponseBody
    public Object test(){

        return "hello ok";
    }
}
