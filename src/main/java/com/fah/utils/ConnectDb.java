package com.fah.utils;

import com.matisse.MtDatabase;
import com.matisse.MtException;
import org.springframework.stereotype.Component;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectDb {

    public static Connection getConn() throws ClassNotFoundException, SQLException{
        Class.forName("com.matisse.sql.MtDriver");
        Connection conn = DriverManager.getConnection("jdbc:mt://localhost/fotheby");
        return conn;
    }

    public static void disconnect(Connection conn) throws SQLException {
        conn.close();
    }
}