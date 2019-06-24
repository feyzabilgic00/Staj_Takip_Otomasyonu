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

import Entity.bolumCache;
import Entity.bolumm;
import Entity.ogrencii;
import Utility.baglanti;

import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.SQLException;
import java.awt.event.ActionEvent;

public class bolumEkle extends JFrame {

	private JPanel contentPane;
	private JTable table;
	private JTextField txtBolumId;
	private JTextField txtBolumAdi;
	private JLabel lblBolumId;
	private JLabel lblBolumAdi;
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
					bolumEkle frame = new bolumEkle();
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
	public bolumEkle() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 457, 386);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(87, 223, 264, 96);
		contentPane.add(scrollPane);
		
		table = new JTable();
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null},
				{null, null},
				{null, null},
				{null, null},
			},
			new String[] {
				"New column", "New column"
			}
		));
		table.setBounds(31, 129, 359, 181);
		scrollPane.setViewportView(table);
		
		txtBolumId = new JTextField();
		txtBolumId.setBounds(132, 22, 142, 20);
		contentPane.add(txtBolumId);
		txtBolumId.setColumns(10);
		
		txtBolumAdi = new JTextField();
		txtBolumAdi.setColumns(10);
		txtBolumAdi.setBounds(132, 60, 142, 20);
		contentPane.add(txtBolumAdi);
		
		lblBolumId = new JLabel("B\u00F6l\u00FCm Id:");
		lblBolumId.setBounds(28, 25, 72, 17);
		contentPane.add(lblBolumId);
		
		lblBolumAdi = new JLabel("B\u00F6l\u00FCm Ad\u0131:");
		lblBolumAdi.setBounds(28, 63, 72, 17);
		contentPane.add(lblBolumAdi);
		
		btnKaydet = new JButton("Kaydet");
		btnKaydet.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
				try {
					Connection myConn=(Connection) baglanti.yap();
					Statement myStat=(Statement) myConn.createStatement();
					bolumCache.bellekYukle();
					//bolumm b=new bolumm();
					 bolumm clonedbolumm = bolumCache.getBolumm(txtBolumId.getText());
				    
					 //clonedbolumm.setBolum_id(txtBolumId.getText());
					 
					 clonedbolumm.setBolum_adi(txtBolumAdi.getText());
					
					
				    myStat.executeUpdate("insert into bolum(bolum_id,bolum_adi) values('"+clonedbolumm.getBolum_id()+"','"+clonedbolumm.getBolum_adi()+"')");
				    //System.out.println(sql_sorgu);
					}catch(SQLException e1) {
						System.out.println(e1);
						}
				
			}
		});
		btnKaydet.setBounds(28, 123, 89, 49);
		contentPane.add(btnKaydet);
		
		btnGuncelle = new JButton("G\u00FCncelle");
		btnGuncelle.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				

				try {
					Connection myConn=(Connection) baglanti.yap();
					Statement myStat=(Statement) myConn.createStatement();
					bolumCache.bellekYukle();
					 bolumm clonedbolumm = bolumCache.getBolumm(txtBolumId.getText());
					 clonedbolumm.setBolum_adi(txtBolumAdi.getText());   
					/*bolumm b=new bolumm();
					b.setBolum_id(txtBolumId.getText());
					b.setBolum_adi(txtBolumAdi.getText());*/
					   
					
					 myStat.executeUpdate("update bolum set bolum_adi='"+clonedbolumm.getBolum_adi()+"' where bolum_id="+clonedbolumm.getBolum_id());

				} catch (SQLException e2) {
					// TODO Auto-generated catch block
					e2.printStackTrace();
				}
				
				
			}
		});
		btnGuncelle.setBounds(144, 123, 89, 49);
		contentPane.add(btnGuncelle);
		
		btnSil = new JButton("Sil");
		btnSil.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				try {
					Connection myConn=(Connection) baglanti.yap();
					Statement myStat=(Statement) myConn.createStatement();
					 bolumm clonedbolumm = bolumCache.getBolumm(txtBolumId.getText());
					 clonedbolumm.setBolum_adi(txtBolumAdi.getText()); 
					
					/*bolumm b=new bolumm();
					b.setBolum_id(txtBolumId.getText());
					b.setBolum_adi(txtBolumAdi.getText()); */
					
					 myStat.executeUpdate("delete from bolum where bolum_id="+clonedbolumm.getBolum_id());

				} catch (SQLException e1) {
				
					e1.printStackTrace();
				}
			}
		});
		btnSil.setBounds(262, 123, 89, 49);
		contentPane.add(btnSil);
		//contentPane.add(table);
	}

}
