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
	
	//����MySQL���ݿ�����
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
			System.out.println("ע�������쳣");
			e.printStackTrace();
		}
		return conn;
	}

	//ִ�����ݿ������������Ӱ�������
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

	//ִ�����ݿ��ѯ����������ִ�н����
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
