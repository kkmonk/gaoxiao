package com.upc.demosys;

import com.upc.demosys.dao.CollegeMapper;
import com.upc.demosys.dao.MajorMapper;
import com.upc.demosys.model.College;
import com.upc.demosys.model.Major;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import java.util.ArrayList;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = DemosysApplication.class)
public class DemosysApplicationTests {

	@Autowired
	CollegeMapper colm;
	@Autowired
	MajorMapper majorMapper;

	@Test
	public void contextLoads() {

		College co = colm.selectByPrimaryKey("1001");
		ArrayList<College> colist = (ArrayList<College>) colm.selectAllCollege();
		for(College coi : colist){
			System.out.println(coi.getCoName());
		}
		ArrayList<Major> majors = (ArrayList<Major>)majorMapper.selectALLMajor();
		for(Major mj : majors){
			System.out.println(mj.getmName());
		}
	}

}
