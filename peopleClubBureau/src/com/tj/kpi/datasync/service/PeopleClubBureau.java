package com.tj.kpi.datasync.service;

import com.tj.kpi.datasync.entity.ResultObject;

import javax.jws.WebParam;
import javax.jws.WebService;

/**
 * Created by C310 on 2017/4/20.
 */

@WebService
public interface PeopleClubBureau {
    /**
     * 获取所有数据
     * @return
     */
    ResultObject getAll();

    /**
     * 获取指定日期之后的数据
     * @param date
     * @return
     */
    ResultObject getByDate(@WebParam(name = "date") String date);
}
