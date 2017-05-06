package com.tj.kpi.datasync.entity;

import java.io.Serializable;
import java.util.ArrayList;

/**
 * Created by C310 on 2017/4/23.
 */
public class ResultObject implements Serializable{
    private int resultCode;
    private ArrayList<HRSSBData> result;

    public int getResultCode() {
        return resultCode;
    }

    public void setResultCode(int resultCode) {
        this.resultCode = resultCode;
    }

    public ArrayList<HRSSBData> getResult() {
        return result;
    }

    public void setResult(ArrayList<HRSSBData> result) {
        this.result = result;
    }
}
