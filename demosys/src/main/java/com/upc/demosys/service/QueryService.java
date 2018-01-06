package com.upc.demosys.service;

import com.upc.demosys.dao.CollegeMapper;
import com.upc.demosys.dao.MajorMapper;
import com.upc.demosys.model.College;
import com.upc.demosys.model.Major;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class QueryService {
    @Autowired
    CollegeMapper collegeMapper;
    @Autowired
    MajorMapper majorMapper;
    public List<College> getALLCollege(){
        return collegeMapper.selectAllCollege();
    }
    public List<Major> getALLMajor(){
        return majorMapper.selectALLMajor();
    }
    public Map<College,List<Major>> getCoandMaMapper(){
        Map<College,List<Major>> comjmap = new HashMap<>();

        ArrayList<College> colleges = (ArrayList<College>) getALLCollege();
        for (College co : colleges){
            comjmap.put(co,majorMapper.selectByCoID(co.getCoId()));
        }
        return comjmap;
    }

}
