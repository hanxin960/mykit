package jgf.chm.db.operation;

import java.sql.*;


public class MySQLOperation {
	private Connection conn;
	private Statement stmt;
	private ResultSet res;
	private static final String driver="com.mysql.jdbc.Driver";
	private static final String url="jdbc.mysql://localhost:3306/chm";
	private static final String user="root";
	private static final String password="hanxin960";
	
	//建立MySQL数据库连接
	public Connection getConnection()
	{
		conn=null;
		try
		{
			Class.forName(driver);
			conn=DriverManager.getConnection(url, user, password);
		}
		catch(Exception e)
		{
			System.out.println("注册驱动异常");
			e.printStackTrace();
		}
		return conn;
	}

	//执行数据库操作，返回受影响的行数
	public int exeSQL(String sql)
	{
		int effectRowCount=0;
		try
		{
			stmt=conn.createStatement();
			effectRowCount=stmt.executeUpdate(sql);
		}
		catch(Exception ex)
		{
			
		}
		return effectRowCount;
	}

	//执行数据库查询操作，返回执行结果集
	public ResultSet getResultSet(String sql)
	{
		try
		{
		res=stmt.executeQuery(sql);
		}
		catch(Exception ex)
		{
			
		}
		return res;
	}

}
