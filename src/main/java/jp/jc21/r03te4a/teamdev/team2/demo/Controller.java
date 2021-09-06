package jp.jc21.r03te4a.teamdev.team2.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class Controller {
    @GetMapping
    public HelloMessage index(){
        return new HelloMessage("Hello Spring MVC!");
    }
}

class HelloMessage{
    String message;
    public HelloMessage(String msg){
        message = msg;
    }
}