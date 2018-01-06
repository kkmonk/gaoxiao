package com.upc.demosys.controller;

import com.sun.deploy.net.HttpRequest;
import com.sun.deploy.net.HttpResponse;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;

@Controller
public class IndexController {

    @RequestMapping(value={"/login"})
    public String login(Model model, HttpServletRequest request){
        String name = request.getParameter("username");
        model.addAttribute("username",request.getParameter("username"));
        model.addAttribute("password",request.getParameter("password"));
        String role = request.getParameter("role");
        model.addAttribute("role",role);
        return "login";
    }
    @RequestMapping(value={"/adminmain"})
    public String admin(Model model){
        return "adminmain";
    }
    @RequestMapping(value="/stumain")
    public String stu(){
        return "stumain";
    }
    @RequestMapping(value="/teamain")
    public String tea(){
        return "teamain";
    }
    //frame
    @RequestMapping(value = "/left")
    public String left() {
        return "left";
    }
    @RequestMapping(value = "/top")
    public String top() {
        return "top";
    }
    @RequestMapping(value = "/index")
    public String index() {
        return "index";
    }





}
