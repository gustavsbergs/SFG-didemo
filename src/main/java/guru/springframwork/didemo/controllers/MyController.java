package guru.springframwork.didemo.controllers;

import guru.springframwork.didemo.DiDemoApplication;
import org.springframework.boot.SpringApplication;
import org.springframework.stereotype.Controller;

import java.applet.AppletContext;

@Controller
public class MyController {
    public String hello(){
       System.out.println("Hello!");

       return "return";
    }
}
