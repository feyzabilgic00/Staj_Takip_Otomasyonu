package ObserverPatternDesign;

import java.sql.Connection;
import java.sql.SQLException;

import com.mysql.jdbc.Statement;

import Entity.ogrencii;
import Utility.baglanti;

public interface Observer {
	
	
	void gozlemciEkle(stajGozlemcisi gozlemci);
	void gozlemcilereHaberVer();
	
	static void guncelle(String stajDurumu) {
		
		
		
		try {
			Connection myConn=(Connection) baglanti.yap();
				
			  ogrencii o=new ogrencii();
			  
			  Statement myStat=(Statement) myConn.createStatement();
			
			   
			System.out.println("dg"+o.getOgrenci_no());
			
			 myStat.executeUpdate("update ogrenci set adi='"+o.getAdi()+"',soyadi='"+o.getSoyadi()+"',stajId='"+o.getStajId()+"' where ogrenci_no="+o.getOgrenci_no());

		} catch (SQLException e2) {
			// TODO Auto-generated catch block
			e2.printStackTrace();
		}
	}

}
