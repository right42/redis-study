package com.study.redis;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpSession;
import java.util.Map;

@RestController
public class TestController {

    @GetMapping("/")
    public String setId(@RequestParam("id") String id, HttpSession session){

        session.setAttribute("id", id);
        return String.valueOf(session.getAttribute("id"));
    }

    @GetMapping("/get")
    public String getId(HttpSession session){
        return String.valueOf(session.getAttribute("id"));
    }
}
