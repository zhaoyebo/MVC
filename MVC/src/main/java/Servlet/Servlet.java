package Servlet;

import JDBC.daoimpl.Dao;
import JDBC.domain.User;
import JDBC.jdbcutli.Jdbc;
import com.mysql.cj.x.protobuf.MysqlxExpect;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;



public class Servlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        resp.setContentType("text/html; charset=utf-8");
        User user = new User(req.getParameter("name"),req.getParameter("password"));
        Dao dao = new Dao(Jdbc.Open());
        if (user.equals(dao.query(req.getParameter("name")))) {
            resp.getWriter().println("<h1>登入成功,用户:" + req.getParameter("name") + "</h1>");
        } else {
            resp.getWriter().println("<h1>登入失败</h1>");
        }
    }
}
