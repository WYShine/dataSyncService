package com.tj.kpi.datasync.main;

import com.tj.kpi.datasync.serviceimpl.PeopleClubBureauImpl;

import javax.xml.ws.Endpoint;
import java.net.InetAddress;
import java.net.UnknownHostException;

/**
 * Created by C310 on 2017/4/24.
 */
public class JWSWebservice {
    public static void main(String[] args) {
        InetAddress inetAddress = null;
        try {
            inetAddress = inetAddress.getLocalHost();
            System.out.println("Starting PCB service");
            PeopleClubBureauImpl implementor = new PeopleClubBureauImpl();
            String address = "http://"+inetAddress.getHostAddress()+":9000/PeopleClubBureau";
            Endpoint.publish(address,implementor);
            System.out.println("PCB service started");
        } catch (UnknownHostException e) {
            e.printStackTrace();
        }
    }
}
