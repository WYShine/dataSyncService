package com.tj.kpi.datasync.utils;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.sql.*;
import java.util.Properties;

/**
 * Created by C310 on 2017/4/23.
 */
public class JdbcUtils {
    private static String driverName;
    private static String url;
    private static String user;
    private static String password;
    private static String dbinfo = "dbinfo.properties";

    static {
        try {
            String path = JdbcUtils.class.getResource("/").getPath();
            String websiteURL = (path.replace("/build/classes", "").replace("%20", " ").replace("classes/", "") + dbinfo).replaceFirst("/", "");
            InputStream in = new FileInputStream(websiteURL);
            Properties properties = new Properties();
            properties.load(in);
            driverName = properties.getProperty("driverName");
            url = properties.getProperty("url");
            user = properties.getProperty("user");
            password = properties.getProperty("password");
            Class.forName(driverName);
        }  catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * 获取连接
     *
     * @return
     * @throws SQLException
     */
    public static Connection getConnection() throws SQLException {
        return DriverManager.getConnection(url, user, password);
    }

    public static void releaseResources(ResultSet resultSet, Statement statement, Connection connection) {

        try {
            if (resultSet != null) {
                resultSet.close();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                if (statement != null) {
                    statement.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            } finally {
                try {
                    if (connection != null) {
                        connection.close();
                    }
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }
    }


}
