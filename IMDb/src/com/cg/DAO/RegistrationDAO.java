package com.cg.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.cg.connection.ConnectionFactory;
import com.cg.pojo.RegistrationDetails;

public class RegistrationDAO {
	
	public boolean registration(String firstName,String lastName,String emailid,String mobileNo,String userName,String password)throws SQLException {
		Connection conn = ConnectionFactory.getConnection();
		String result= "insert into Registration values(?,?,?,?,?,?)";
		System.out.println(conn);
		PreparedStatement pStatement = conn.prepareStatement(result);
		pStatement.setString(1, firstName);
		pStatement.setString(2, lastName);
		pStatement.setString(3, emailid);
		pStatement.setString(4, mobileNo);
		pStatement.setString(5, userName);
		pStatement.setString(6, password);
		pStatement.executeUpdate();
		return true;
	}

}
