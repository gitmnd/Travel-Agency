package com.booking.travelagency.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by MACHUNAGENDRADURGP on 01/06/2018.
 */
@Controller
public class HomeController {

    private Logger logger = LoggerFactory.getLogger(this.getClass());

    @RequestMapping("/")
    String index(){
        return "index";
    }

    @RequestMapping("/contactus")
    String contactUs(){
        return "contactus";
    }

    @RequestMapping("/deals")
    String deals(){
        return "deals";
    }
}
