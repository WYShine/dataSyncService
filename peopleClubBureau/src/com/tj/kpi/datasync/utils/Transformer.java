package com.tj.kpi.datasync.utils;

import com.tj.kpi.datasync.entity.HRSSBData;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 * Created by C310 on 2017/5/6.
 */
public class Transformer {

    public static ArrayList<HRSSBData> toHRSSBdataList(ResultSet resultSet) {

        ArrayList<HRSSBData> result = new ArrayList<>();
        HRSSBData hrssbData;
        if (resultSet == null) {
            return result;
        }
        try {
            while (resultSet.next()){
                hrssbData = new HRSSBData();
                hrssbData.setApplyDate(resultSet.getDate(3).toString());
                hrssbData.setUbeif_income(resultSet.getDouble(4));
                hrssbData.setUbeif_expenditure(resultSet.getDouble(5));
                hrssbData.setUbeif_balance(resultSet.getDouble(6));
                hrssbData.setUbei_on_job_staff_number(resultSet.getLong(7));
                hrssbData.setUbei_retired_staff_number(resultSet.getLong(8));
                hrssbData.setUbei_new_retired_staff_number(resultSet.getLong(9));
                hrssbData.setUif_income(resultSet.getDouble(10));
                hrssbData.setUif_expenditure(resultSet.getDouble(11));
                hrssbData.setUif_balance(resultSet.getDouble(12));
                hrssbData.setUi_new_jobless_claims(resultSet.getLong(13));
                hrssbData.setUi_jobless_claims(resultSet.getLong(14));
                hrssbData.setUebmif_income(resultSet.getDouble(15));
                hrssbData.setUebmif_local_expenditure(resultSet.getDouble(16));
                hrssbData.setUebmif_nonlocal_expenditure(resultSet.getDouble(17));
                hrssbData.setUebmif_balance(resultSet.getDouble(18));
                hrssbData.setUebmi_insured_number(resultSet.getLong(19));
                hrssbData.setUrbmif_income(resultSet.getDouble(20));
                hrssbData.setUrbmif_expenditure(resultSet.getDouble(21));
                hrssbData.setUrbmi_insured_number(resultSet.getLong(22));
                hrssbData.setWiif_income(resultSet.getDouble(23));
                hrssbData.setWiif_expenditure(resultSet.getDouble(24));
                hrssbData.setWiif_balance(resultSet.getDouble(25));
                hrssbData.setWii_insured_number(resultSet.getLong(26));
                hrssbData.setWii_l1_to_l4_number(resultSet.getLong(27));
                hrssbData.setWii_l5_to_l10_number(resultSet.getLong(28));
                hrssbData.setWii_death_number(resultSet.getLong(29));
                hrssbData.setMif_income(resultSet.getDouble(30));
                hrssbData.setMif_expenditure(resultSet.getDouble(31));
                hrssbData.setMif_balance(resultSet.getDouble(32));
                hrssbData.setMi_insured_number(resultSet.getLong(33));
                hrssbData.setMi_declared_number(resultSet.getLong(34));
                result.add(hrssbData);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return result;
    }
}
