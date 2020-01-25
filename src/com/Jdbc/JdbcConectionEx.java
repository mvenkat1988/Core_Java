package com.Jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.ConstantDetails;
class DB_Details{
	public void getDbConnection() throws ClassNotFoundException, SQLException {
		Class.forName(ConstantDetails.Oracle_Driver);
		Connection con = DriverManager.getConnection(ConstantDetails.JDBC_URL, ConstantDetails.USER_NAME, ConstantDetails.SQL_PWD);
		Statement stmt = con.createStatement();
		//insertDetails(stmt);
		//String st = UpdateDetails(stmt);
		//System.out.println(st);
	//	getDBReordsDelete(stmt);
		getDBValues(stmt);   
		con.close();
	}
	
	private void getDBReordsDelete(Statement stmt) throws SQLException {
		stmt.executeQuery("delete from std_tb where sid = '8'");
	}

	private String UpdateDetails(Statement stmt) throws SQLException {
		stmt.executeQuery("update std_tb set s_phone_number='5107368215' where sid='8'");
		return "Updated Recoards succesufully.............>";
		
	}

	public void getDBValues(Statement stmt) throws ClassNotFoundException, SQLException {
		//stmt.executeQuery("update std_tb set s_phone_number='5107368213' where sid='4'");
		ResultSet rs = stmt.executeQuery(ConstantDetails.SELECT_STD_TB);
		while (rs.next()) {
			System.out.println("SID-->"+rs.getString(1)+"<-----SNAME-->"+rs.getString(2)+"<-----SADD-->"+rs.getString(3)+"<-----SDEPT-->"+rs.getString(4)+"<-----SPHONE_NUMBER-->"+rs.getString(5));
		}
	}
	

	public void insertDetails(Statement stmt) throws ClassNotFoundException, SQLException {
		
		//stmt.executeQuery("update std_tb set s_phone_number='5107368213' where sid='4'");
		stmt.executeQuery("INSERT INTO std_tb (SID ,Sname,Sadd,SDept,S_Phone_Number) VALUES ('8', 'Rani', 'Hyd','Inter','123')");	
	}
}
public class JdbcConectionEx {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		DB_Details dbDetails = new DB_Details();
		dbDetails.getDbConnection();
		
	}
}