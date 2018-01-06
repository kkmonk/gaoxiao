package com.upc.demosys.controller;

import com.upc.demosys.dao.CollegeMapper;
import com.upc.demosys.dao.MajorMapper;
import com.upc.demosys.model.College;
import com.upc.demosys.model.Major;
import com.upc.demosys.service.QueryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

@Controller
public class LeftController {

    @Autowired
    QueryService queryService;

    @RequestMapping(value={"/addinfo"})
    public String addinfo(Model model){
        return "addinfo";
    }
    @RequestMapping(value="/queryinfo")
    public String queryinfo(Model model){
        ArrayList<College> colleges = (ArrayList<College>) queryService.getALLCollege();
        HashMap<College,List<Major>> comjMap = (HashMap<College, List<Major>>) queryService.getCoandMaMapper();
        System.out.println(colleges.get(0).getCoName());
        model.addAttribute("colleges",colleges);
        model.addAttribute("coj",comjMap);
        return "queryinfo";
    }
    @RequestMapping(value="/form")
    public String form(){
        return "form";
    }

    @RequestMapping(value="/test")
    public String testd(Model model){
        ArrayList<College> colleges = (ArrayList<College>) queryService.getALLCollege();
        HashMap<College,List<Major>> comjMap = (HashMap<College, List<Major>>) queryService.getCoandMaMapper();

        model.addAttribute("colleges",colleges);
        model.addAttribute("coj",comjMap);

        return "test";
    }


}
