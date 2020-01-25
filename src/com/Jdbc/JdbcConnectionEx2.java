package com.Jdbc;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import com.ConstantDetails;
import com.StudentBean;

public class JdbcConnectionEx2 {
	JDBCSingleton jDBCSingleton = JDBCSingleton.getJDBCInstant();
	Connection con = null;
	Statement stmt = null;
public void getCreateTable() throws ClassNotFoundException, SQLException {
	/*JDBCSingleton jDBCSingleton = JDBCSingleton.getJDBCInstant();
	Connection con = jDBCSingleton.getConnection();
	Statement stmt = con.createStatement();*/
	con = jDBCSingleton.getConnection();
	stmt = con.createStatement();
	String sql = "CREATE TABLE Std_TB123(SID varchar2(10),Sname varchar2(10),Sadd varchar2(10),SDept varchar2(10),S_Phone_Number varchar2(20))";
	System.out.println(sql);
	//stmt.executeQuery("select * from std_tb");
	stmt.executeUpdate(sql);
	System.out.println("Table as been created");
	stmt.close();
	con.close();
}

public void getInsertData(StudentBean studentBean) throws ClassNotFoundException, SQLException {
	con = jDBCSingleton.getConnection();
	stmt = con.createStatement();
	
	/*ArrayList<String> al = new ArrayList<>();
	al.add("INSERT INTO Std_TB123 (SID ,Sname,Sadd,SDept,S_Phone_Number) VALUES ('1', 'Venkat', 'Hyd','IT','8148180997')");
	al.add("INSERT INTO Std_TB123 (SID ,Sname,Sadd,SDept,S_Phone_Number) VALUES ('2', 'Yaswenth', 'US','MCA','123')");
	al.add("INSERT INTO Std_TB123 (SID ,Sname,Sadd,SDept,S_Phone_Number) VALUES ('3', 'Krishna', 'US','Btech','321')");
	al.add("INSERT INTO Std_TB123 (SID ,Sname,Sadd,SDept,S_Phone_Number) VALUES ('4', 'Ravi', 'Hyd','MCA','456')");
	al.add("INSERT INTO Std_TB123 (SID ,Sname,Sadd,SDept,S_Phone_Number) VALUES ('5', 'Srinu', 'Hyd','IT','654')");
	al.add("INSERT INTO Std_TB123 (SID ,Sname,Sadd,SDept,S_Phone_Number) VALUES ('6', 'Koti', 'Hyd','Btech','987')");
	al.add("INSERT INTO Std_TB123 (SID ,Sname,Sadd,SDept,S_Phone_Number) VALUES ('7', 'Raj', 'Hyd','MCA','789')");
	al.add("INSERT INTO Std_TB123 (SID ,Sname,Sadd,SDept,S_Phone_Number) VALUES ('8', 'Rani', 'Hyd','Inter','123')");
	for (String sql : al) {
		stmt.executeQuery(sql);
	}*/
	String sql = "INSERT INTO Std_TB123 (SID ,Sname,Sadd,SDept,S_Phone_Number) VALUES ('"+studentBean.getsId()+"','"+studentBean.getsName()+"','"+studentBean.getsAdd()+"','"+studentBean.getsDept()+"','"+studentBean.getsPhone_Number()+"')";
	stmt.executeQuery(sql);
	System.out.println("Inserted Records successfully-----------");
	stmt.close();
	con.close();
}
public void getTableData() throws ClassNotFoundException, SQLException {
	con = jDBCSingleton.getConnection();
	stmt = con.createStatement();
	String sql = "Select * from std_tb123";
	System.out.println(sql);
	ResultSet rs = stmt.executeQuery(sql);
	while (rs.next()) {
		System.out.println("SID-->"+rs.getString(1)+"<-----SNAME-->"+rs.getString(2)+"<-----SADD-->"+rs.getString(3)+"<-----SDEPT-->"+rs.getString(4)+"<-----SPHONE_NUMBER-->"+rs.getString(5));
	}
	System.out.println("getTableData-------------");
	stmt.close();
	con.close();
}


public void getDeleteTable() throws ClassNotFoundException, SQLException {
	con = jDBCSingleton.getConnection();
	stmt = con.createStatement();
	//String sql = "delete from std_tb123";
	//String sql = "truncate table std_tb123";
	String sql = "drop table std_tb123";
	System.out.println(sql);
	//stmt.executeQuery("select * from std_tb");
	stmt.executeUpdate(sql);
	System.out.println("Table as been Droped");
	con.close();
}



}
