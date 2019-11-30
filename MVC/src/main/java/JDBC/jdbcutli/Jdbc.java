package JDBC.jdbcutli;

import java.sql.*;

public class Jdbc {

    private static String url="jdbc:mysql://localhost:3306/test?serverTimezone=GMT";
    private static String driver="com.mysql.cj.jdbc.Driver";
    private static String user="root";
    private static String password="123456zyb";

    public static Connection Open(){
        try {
            Class.forName(driver);
            return DriverManager.getConnection(url,user, password);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }
    public static void close(PreparedStatement ps, ResultSet rs ,Connection conn)  {

        if(ps!=null){
            try {
                ps.close ();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        if (rs!=null){
            try {
                rs.close ();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        if (conn!=null){
            try {
                conn.close ();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }

    }


}