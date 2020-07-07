package JavaWeb.web;

import java.sql.*;

public class Main {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
    //1、获取驱动
        Class.forName("com.mysql.jdbc.Driver");
        //ip : 端口号/数据库名称
        String url = "jdbc:mysql://127.0.0.1:3306/zuozhanwenshu?useSSL=false";//useSSL=false不加整个就会报一个警告。
        String username = "root";
        String password = "root";
        //2、获取连接
        Connection connection = DriverManager.getConnection(url,username,password);
        //3、获取语句
        Statement statement = connection.createStatement();

        //4、执行语句
        String sql = "show tables";
        //结果集
        ResultSet resultSet = statement.executeQuery(sql);
        while (resultSet.next()) {
            String str = resultSet.getString(1);
            System.out.println(str);
        }
        //关闭连接
        resultSet.close();
        sql = "select city_name,city_py from diming where city_id = 1000";
        //结果集
       resultSet = statement.executeQuery(sql);
        while (resultSet.next()) {
            String str = resultSet.getString(1);
            String string = resultSet.getString(2);
            System.out.println(str);
            System.out.println(string);
        }
	
        resultSet.close();
        statement.close();
        connection.close();


    }
}
