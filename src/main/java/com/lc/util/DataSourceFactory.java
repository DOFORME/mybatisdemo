package com.lc.util;

import org.apache.ibatis.datasource.unpooled.UnpooledDataSource;

import javax.sql.DataSource;

public class DataSourceFactory {

    public static DataSource getDataSource() {
        String driver = "com.mysql.cj.jdbc.Driver";

        String url = "jdbc:mysql://localhost:3306/school?characterEncoding=utf-8&serverTimezone=GMT%2b8&useSSL=false";

        String username = "root";

        String password = "123456";

        UnpooledDataSource dataSource = new UnpooledDataSource(driver, url, username, password);

        return dataSource;
    }
}
