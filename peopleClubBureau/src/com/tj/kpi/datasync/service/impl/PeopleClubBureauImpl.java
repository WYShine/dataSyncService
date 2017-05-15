package com.tj.kpi.datasync.service.impl;

import com.tj.kpi.datasync.entity.HRSSBData;
import com.tj.kpi.datasync.entity.ResultObject;
import com.tj.kpi.datasync.service.PeopleClubBureau;
import com.tj.kpi.datasync.utils.JdbcUtils;
import com.tj.kpi.datasync.utils.ResultCodes;
import com.tj.kpi.datasync.utils.Transformer;

import javax.jws.WebService;
import java.sql.*;
import java.util.ArrayList;

/**
 * Created by C310 on 2017/4/20.
 */
@WebService(endpointInterface = "com.tj.kpi.datasync.service.PeopleClubBureau",serviceName = "PeopleClubBureau")
public class PeopleClubBureauImpl implements PeopleClubBureau{

    private Connection connection;
    private Statement statement;
    private ResultSet resultSet;
    private PreparedStatement preStatement;
    @Override
    public ResultObject getAll() {
        String sql = "select * from smart_city_hrssb";
        ResultObject resultObject = new ResultObject();
        ArrayList<HRSSBData> resultList;

        try {
            connection = JdbcUtils.getConnection();
            statement = connection.createStatement();
            resultSet = statement.executeQuery(sql);
            resultList = Transformer.toHRSSBDataList(resultSet);
            resultObject.setResult(resultList);
            if (resultList.isEmpty()){
                resultObject.setResultCode(ResultCodes.NODATA);
            }else {
                resultObject.setResultCode(ResultCodes.SUCCESS);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            JdbcUtils.releaseResources(resultSet,statement,connection);
        }
        return resultObject;
    }

    @Override
    public ResultObject getByDate(String date) {
        String sql = "select * from smart_city_hrssb WHERE apply_date>= ? ";
        ResultObject resultObject = new ResultObject();
        ArrayList<HRSSBData> resultList;
        try {
            connection = JdbcUtils.getConnection();
            preStatement = connection.prepareStatement(sql);
            preStatement.setLong(1, Long.valueOf(date));
            resultSet = preStatement.executeQuery();
            resultList = Transformer.toHRSSBDataList(resultSet);
            resultObject.setResult(resultList);
            if (resultList.isEmpty()){
                resultObject.setResultCode(ResultCodes.NODATA);
            }else {
                resultObject.setResultCode(ResultCodes.SUCCESS);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            JdbcUtils.releaseResources(resultSet,preStatement,connection);
        }
        return resultObject;
    }
}
