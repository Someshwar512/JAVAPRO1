package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller

    public class homecontroller 
    {
    @RequestMapping ("/home")
    public String home ()
    {
    return "home" ;
     }
    @RequestMapping ("/innerpage")
     public String innerpage ()
     {
    return "innerpage" ;
     }
    @RequestMapping ("/portfolio")
    public String portfolio ()
    {
    	return "portfolio" ;	
    }
    }