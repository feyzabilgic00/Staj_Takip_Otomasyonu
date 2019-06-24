package CRUD;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import net.proteanit.sql.DbUtils;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.plaf.basic.BasicComboBoxUI.ComboBoxLayoutManager;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import com.mysql.jdbc.Statement;

import Entity.bolumm;
import Entity.komisyon_uyeleri;
import Utility.baglanti;


import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.SQLException;
import java.awt.event.ActionEvent;
import java.sql.ResultSet;
public class bolumKomisyonUyeEslesme extends JFrame {

	private JPanel contentPane;
	private JTable tablo;
	private JLabel lblBolum;
	private JLabel lblKomisyonKod;
	private JLabel lblKodListele;



		/*  public TableModelTest(File directory){
		      this.directory=directory;
		  }*/
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					bolumKomisyonUyeEslesme frame = new bolumKomisyonUyeEslesme();
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
	public bolumKomisyonUyeEslesme() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 554, 597);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(23, 251, 505, 119);
		contentPane.add(scrollPane);
		
		tablo = new JTable();
		tablo.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
			},
			new String[] {
				"Id", "Ba\u015Fkan", "\u00DCye", "\u00DCye", "Program", "B\u00F6l\u00FCm"
			}
		));
		tablo.setBounds(62, 208, 331, 73);
		scrollPane.setViewportView(tablo);
		
		lblBolum = new JLabel("E\u015Fle\u015Ftirilecek B\u00F6l\u00FCm:");
		lblBolum.setBounds(35, 31, 134, 14);
		contentPane.add(lblBolum);
		
		
		
		JComboBox comboBolum = new JComboBox();
		comboBolum.setModel(new DefaultComboBoxModel(new String[] {"\u0130n\u015Faat", "Makine ve Metal Teknolojleri", "Elektrik ve Enerji", "El Sanatlar\u0131", "Mimarl\u0131k ve \u015Eehir Planlama", "Elektrik ve Otomasyon", "Bilgisayar Teknolojileri", "Ula\u015Ft\u0131rma Hizmetleri", "Meyve \u00DCr\u00FCnleri"}));
		comboBolum.setBounds(188, 28, 199, 20);
		contentPane.add(comboBolum);
		
		JComboBox comboKod = new JComboBox();
		comboKod.setModel(new DefaultComboBoxModel(new String[] {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12"}));
		comboKod.setBounds(188, 68, 60, 20);
		contentPane.add(comboKod);
		//contentPane.add(table);
		
		lblKomisyonKod = new JLabel("E\u015Fle\u015Ftirilecek Komisyon Kodu:");
		lblKomisyonKod.setBounds(35, 71, 150, 14);
		contentPane.add(lblKomisyonKod);
		
		lblKodListele = new JLabel("Komisyon Kodlar\u0131n\u0131 Listele:");
		lblKodListele.setBounds(35, 171, 150, 14);
		contentPane.add(lblKodListele);
		
		JButton btnEslestir = new JButton("E\u015Fle\u015Ftir");
		btnEslestir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			
				try {
					Connection myConn=(Connection) baglanti.yap();
					Statement myStat=(Statement) myConn.createStatement();
					komisyon_uyeleri ku=new komisyon_uyeleri();
					
                      ku.setKomisyon_id((String)comboKod.getModel().getSelectedItem() );
				 
					ResultSet rs=myStat.executeQuery("select * from komisyon_uye k where k.komisyon_id='"+ku.getKomisyon_id()+"' and bolum_id in  (Select bolum_id from bolum where bolum_adi='"+(String)comboBolum.getModel().getSelectedItem()+"')");
					 tablo.setModel(DbUtils.resultSetToTableModel(rs));

				} catch (SQLException e2) {
					// TODO Auto-generated catch block
					e2.printStackTrace();
				}
				
			
			}
		});
		btnEslestir.setBounds(227, 110, 89, 23);
		contentPane.add(btnEslestir);
		
		JButton btnListeAc = new JButton("Listeyi A\u00E7");
		btnListeAc.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				try {
					Connection myConn=(Connection) baglanti.yap();
					Statement myStat=(Statement) myConn.createStatement();
					komisyon_uyeleri ku=new komisyon_uyeleri();
					
					ResultSet rs=myStat.executeQuery("select k.komisyon_id ,b.bolum_adi from komisyon_uye k inner join bolum b on k.bolum_id=b.bolum_id ");
					 
					 tablo.setModel(DbUtils.resultSetToTableModel(rs));

				} catch (SQLException e2) {
					// TODO Auto-generated catch block
					e2.printStackTrace();
				}
				
				
				
			}
		});
		btnListeAc.setBounds(188, 167, 89, 23);
		contentPane.add(btnListeAc);
		
		JButton btnListeKapat = new JButton("Listeyi Kapat");
		btnListeKapat.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				DefaultTableModel dm = (DefaultTableModel)tablo.getModel();
				dm.getDataVector().removeAllElements();
				tablo.repaint();
				
			}
		});
		btnListeKapat.setBounds(287, 167, 110, 23);
		contentPane.add(btnListeKapat);
		

	}
}
