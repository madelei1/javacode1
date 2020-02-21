package cn.itcast.jdbc;

import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.Connection;

public class JdbcDome1 {
    public static void main(String[] args) throws Exception {
        //1.导入驱动java包
        //2.注册驱动
        Class.forName("com.mysql.jdbc.Driver");
        //3.获取数据库连接对象 Connection
        Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/db1","root","root");
        //4.定义sql语句
        String sql = "update db2 set gozi = 5000.0 where id =1";
        //5.获取执行sql语句的对象Statement
        Statement stmt = conn.createStatement();
        //6.执行sql，接受返回结果
        int count = stmt.executeUpdate(sql);
        //7.处理结果
        System.out.println(count);
        //8.释放资源
        stmt.close();
        conn.close();





    }

}
