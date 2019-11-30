package JDBC.daoimpl;

import JDBC.dao.idao;
import JDBC.domain.User;
import JDBC.jdbcutli.Jdbc;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Dao implements idao {

    private Connection connection;

    public Dao(Connection conn){
        this.connection = conn;
    }

    @Override
    public User query(String name) {
        Connection conn = connection;
        PreparedStatement ps = null;
        ResultSet res = null;
        String sql = "select * from number where name=?;";
        try {
            ps = conn.prepareStatement(sql);
            ps.setString(1, name);
            res = ps.executeQuery();
            User user = new User();
            if (res.next()) {
                user.setUserName(res.getString("name"));
                user.setPassWord(res.getString("password"));
                return user;
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            Jdbc.close(ps, res,conn);
        }
        return null;
    }
}