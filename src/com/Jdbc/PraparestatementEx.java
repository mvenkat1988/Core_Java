package com.Jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

import com.StudentBean;

public class PraparestatementEx {

	public static void main(String args[]){  
		try{  
		Class.forName("oracle.jdbc.driver.OracleDriver");  
		Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","system");  
		PreparedStatement stmt=con.prepareStatement("insert into Std_TB123 (SID ,Sname,Sadd,SDept) values(?,?,?,?)");  
		/*StudentBean sb = new StudentBean();*/
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Student ID:");
		String sid = sc.next();
		System.out.println("Enter Student sname:");
		String sname = sc.next();
		System.out.println("Enter Student sadd:");
		String sadd = sc.next();
		System.out.println("Enter Student sdept:");
		String sdept = sc.next();
		System.out.println("Enter Student sphone:");
		String sphone = sc.next();
		StudentBean studentBean  = new StudentBean();
		studentBean.setsId(sid);
		studentBean.setsName(sname);
		studentBean.setsAdd(sadd);
		studentBean.setsDept(sdept);
		//studentBean.setsPhone_Number(sphone);
		
		stmt.setString(1,studentBean.getsId()); 
		stmt.setString(2,studentBean.getsName());  
		stmt.setString(3,studentBean.getsAdd());  
		stmt.setString(4,studentBean.getsDept());  
		//stmt.setString(5,"852"); 
		
		//INSERT INTO Std_TB123 (SID ,Sname,Sadd,SDept,S_Phone_Number) VALUES ('101', 'Ratan', 'GUNTUR','IT','8148180997')
		  
		int i=stmt.executeUpdate();  
		System.out.println(i+" records inserted");  
		JdbcConnectionEx2 jdbcConnectionEx2 = new JdbcConnectionEx2();
		jdbcConnectionEx2.getTableData();
		con.close();  
		  
		}catch(Exception e){ System.out.println(e);}  
		  
		}  
		}  