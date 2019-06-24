package ObserverPatternDesign;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JTextField;

import com.mysql.jdbc.Statement;
import com.toedter.calendar.JCalendar;
import javax.swing.JComboBox;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.awt.event.ActionEvent;
import com.toedter.calendar.JDateChooser;

import Entity.danisman;
import Entity.ogrencii;
import Utility.baglanti;

public class stajOnayla extends JFrame {

	private JPanel contentPane;
	private JTextField txtOgrenciNo1;
	private JTextField txtOgrenciNo2;
	private JTextField txtAdý;
	private JTextField txtSoyadý;
	private JTextField txtStajDurumu;
	private JTextField txtBolum;
	private JTextField txtProgram;
	private JTextField txtEgtmOgrtmYýl;
	private JTextField txtStajYeri;
	private JTextField txtStajAdresi;
	private JTextField txtKomisyonBaskaný;
	private JTextField txtUye1;
	private JTextField txtUye2;
	private JTextField txtKabulEdilenGunSayýsý;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					stajOnayla frame = new stajOnayla();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public stajOnayla() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 580, 704);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblOgrenciNo1 = new JLabel("Ogrenci No:");
		lblOgrenciNo1.setBounds(10, 24, 100, 14);
		contentPane.add(lblOgrenciNo1);
		
		JLabel lblOgrenciNo2 = new JLabel("Ogrenci No:");
		lblOgrenciNo2.setBounds(10, 56, 100, 14);
		contentPane.add(lblOgrenciNo2);
		
		JLabel lblAdý = new JLabel("Ad\u0131:");
		lblAdý.setBounds(10, 91, 100, 14);
		contentPane.add(lblAdý);
		
		JLabel lblSoyadý = new JLabel("Soyad\u0131:");
		lblSoyadý.setBounds(10, 127, 100, 14);
		contentPane.add(lblSoyadý);
		
		JLabel lblStajDurumu = new JLabel("Staj Durumu:");
		lblStajDurumu.setBounds(10, 152, 100, 14);
		contentPane.add(lblStajDurumu);
		
		JLabel lblBolum = new JLabel("B\u00F6l\u00FCm\u00FC:");
		lblBolum.setBounds(10, 190, 100, 14);
		contentPane.add(lblBolum);
		
		JLabel lblProgram = new JLabel("Program\u0131:");
		lblProgram.setBounds(10, 227, 100, 14);
		contentPane.add(lblProgram);
		
		JLabel lblEgtmOgrtmYýl = new JLabel("E\u011Fitim \u00D6\u011Fretim Y\u0131l\u0131:");
		lblEgtmOgrtmYýl.setBounds(10, 265, 100, 14);
		contentPane.add(lblEgtmOgrtmYýl);
		
		JLabel lblBaslamaBitisTarihi = new JLabel("Staj Ba\u015Flama/Biti\u015F Tarihi:");
		lblBaslamaBitisTarihi.setBounds(10, 331, 117, 14);
		contentPane.add(lblBaslamaBitisTarihi);
		
		JLabel lblKabulEdilenGunSayýsý = new JLabel("Kabul Edilen G\u00FCn Say\u0131s\u0131:");
		lblKabulEdilenGunSayýsý.setBounds(10, 375, 117, 14);
		contentPane.add(lblKabulEdilenGunSayýsý);
		
		JLabel lblStajYeri = new JLabel("Staj Yeri:");
		lblStajYeri.setBounds(10, 412, 100, 14);
		contentPane.add(lblStajYeri);
		
		JLabel lblStajAdresi = new JLabel("Staj Adresi:");
		lblStajAdresi.setBounds(10, 452, 100, 14);
		contentPane.add(lblStajAdresi);
		
		JLabel lblStajKomisyonBaskaný = new JLabel("Staj Komisyon Ba\u015Fkan\u0131:");
		lblStajKomisyonBaskaný.setBounds(10, 489, 117, 14);
		contentPane.add(lblStajKomisyonBaskaný);
		
		JLabel lblStajKomisyonuye1 = new JLabel("Staj Komisyon \u00DCye:");
		lblStajKomisyonuye1.setBounds(10, 525, 100, 14);
		contentPane.add(lblStajKomisyonuye1);
		
		JLabel lblStajKomisyonuye2 = new JLabel("Staj Komisyon \u00DCye:");
		lblStajKomisyonuye2.setBounds(10, 562, 100, 14);
		contentPane.add(lblStajKomisyonuye2);
		
		JButton btnOgrenciOnayla = new JButton("\u00D6\u011Frenci Onayla");
		btnOgrenciOnayla.setBounds(57, 620, 126, 23);
		contentPane.add(btnOgrenciOnayla);
		
		txtOgrenciNo1 = new JTextField();
		txtOgrenciNo1.setBounds(138, 21, 227, 20);
		contentPane.add(txtOgrenciNo1);
		txtOgrenciNo1.setColumns(10);
		
		txtOgrenciNo2 = new JTextField();
		txtOgrenciNo2.setColumns(10);
		txtOgrenciNo2.setBounds(138, 53, 227, 20);
		contentPane.add(txtOgrenciNo2);
		
		txtAdý = new JTextField();
		txtAdý.setColumns(10);
		txtAdý.setBounds(138, 84, 227, 20);
		contentPane.add(txtAdý);
		
		txtSoyadý = new JTextField();
		txtSoyadý.setColumns(10);
		txtSoyadý.setBounds(138, 115, 227, 20);
		contentPane.add(txtSoyadý);
		
		txtStajDurumu = new JTextField();
		txtStajDurumu.setColumns(10);
		txtStajDurumu.setBounds(138, 146, 227, 20);
		contentPane.add(txtStajDurumu);
		
		txtBolum = new JTextField();
		txtBolum.setColumns(10);
		txtBolum.setBounds(138, 187, 227, 20);
		contentPane.add(txtBolum);
		
		txtProgram = new JTextField();
		txtProgram.setColumns(10);
		txtProgram.setBounds(138, 224, 227, 20);
		contentPane.add(txtProgram);
		
		txtEgtmOgrtmYýl = new JTextField();
		txtEgtmOgrtmYýl.setColumns(10);
		txtEgtmOgrtmYýl.setBounds(138, 259, 227, 20);
		contentPane.add(txtEgtmOgrtmYýl);
		
		txtStajYeri = new JTextField();
		txtStajYeri.setColumns(10);
		txtStajYeri.setBounds(138, 409, 227, 20);
		contentPane.add(txtStajYeri);
		
		txtStajAdresi = new JTextField();
		txtStajAdresi.setColumns(10);
		txtStajAdresi.setBounds(138, 449, 227, 20);
		contentPane.add(txtStajAdresi);
		
		txtKomisyonBaskaný = new JTextField();
		txtKomisyonBaskaný.setColumns(10);
		txtKomisyonBaskaný.setBounds(137, 486, 227, 20);
		contentPane.add(txtKomisyonBaskaný);
		
		txtUye1 = new JTextField();
		txtUye1.setColumns(10);
		txtUye1.setBounds(138, 522, 227, 20);
		contentPane.add(txtUye1);
		
		txtUye2 = new JTextField();
		txtUye2.setColumns(10);
		txtUye2.setBounds(138, 559, 227, 20);
		contentPane.add(txtUye2);
		
		JButton btnGetir = new JButton("Getir");
		btnGetir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				

				try {
					Connection myConn=(Connection) baglanti.yap();
					Statement myStat=(Statement) myConn.createStatement();
					ogrencii o=new ogrencii();
                    ResultSet rs2=myStat.executeQuery("select ogrenci.ogrenci_no from ogrenci inner join staj on ogrenci.ogrenci_no=staj.ogrenci_no;");
                    
                    while(rs2.next()) {
                    	int a=rs2.getInt("ogrenci_no");
                    	
                    if(a==Integer.parseInt(txtOgrenciNo1.getText())) {
                    	System.out.println("asdsdgfd");
                    }}
					ResultSet rs=myStat.executeQuery("select ogrenci.ogrenci_no, ogrenci.adi,ogrenci.soyadi,ogrenci.bolum,ogrenci.program,ogrenci.egtm_ogrtm_yýl,ogrenci.Staj_Durumu,\r\n" + 
							"staj.kabulEdilenGunSayýsý,staj.stajYeri,staj.stajAdresi from ogrenci inner join staj on ogrenci.ogrenci_no=staj.ogrenci_no;\r\n"  );
					//System.outprintln(sql_sorgu);
				    while(rs.next()) {
				    	txtOgrenciNo2.setText(rs.getString("ogrenci_no"));
				    	txtAdý.setText(rs.getString("adi"));
				    	txtSoyadý.setText(rs.getString("soyadi"));
				    	txtStajDurumu.setText(rs.getString("bolum"));
				    	txtBolum.setText(rs.getString("program"));
				    	txtProgram.setText(rs.getString("egtm_ogrtm_yýl"));
				    	txtEgtmOgrtmYýl.setText(rs.getString("Staj_Durumu"));
				    	txtKabulEdilenGunSayýsý.setText(rs.getString("kabulEdilenGunSayýsý"));
				    	txtStajYeri.setText(rs.getString("stajYeri"));
				    	txtStajAdresi.setText(rs.getString("stajAdresi"));
				    	}
					   ResultSet rs3=myStat.executeQuery("select komisyon_uye.komisyon_baskani,komisyon_uye.uye1,komisyon_uye.uye2 from komisyon_uye where komisyon_uye.komisyon_id in(select staj.komisyon_id from staj where staj.ogrenci_no in(select ogrenci.ogrenci_no from ogrenci))");
				    while(rs3.next()) {
				    	txtKomisyonBaskaný.setText(rs3.getString("komisyon_baskani"));
				    	txtUye1.setText(rs3.getString("uye1"));
				    	txtUye2.setText(rs3.getString("uye2"));
				   }
					}catch(SQLException e1) {
						System.out.println(e1);
						}
				
				
				
				
				
			}
		});
		btnGetir.setBounds(397, 20, 80, 28);
		contentPane.add(btnGetir);
		
		JDateChooser baslama = new JDateChooser();
		baslama.setBounds(148, 326, 153, 28);
		contentPane.add(baslama);
		
		JDateChooser bitis = new JDateChooser();
		bitis.setBounds(337, 326, 140, 28);
		contentPane.add(bitis);
		
		txtKabulEdilenGunSayýsý = new JTextField();
		txtKabulEdilenGunSayýsý.setColumns(10);
		txtKabulEdilenGunSayýsý.setBounds(137, 372, 227, 20);
		contentPane.add(txtKabulEdilenGunSayýsý);
	}
}
