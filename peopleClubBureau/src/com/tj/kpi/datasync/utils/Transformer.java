package com.tj.kpi.datasync.utils;

import com.tj.kpi.datasync.entity.HRSSBData;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 * Created by C310 on 2017/5/6.
 */
public class Transformer {

    public static ArrayList<HRSSBData> toHRSSBDataList(ResultSet resultSet) {

        ArrayList<HRSSBData> result = new ArrayList<>();
        HRSSBData hrssbData;
        if (resultSet == null) {
            return result;
        }
        try {
            while (resultSet.next()) {
                hrssbData = new HRSSBData();
                hrssbData.setCreateDate(String.valueOf(resultSet.getLong(1)));
                hrssbData.setApplyDate(String.valueOf(resultSet.getLong(2)));
                hrssbData.setUbeif_income(resultSet.getDouble(3));
                hrssbData.setUbeif_expenditure(resultSet.getDouble(4));
                hrssbData.setUbeif_balance(resultSet.getDouble(5));
                hrssbData.setUbei_on_job_staff_number(resultSet.getLong(6));
                hrssbData.setUbei_retired_staff_number(resultSet.getLong(7));
                hrssbData.setUbei_new_retired_staff_number(resultSet.getLong(8));
                hrssbData.setUif_income(resultSet.getDouble(9));
                hrssbData.setUif_expenditure(resultSet.getDouble(10));
                hrssbData.setUif_balance(resultSet.getDouble(11));
                hrssbData.setUi_new_jobless_claims(resultSet.getLong(12));
                hrssbData.setUi_jobless_claims(resultSet.getLong(13));
                hrssbData.setUebmif_income(resultSet.getDouble(14));
                hrssbData.setUebmif_local_expenditure(resultSet.getDouble(15));
                hrssbData.setUebmif_nonlocal_expenditure(resultSet.getDouble(16));
                hrssbData.setUebmif_balance(resultSet.getDouble(17));
                hrssbData.setUebmi_insured_number(resultSet.getLong(18));
                hrssbData.setUrbmif_income(resultSet.getDouble(19));
                hrssbData.setUrbmif_expenditure(resultSet.getDouble(20));
                hrssbData.setUrbmi_insured_number(resultSet.getLong(21));
                hrssbData.setWiif_income(resultSet.getDouble(22));
                hrssbData.setWiif_expenditure(resultSet.getDouble(23));
                hrssbData.setWiif_balance(resultSet.getDouble(24));
                hrssbData.setWii_insured_number(resultSet.getLong(25));
                hrssbData.setWii_l1_to_l4_number(resultSet.getLong(26));
                hrssbData.setWii_l5_to_l10_number(resultSet.getLong(27));
                hrssbData.setWii_death_number(resultSet.getLong(28));
                hrssbData.setMif_income(resultSet.getDouble(29));
                hrssbData.setMif_expenditure(resultSet.getDouble(30));
                hrssbData.setMif_balance(resultSet.getDouble(31));
                hrssbData.setMi_insured_number(resultSet.getLong(32));
                hrssbData.setMi_declared_number(resultSet.getLong(33));
                result.add(hrssbData);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return result;
    }
}
