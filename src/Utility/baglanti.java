package Utility;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
public class baglanti {
	
	static Statement myStat;
	static Connection myConn;
	
public static Connection yap()
	{
	ResultSet myRs=null;
	try {
		myConn=(Connection)DriverManager.getConnection("jdbc:mysql://localhost:3306/staj_takip_otomasyonu","root","12345");
        myStat=(Statement)myConn.createStatement();
        
		myRs=myStat.executeQuery("select * from ogrenci");
		myRs.next();
		System.out.println(myRs.getInt("ogrenci_no"));
		
	}
	catch(SQLException e) {
	System.out.println(e);

	}
	return myConn;
}
public static void main(String[] args) {
	
baglanti b=new baglanti();
b.yap();
}
	
	

}
