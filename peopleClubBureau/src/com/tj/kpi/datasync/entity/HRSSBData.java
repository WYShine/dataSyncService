package com.tj.kpi.datasync.entity;

import java.io.Serializable;
import java.sql.Date;
import java.sql.Timestamp;

/**
 * Created by C310 on 2017/5/6.
 * 人社局数据
 */
public class HRSSBData implements Serializable {

    //当月城镇基本养老保险基金收入
    private double ubeif_income;
    //当月城镇基本养老保险基金支出
    private double ubeif_expenditure;
    //当月城镇基本养老保险基金结余
    private double ubeif_balance;
    //当前城镇基本养老保险在职职工参保人数
    private long ubei_on_job_staff_number;
    //当前城镇基本养老保险离退人员参保数
    private long ubei_retired_staff_number;
    //当月新增离退人员数
    private long ubei_new_retired_staff_number;

    //当月失业保险基金收入
    private double uif_income;
    //当月失业保险基金支出
    private double uif_expenditure;
    //当月失业保险基金结余
    private double uif_balance;
    //当月新增失业金领取人数
    private long ui_new_jobless_claims;
    //当前失业金领取人数
    private long ui_jobless_claims;

    //	当月城镇基本医疗保险基金收入
    private double uebmif_income;
    //	当月城镇基本医疗保险基金本地支出
    private double uebmif_local_expenditure;
    //	当月城镇基本医疗保险基金外地支出
    private double uebmif_nonlocal_expenditure;
    //	当月城镇基本医疗保险基金结余
    private double uebmif_balance;
    //	当前城镇基本医疗保险参保人数
    private long uebmi_insured_number;

    //	当月城镇居民医疗保险基金收入
    private double urbmif_income;
    //	当月城镇居民医疗保险基金本地支出
    private double urbmif_expenditure;
    //	当前城镇居民医疗保险参保人数
    private long urbmi_insured_number;

    //	当月工伤保险基金收入
    private double wiif_income;
    //	当月工伤保险基金支出
    private double wiif_expenditure;
    //	当月工伤保险基金结余
    private double wiif_balance;
    //	当前工伤保险参保人数
    private long wii_insured_number;
    //	当月一级至四级工伤待遇申报人数
    private long wii_l1_to_l4_number;
    //	当月五级至十级工伤待遇申报人数
    private long wii_l5_to_l10_number;
    //	当月工伤死亡待遇申报人数
    private long wii_death_number;

    //	当月生育保险基金收入
    private double mif_income;
    //	当月生育保险基金支出
    private double mif_expenditure;
    //	当月生育保险基金结余
    private double mif_balance;
    //	当前生育保险参保人数
    private long mi_insured_number;
    //	当月生育保险待遇申报人数
    private long mi_declared_number;
    //创建时间
    private String createDate;
    //数据对应日期
    private String applyDate;

    public double getUbeif_income() {
        return ubeif_income;
    }

    public void setUbeif_income(double ubeif_income) {
        this.ubeif_income = ubeif_income;
    }

    public double getUbeif_expenditure() {
        return ubeif_expenditure;
    }

    public void setUbeif_expenditure(double ubeif_expenditure) {
        this.ubeif_expenditure = ubeif_expenditure;
    }

    public double getUbeif_balance() {
        return ubeif_balance;
    }

    public void setUbeif_balance(double ubeif_balance) {
        this.ubeif_balance = ubeif_balance;
    }

    public long getUbei_on_job_staff_number() {
        return ubei_on_job_staff_number;
    }

    public void setUbei_on_job_staff_number(long ubei_on_job_staff_number) {
        this.ubei_on_job_staff_number = ubei_on_job_staff_number;
    }

    public long getUbei_retired_staff_number() {
        return ubei_retired_staff_number;
    }

    public void setUbei_retired_staff_number(long ubei_retired_staff_number) {
        this.ubei_retired_staff_number = ubei_retired_staff_number;
    }

    public long getUbei_new_retired_staff_number() {
        return ubei_new_retired_staff_number;
    }

    public void setUbei_new_retired_staff_number(long ubei_new_retired_staff_number) {
        this.ubei_new_retired_staff_number = ubei_new_retired_staff_number;
    }

    public double getUif_income() {
        return uif_income;
    }

    public void setUif_income(double uif_income) {
        this.uif_income = uif_income;
    }

    public double getUif_expenditure() {
        return uif_expenditure;
    }

    public void setUif_expenditure(double uif_expenditure) {
        this.uif_expenditure = uif_expenditure;
    }

    public double getUif_balance() {
        return uif_balance;
    }

    public void setUif_balance(double uif_balance) {
        this.uif_balance = uif_balance;
    }

    public long getUi_new_jobless_claims() {
        return ui_new_jobless_claims;
    }

    public void setUi_new_jobless_claims(long ui_new_jobless_claims) {
        this.ui_new_jobless_claims = ui_new_jobless_claims;
    }

    public long getUi_jobless_claims() {
        return ui_jobless_claims;
    }

    public void setUi_jobless_claims(long ui_jobless_claims) {
        this.ui_jobless_claims = ui_jobless_claims;
    }

    public double getUebmif_income() {
        return uebmif_income;
    }

    public void setUebmif_income(double uebmif_income) {
        this.uebmif_income = uebmif_income;
    }

    public double getUebmif_local_expenditure() {
        return uebmif_local_expenditure;
    }

    public void setUebmif_local_expenditure(double uebmif_local_expenditure) {
        this.uebmif_local_expenditure = uebmif_local_expenditure;
    }

    public double getUebmif_nonlocal_expenditure() {
        return uebmif_nonlocal_expenditure;
    }

    public void setUebmif_nonlocal_expenditure(double uebmif_nonlocal_expenditure) {
        this.uebmif_nonlocal_expenditure = uebmif_nonlocal_expenditure;
    }

    public double getUebmif_balance() {
        return uebmif_balance;
    }

    public void setUebmif_balance(double uebmif_balance) {
        this.uebmif_balance = uebmif_balance;
    }

    public long getUebmi_insured_number() {
        return uebmi_insured_number;
    }

    public void setUebmi_insured_number(long uebmi_insured_number) {
        this.uebmi_insured_number = uebmi_insured_number;
    }

    public double getUrbmif_income() {
        return urbmif_income;
    }

    public void setUrbmif_income(double urbmif_income) {
        this.urbmif_income = urbmif_income;
    }

    public double getUrbmif_expenditure() {
        return urbmif_expenditure;
    }

    public void setUrbmif_expenditure(double urbmif_expenditure) {
        this.urbmif_expenditure = urbmif_expenditure;
    }

    public long getUrbmi_insured_number() {
        return urbmi_insured_number;
    }

    public void setUrbmi_insured_number(long urbmi_insured_number) {
        this.urbmi_insured_number = urbmi_insured_number;
    }

    public double getWiif_income() {
        return wiif_income;
    }

    public void setWiif_income(double wiif_income) {
        this.wiif_income = wiif_income;
    }

    public double getWiif_expenditure() {
        return wiif_expenditure;
    }

    public void setWiif_expenditure(double wiif_expenditure) {
        this.wiif_expenditure = wiif_expenditure;
    }

    public double getWiif_balance() {
        return wiif_balance;
    }

    public void setWiif_balance(double wiif_balance) {
        this.wiif_balance = wiif_balance;
    }

    public long getWii_insured_number() {
        return wii_insured_number;
    }

    public void setWii_insured_number(long wii_insured_number) {
        this.wii_insured_number = wii_insured_number;
    }

    public long getWii_l1_to_l4_number() {
        return wii_l1_to_l4_number;
    }

    public void setWii_l1_to_l4_number(long wii_l1_to_l4_number) {
        this.wii_l1_to_l4_number = wii_l1_to_l4_number;
    }

    public long getWii_l5_to_l10_number() {
        return wii_l5_to_l10_number;
    }

    public void setWii_l5_to_l10_number(long wii_l5_to_l10_number) {
        this.wii_l5_to_l10_number = wii_l5_to_l10_number;
    }

    public long getWii_death_number() {
        return wii_death_number;
    }

    public void setWii_death_number(long wii_death_number) {
        this.wii_death_number = wii_death_number;
    }

    public double getMif_income() {
        return mif_income;
    }

    public void setMif_income(double mif_income) {
        this.mif_income = mif_income;
    }

    public double getMif_expenditure() {
        return mif_expenditure;
    }

    public void setMif_expenditure(double mif_expenditure) {
        this.mif_expenditure = mif_expenditure;
    }

    public double getMif_balance() {
        return mif_balance;
    }

    public void setMif_balance(double mif_balance) {
        this.mif_balance = mif_balance;
    }

    public long getMi_insured_number() {
        return mi_insured_number;
    }

    public void setMi_insured_number(long mi_insured_number) {
        this.mi_insured_number = mi_insured_number;
    }

    public long getMi_declared_number() {
        return mi_declared_number;
    }

    public void setMi_declared_number(long mi_declared_number) {
        this.mi_declared_number = mi_declared_number;
    }

    public String getApplyDate() {
        return applyDate;
    }

    public void setApplyDate(String applyDate) {
        this.applyDate = applyDate;
    }

    public String getCreateDate() {
        return createDate;
    }

    public void setCreateDate(String createDate) {
        this.createDate = createDate;
    }
}
