package com.upc.demosys.dao;

import com.upc.demosys.model.Reportcard;

public interface ReportcardMapper {
    int insert(Reportcard record);

    int insertSelective(Reportcard record);
}