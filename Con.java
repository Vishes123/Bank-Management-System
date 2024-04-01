package Bank.Management.System;

import java.sql.*;

public class Con {
    Connection connection;
    Statement statement;
    public Con(){
        try{


            connection= DriverManager.getConnection("jdbc:mysql://localhost:3306/bankSystem","root",  "Vishesh@123");
           statement = connection.createStatement();
        }
        catch (Exception E){
            E.printStackTrace();
        }
    }
}
