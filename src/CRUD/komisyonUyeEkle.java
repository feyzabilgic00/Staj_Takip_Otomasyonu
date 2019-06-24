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

import Entity.komisyon_uyeleri;
import Entity.program;
import Utility.baglanti;

import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.SQLException;
import java.awt.event.ActionEvent;

public class komisyonUyeEkle extends JFrame {

	private JPanel contentPane;
	private JTable table;
	private JLabel lblKomisyonId;
	private JLabel lblKomisyonBaskani;
	private JLabel lblUye1;
	private JLabel lblUye2;
	private JLabel lblBolumId;
	private JTextField txtKomisyonId;
	private JTextField txtKomisyonBaskaný;
	private JTextField txtUye1;
	private JTextField txtUye2;
	private JTextField txtBolumId;
	private JButton btnKaydet;
	private JButton btnGuncelle;
	private JButton btnSil;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					komisyonUyeEkle frame = new komisyonUyeEkle();
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
	public komisyonUyeEkle() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 457, 486);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(29, 273, 380, 142);
		contentPane.add(scrollPane);
		
		table = new JTable();
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
			},
			new String[] {
				"New column", "New column", "New column", "New column", "New column"
			}
		));
		table.setBounds(35, 253, 355, 125);
		scrollPane.setViewportView(table);
		
		lblKomisyonId = new JLabel("Komisyon Id:");
		lblKomisyonId.setBounds(10, 31, 100, 29);
		contentPane.add(lblKomisyonId);
		
		lblKomisyonBaskani = new JLabel("Komisyon Ba\u015Fkan\u0131:");
		lblKomisyonBaskani.setBounds(10, 71, 100, 29);
		contentPane.add(lblKomisyonBaskani);
		
		lblUye1 = new JLabel("\u00DCye 1:");
		lblUye1.setBounds(10, 105, 100, 29);
		contentPane.add(lblUye1);
		
		lblUye2 = new JLabel("\u00DCye 2:");
		lblUye2.setBounds(10, 136, 100, 29);
		contentPane.add(lblUye2);
		
		lblBolumId = new JLabel("B\u00F6l\u00FCm Id:");
		lblBolumId.setBounds(10, 165, 100, 29);
		contentPane.add(lblBolumId);
		
		txtKomisyonId = new JTextField();
		txtKomisyonId.setBounds(111, 35, 149, 20);
		contentPane.add(txtKomisyonId);
		txtKomisyonId.setColumns(10);
		
		txtKomisyonBaskaný = new JTextField();
		txtKomisyonBaskaný.setColumns(10);
		txtKomisyonBaskaný.setBounds(111, 71, 149, 20);
		contentPane.add(txtKomisyonBaskaný);
		
		txtUye1 = new JTextField();
		txtUye1.setColumns(10);
		txtUye1.setBounds(111, 105, 149, 20);
		contentPane.add(txtUye1);
		
		txtUye2 = new JTextField();
		txtUye2.setColumns(10);
		txtUye2.setBounds(111, 136, 149, 20);
		contentPane.add(txtUye2);
		
		txtBolumId = new JTextField();
		txtBolumId.setColumns(10);
		txtBolumId.setBounds(111, 169, 149, 20);
		contentPane.add(txtBolumId);
		
		btnKaydet = new JButton("Kaydet");
		btnKaydet.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				try {
					Connection myConn=(Connection) baglanti.yap();
					Statement myStat=(Statement) myConn.createStatement();
					komisyon_uyeleri ku=new komisyon_uyeleri();
					ku.setKomisyon_id(txtKomisyonId.getText());
					ku.setKomisyon_baskani(txtKomisyonBaskaný.getText());
					ku.setUye1(txtUye1.getText());
					ku.setUye2(txtUye2.getText());
					ku.setBolum_id(txtBolumId.getText());
				    myStat.executeUpdate("insert into komisyon_uye(komisyon_id,komisyon_baskani,uye1,uye2,bolum_id) values('"+ku.getKomisyon_id()+"','"+ku.getKomisyon_baskani()+"','"+ku.getUye1()+"','"+ku.getUye2()+"','"+ku.getBolum_id()+"')");
				    //System.out.println(sql_sorgu);
					}catch(SQLException e1) {
						System.out.println(e1);
						}
				
			}
		});
		btnKaydet.setBounds(21, 211, 89, 34);
		contentPane.add(btnKaydet);
		
		btnGuncelle = new JButton("G\u00FCncelle");
		btnGuncelle.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				try {
					Connection myConn=(Connection) baglanti.yap();
					Statement myStat=(Statement) myConn.createStatement();
					komisyon_uyeleri ku=new komisyon_uyeleri();
					ku.setKomisyon_id(txtKomisyonId.getText());
					ku.setKomisyon_baskani(txtKomisyonBaskaný.getText());
					ku.setUye1(txtUye1.getText());
					ku.setUye2(txtUye2.getText());
					ku.setBolum_id(txtBolumId.getText());
					 myStat.executeUpdate("update komisyon_uye set komisyon_baskani='"+ku.getKomisyon_baskani()+"',uye1='"+ku.getUye1()+"',uye2='"+ku.getUye2()+"',bolum_id='"+ku.getBolum_id()+"' where komisyon_id="+ku.getKomisyon_id());

				} catch (SQLException e2) {
					// TODO Auto-generated catch block
					e2.printStackTrace();
				}
				
				
			}
		});
		btnGuncelle.setBounds(131, 211, 89, 34);
		contentPane.add(btnGuncelle);
		
		btnSil = new JButton("Sil");
		btnSil.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				try {
					Connection myConn=(Connection) baglanti.yap();
					Statement myStat=(Statement) myConn.createStatement();
					komisyon_uyeleri ku=new komisyon_uyeleri();
					ku.setKomisyon_id(txtKomisyonId.getText());
					ku.setKomisyon_baskani(txtKomisyonBaskaný.getText());
					ku.setUye1(txtUye1.getText());
					ku.setUye2(txtUye2.getText());
					ku.setBolum_id(txtBolumId.getText());
					
					 myStat.executeUpdate("delete from komisyon_uye where komisyon_id="+ku.getKomisyon_id());

				} catch (SQLException e1) {
				
					e1.printStackTrace();
				}
				
				
			}
		});
		btnSil.setBounds(256, 211, 89, 34);
		contentPane.add(btnSil);
		//contentPane.add(table);
	}

}
