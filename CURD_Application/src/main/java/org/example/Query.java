package org.example;

import java.sql.Connection;

public class Query {
    public static void main(String[] args) {
        Connection con = DBConnection.getConnection();
        if(con != null){
            System.out.println(con);
        } else {
            System.out.println(con);
        }
    }
}
