package com.lynch.test;

import com.lynch.test.model.Student;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
@RequestMapping(value = "/xxx")
public class MyController {

    @RequestMapping(value = "/say",method = RequestMethod.POST)
    public Student say(){
        return new Student("lynchpiu",28);
    }

    //, headers = "content-type=application/json"
    @RequestMapping(value = "/get" , method = RequestMethod.GET)
    public Student get(){
        return new Student("xxxx",30);
    }
}
