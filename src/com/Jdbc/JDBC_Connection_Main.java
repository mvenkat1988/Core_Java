package com.Jdbc;

import java.sql.SQLException;
import java.util.Scanner;

import com.StudentBean;

public class JDBC_Connection_Main {
public static void main(String[] args) throws ClassNotFoundException, SQLException {
	JdbcConnectionEx2 jdbcConnectionEx2 = new JdbcConnectionEx2();
	/*jdbcConnectionEx2.getCreateTable();
	jdbcConnectionEx2.getInsertData();
	jdbcConnectionEx2.getTableData();
	jdbcConnectionEx2.getDeleteTable();
	*/
	System.out.println("1.Do you want to CreateTable...");
	System.out.println("2.Do you want to InsertTable...");
	System.out.println("3.Do you want to View-TableData...");
	System.out.println("4.Do you want to DeleteTable...");
	Scanner sc = new Scanner(System.in);
	System.out.println("Please enetr values");
	int key = sc.nextInt();
	switch (key) {
	case 1:
		jdbcConnectionEx2.getCreateTable();
		break;
	case 2:
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
		studentBean.setsPhone_Number(sphone);
		jdbcConnectionEx2.getInsertData(studentBean);
		jdbcConnectionEx2.getTableData();
		break;
	case 3:
		jdbcConnectionEx2.getTableData();
		break;
	case 4:
		jdbcConnectionEx2.getDeleteTable();
	break;

	default:
		System.out.println("Please enter Proper data...");
		break;
	}
	
}
}
