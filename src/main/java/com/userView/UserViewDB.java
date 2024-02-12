package com.userView;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class UserViewDB {

	
	public static List<Users> validate(String userid, String userName){
	
		
	 	ArrayList<Users> use = new ArrayList<>();
		
		//Create database Connect
		String url = "jdbc:mysql://localhost:3306/online_bus_ticket";
		String user= "root";
		String pass= "dp4543";
		
		//validate 
		try {
		Class.forName("com.mysql.jdbc.Driver");
		
		Connection con = DriverManager.getConnection(url,user,pass);
		Statement stmt = con.createStatement();
		String sql = "select * from users where userId='"+userid+"' and name='"+userName+"'";
		ResultSet rs = stmt.executeQuery(sql);
		
		if(rs.next()) {
			String id = rs.getString(1);
			String name =rs.getString(2);
			String inquiries = rs.getString(3);
			String type = rs.getString(4);
			
			Users us = new Users(id,name,inquiries,type);
			use.add(us);
		}
		}
		catch(Exception e) {
			e.printStackTrace();
			
			
		}
		return use;
		
	}

public static boolean insertUser(String id,String name,String inquiries,String type) {
	
	boolean isGet = false;
	//Create database Connect
			String url = "jdbc:mysql://localhost:3306/online_bus_ticket";
			String user= "root";
			String pass= "dp4543";
	
			try {
				
				
				Class.forName("com.mysql.jdbc.Driver");
				
				Connection con = DriverManager.getConnection(url,user,pass);
				Statement stmt = con.createStatement();	
				String sql = "insert into users values('0','"+name+"','"+inquiries+"','"+type+"')";
				int rs = stmt.executeUpdate(sql);
				
				if(rs>0) {
					isGet = true;
					
				}
				else {
					isGet = false;
					
				}
					}
catch(Exception e) {
	e.printStackTrace();
}
	
	
	
	return isGet;
}




}
