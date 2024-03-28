package inhatc.cse.springboot.testproject.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HiController {

    //    @RequestMapping(value = "/hello", method = RequestMethod.GET)
    @RequestMapping("Hi")
    public String hi() {
        return "Hi";
    }
}
