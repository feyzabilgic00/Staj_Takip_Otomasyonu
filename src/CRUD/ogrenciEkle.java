package CRUD;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import com.mysql.jdbc.Statement;

import Entity.ogrencii;
import Utility.baglanti;

import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JButton;
import javax.swing.DefaultComboBoxModel;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.SQLException;
import java.awt.event.ActionEvent;

public class ogrenciEkle extends JFrame {

	private JPanel contentPane;
	private JTable table;
	private JTextField txtOgrenciNo;
	private JTextField txtAdi;
	private JTextField txtSoyadi;
	private JTextField txtStajId;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ogrenciEkle frame = new ogrenciEkle();
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
	public ogrenciEkle() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 519, 530);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 374, 461, 107);
		contentPane.add(scrollPane);
		
		table = new JTable();
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null},
			},
			new String[] {
				"New column", "New column", "New column", "New column", "New column", "New column", "New column"
			}
		));
		table.setBounds(46, 204, 350, 179);
		scrollPane.setViewportView(table);
		
		JLabel lblOgrenciNo = new JLabel("Ogrenci No:");
		lblOgrenciNo.setBounds(10, 28, 91, 26);
		contentPane.add(lblOgrenciNo);
		
		JLabel lblAdi = new JLabel("Ad\u0131:");
		lblAdi.setBounds(10, 66, 91, 26);
		contentPane.add(lblAdi);
		
		JLabel lblSoyadi = new JLabel("Soyad\u0131:");
		lblSoyadi.setBounds(10, 103, 91, 26);
		contentPane.add(lblSoyadi);
		
		JLabel lblBolum = new JLabel("B\u00F6l\u00FCm\u00FC:");
		lblBolum.setBounds(10, 140, 91, 26);
		contentPane.add(lblBolum);
		
		JLabel lblProgram = new JLabel("Program\u0131:");
		lblProgram.setBounds(10, 177, 91, 26);
		contentPane.add(lblProgram);
		
		JLabel lblEgtmOgrtmYýl = new JLabel("E\u011Fitim \u00D6\u011Fretim Y\u0131l\u0131:");
		lblEgtmOgrtmYýl.setBounds(10, 217, 91, 26);
		contentPane.add(lblEgtmOgrtmYýl);
		
		JLabel lblStajDurumu = new JLabel("Staj Durumu:");
		lblStajDurumu.setBounds(10, 248, 91, 26);
		contentPane.add(lblStajDurumu);
		
		txtOgrenciNo = new JTextField();
		txtOgrenciNo.setBounds(129, 28, 171, 26);
		contentPane.add(txtOgrenciNo);
		txtOgrenciNo.setColumns(10);
		
		txtAdi = new JTextField();
		txtAdi.setColumns(10);
		txtAdi.setBounds(129, 66, 171, 26);
		contentPane.add(txtAdi);
		
		txtSoyadi = new JTextField();
		txtSoyadi.setColumns(10);
		txtSoyadi.setBounds(129, 106, 171, 26);
		contentPane.add(txtSoyadi);
		
		JComboBox comboBolum = new JComboBox();
		comboBolum.setModel(new DefaultComboBoxModel(new String[] {"\u0130n\u015Faat", "Makine ve Metal Teknolojileri", "Elektrik ve Enerji", "El Sanatlar\u0131", "Mimarl\u0131k ve \u015Eehir Planlama", "Elektronik ve Otomasyon", "Bilgisayar Teknolojileri", "Ula\u015Ft\u0131rma Hizmetleri", "Meyve \u00DCr\u00FCnleri"}));
		comboBolum.setBounds(129, 143, 171, 26);
		contentPane.add(comboBolum);
		
		JComboBox comboProgram = new JComboBox();
		comboProgram.setModel(new DefaultComboBoxModel(new String[] {"\u0130n\u015Faat Teknolojisi", "Yap\u0131 Denetim Program\u0131", "Kaynak Teknolojisi Program\u0131", "Elektrik Program\u0131", "Harita ve Kadastro Program\u0131", "Elektonik Teknolojisi"}));
		comboProgram.setBounds(129, 180, 171, 26);
		contentPane.add(comboProgram);
		
		JComboBox comboEgtmOgrtmYýl = new JComboBox();
		comboEgtmOgrtmYýl.setModel(new DefaultComboBoxModel(new String[] {"2010-2011", "2011-2012", "2012-2013", "2013-2014", "2014-2015", "2015-2016", "2016-2017", "2017-2018", "2018-2019"}));
		comboEgtmOgrtmYýl.setBounds(129, 217, 171, 26);
		contentPane.add(comboEgtmOgrtmYýl);
		
		JComboBox comboStajDurumu = new JComboBox();
		comboStajDurumu.setModel(new DefaultComboBoxModel(new String[] {"Tamamland\u0131", "Tamamlanmad\u0131"}));
		comboStajDurumu.setBounds(129, 248, 171, 26);
		contentPane.add(comboStajDurumu);
		
		JButton btnKAYDET = new JButton("Kaydet");
		btnKAYDET.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				try {
					Connection myConn=(Connection) baglanti.yap();
					Statement myStat=(Statement) myConn.createStatement();
					ogrencii o=new ogrencii();
					o.setOgrenci_no(txtOgrenciNo.getText());
					o.setAdi(txtAdi.getText());
					o.setSoyadi(txtSoyadi.getText());
					o.setStajId(txtStajId.getText());
					
				    myStat.executeUpdate("insert into ogrenci(ogrenci_no,adi,soyadi,bolum,program,egtm_ogrtm_yýl,Staj_Durumu,stajId) values('"+o.getOgrenci_no()+"','"+o.getAdi()+"','"+o.getSoyadi()+"','"+comboBolum.getSelectedItem()+"','"+comboProgram.getSelectedItem()+"','"+comboEgtmOgrtmYýl.getSelectedItem()+"','"+comboStajDurumu.getSelectedItem()+"',,'"+o.getStajId()+"')");
				    //System.out.println(sql_sorgu);
					}catch(SQLException e1) {
						System.out.println(e1);
						}
				
				
			}
		});
		btnKAYDET.setBounds(12, 329, 89, 34);
		contentPane.add(btnKAYDET);
		
		JButton btnSÝL = new JButton("Sil");
		btnSÝL.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					Connection myConn=(Connection) baglanti.yap();
						
					  ogrencii o=new ogrencii();
					  
					  Statement myStat=(Statement) myConn.createStatement();
						o.setOgrenci_no(txtOgrenciNo.getText());	   
					
					 myStat.executeUpdate("delete from ogrenci where ogrenci_no="+o.getOgrenci_no());

				} catch (SQLException e1) {
				
					e1.printStackTrace();
				}
			
			}
		});
		btnSÝL.setBounds(129, 329, 89, 34);
		contentPane.add(btnSÝL);
		
		JButton btnGUNCELLE = new JButton("G\u00FCncelle");
		btnGUNCELLE.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
				try {
					Connection myConn=(Connection) baglanti.yap();
						
					  ogrencii o=new ogrencii();
					  
					  Statement myStat=(Statement) myConn.createStatement();
						o.setOgrenci_no(txtOgrenciNo.getText());
						o.setAdi(txtAdi.getText());
						o.setSoyadi(txtSoyadi.getText());
						o.setStajId(txtStajId.getText());
					   
					System.out.println("dg"+o.getOgrenci_no());
					
					 myStat.executeUpdate("update ogrenci set adi='"+o.getAdi()+"',soyadi='"+o.getSoyadi()+"',stajId='"+o.getStajId()+"' where ogrenci_no="+o.getOgrenci_no());

				} catch (SQLException e2) {
					// TODO Auto-generated catch block
					e2.printStackTrace();
				}
			}
		});
		btnGUNCELLE.setBounds(245, 329, 89, 34);
		contentPane.add(btnGUNCELLE);
		
		JLabel lblStajId = new JLabel("Staj ID:");
		lblStajId.setBounds(10, 285, 91, 26);
		contentPane.add(lblStajId);
		
		txtStajId = new JTextField();
		txtStajId.setColumns(10);
		txtStajId.setBounds(129, 285, 171, 26);
		contentPane.add(txtStajId);
		//contentPane.add(table);
	}
}
