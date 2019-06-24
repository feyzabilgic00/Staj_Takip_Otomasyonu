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

import Entity.danisman;
import Entity.program;
import Utility.baglanti;

import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.SQLException;
import java.awt.event.ActionEvent;

public class danismanEkle extends JFrame {

	private JPanel contentPane;
	private JTable table;
	private JTextField txtDanismanId;
	private JTextField txtAdý;
	private JTextField txtSoyadi;
	private JTextField txtBolumId;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					danismanEkle frame = new danismanEkle();
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
	public danismanEkle() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 532, 478);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(41, 326, 452, 103);
		contentPane.add(scrollPane);
		
		table = new JTable();
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
			},
			new String[] {
				"New column", "New column", "New column", "New column"
			}
		));
		table.setBounds(47, 212, 351, 140);
		scrollPane.setViewportView(table);
		
		JLabel lblDanismanId = new JLabel("Dan\u0131\u015Fman Id:");
		lblDanismanId.setBounds(25, 39, 97, 30);
		contentPane.add(lblDanismanId);
		
		JLabel lblAdi = new JLabel("Ad\u0131:");
		lblAdi.setBounds(25, 80, 97, 30);
		contentPane.add(lblAdi);
		
		JLabel lblSoyadi = new JLabel("Soyad\u0131:");
		lblSoyadi.setBounds(25, 121, 97, 30);
		contentPane.add(lblSoyadi);
		
		JLabel lblBolumId = new JLabel("B\u00F6l\u00FCm Id:");
		lblBolumId.setBounds(25, 162, 97, 30);
		contentPane.add(lblBolumId);
		
		txtDanismanId = new JTextField();
		txtDanismanId.setBounds(102, 44, 163, 20);
		contentPane.add(txtDanismanId);
		txtDanismanId.setColumns(10);
		
		txtAdý = new JTextField();
		txtAdý.setColumns(10);
		txtAdý.setBounds(102, 85, 163, 20);
		contentPane.add(txtAdý);
		
		txtSoyadi = new JTextField();
		txtSoyadi.setColumns(10);
		txtSoyadi.setBounds(102, 126, 163, 20);
		contentPane.add(txtSoyadi);
		
		txtBolumId = new JTextField();
		txtBolumId.setColumns(10);
		txtBolumId.setBounds(102, 162, 163, 20);
		contentPane.add(txtBolumId);
		
		JButton btnKaydet = new JButton("Kaydet");
		btnKaydet.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				

				try {
					Connection myConn=(Connection) baglanti.yap();
					Statement myStat=(Statement) myConn.createStatement();
					danisman d=new danisman();
					d.setDanisman_id(txtDanismanId.getText());
					d.setAdi(txtAdý.getText());
					d.setSoyadi(txtSoyadi.getText());
					d.setBolum_id(txtBolumId.getText());

					
				    myStat.executeUpdate("insert into danisman(danisman_id,adi,soyadi,bolum_id) values('"+d.getDanisman_id()+"','"+d.getAdi()+"','"+d.getSoyadi()+"','"+d.getBolum_id()+"')");
				    //System.out.println(sql_sorgu);
					}catch(SQLException e1) {
						System.out.println(e1);
						}
			}
		});
		btnKaydet.setBounds(10, 210, 112, 44);
		contentPane.add(btnKaydet);
		
		JButton btnGuncelle = new JButton("G\u00FCncelle");
		btnGuncelle.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				try {
					Connection myConn=(Connection) baglanti.yap();
					Statement myStat=(Statement) myConn.createStatement();
					danisman d=new danisman();
					d.setDanisman_id(txtDanismanId.getText());
					d.setAdi(txtAdý.getText());
					d.setSoyadi(txtSoyadi.getText());
					d.setBolum_id(txtBolumId.getText());
					
					 myStat.executeUpdate("update danisman set adi='"+d.getAdi()+"',soyadi='"+d.getSoyadi()+"',bolum_id='"+d.getBolum_id()+"' where danisman_id="+d.getDanisman_id());

				} catch (SQLException e2) {
					// TODO Auto-generated catch block
					e2.printStackTrace();
				}
				
				
			}
		});
		btnGuncelle.setBounds(153, 210, 112, 44);
		contentPane.add(btnGuncelle);
		
		JButton btnSil = new JButton("Sil");
		btnSil.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				try {
					Connection myConn=(Connection) baglanti.yap();
					Statement myStat=(Statement) myConn.createStatement();
					danisman d=new danisman();
					d.setDanisman_id(txtDanismanId.getText());
					d.setAdi(txtAdý.getText());
					d.setSoyadi(txtSoyadi.getText());
					d.setBolum_id(txtBolumId.getText());
					
					 myStat.executeUpdate("delete from danisman where danisman_id="+d.getDanisman_id());

				} catch (SQLException e1) {
				
					e1.printStackTrace();
				}
				
				
				
			}
		});
		btnSil.setBounds(301, 210, 112, 44);
		contentPane.add(btnSil);
		//contentPane.add(table);
	}
}
