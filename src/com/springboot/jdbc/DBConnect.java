package com.springboot.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DBConnect {

	public static void main(String[] args) {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con = DriverManager.getConnection
					("jdbc:oracle:thin:@localhost:1521:xe","SYSTEM","admin");
			System.out.println("Connected to "+con.getSchema());
			Statement st = con.createStatement();
			ResultSet rs = st.executeQuery("select * from employee where employeeId = "+1);
			while(rs.next()) {
				String empName = rs.getString("empname");
				String empId = rs.getString("empId");
			}
			PreparedStatement ps = con.prepareStatement("Select * from employee where employeeid = ? and salary = ?");
			ps.setString(0, "1");
			ps.setString(1, "1000");
			ps.executeQuery();
			ps.executeUpdate();
			st.executeUpdate("insert into employee(empid,empname) values(empseq.nextval,?)");
		} catch(SQLException ex) {
			ex.printStackTrace();
		}catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
