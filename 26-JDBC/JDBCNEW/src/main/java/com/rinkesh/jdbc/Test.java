package com.rinkesh.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.cj.protocol.x.SyncFlushDeflaterOutputStream;

public class Test 
{
	
	public static void main(String[] args)
	{
		
		
		try {
			
			
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			String url="jdbc:mysql://localhost:3306/rinkesh";
			String username="root";
			String password="Rinkesh@79";
			Connection connection= DriverManager.getConnection(url, username, password);
			
			Statement st= connection.createStatement();
			
			//st.execute("insert into information value (3,'tejash','tejash@gmail.com')");
			
			//st.execute("UPDATE information SET name="kish", email="kish@gmail.com"  WHERE id=2;");
			
			//st.execute("DELETE FROM information where name='tejash'");
			
			
			
			ResultSet rs= st.executeQuery("select * from information");
			while(rs.next())
			{
				
				System.out.println("id - "+rs.getInt(1)+" name - "+rs.getString(2)+" email -"+rs.getString(3));
			}
			
			
			connection.close();
			
		} catch (ClassNotFoundException | SQLException e) 
			{			
				e.printStackTrace();
			}
		
	}

}
