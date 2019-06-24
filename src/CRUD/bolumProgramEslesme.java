package CRUD;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import com.mysql.jdbc.Statement;

import Entity.bolumm;
import Entity.komisyon_uyeleri;
import Entity.program;
import Utility.baglanti;
import net.proteanit.sql.DbUtils;

import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.awt.event.ActionEvent;

public class bolumProgramEslesme extends JFrame {

	private JPanel contentPane;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					bolumProgramEslesme frame = new bolumProgramEslesme();
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
	public bolumProgramEslesme() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 513, 492);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JComboBox comboBolum = new JComboBox();
		comboBolum.setModel(new DefaultComboBoxModel(new String[] {"\u0130n\u015Faat", "Makine ve Metal Teknolojileri", "Elektrik ve Enerji", "El Sanatlar\u0131", "Mimarl\u0131k ve \u015Eehir Planlama", "Elektrik ve Otomasyon", "Bilgisayar Teknolojileri", "Ula\u015Ft\u0131rma Hizmetleri", "Meyve \u00DCr\u00FCnleri"}));
		comboBolum.setBounds(116, 11, 217, 35);
		contentPane.add(comboBolum);
		
		JComboBox comboProgram = new JComboBox();
		comboProgram.setModel(new DefaultComboBoxModel(new String[] {"\u0130n\u015Faat Teknolojisi", "Yap\u0131 Denetim Program\u0131", "Kaynak Teknolojisi Program\u0131", "Elektrik Prgram\u0131", "Harita ve Kadastro Program\u0131", "Elektronik Teknolojisi"}));
		comboProgram.setBounds(116, 69, 217, 35);
		contentPane.add(comboProgram);
		
		JLabel lblBolum = new JLabel("B\u00F6l\u00FCm:");
		lblBolum.setBounds(30, 21, 76, 25);
		contentPane.add(lblBolum);
		
		JLabel lblProgram = new JLabel("Program:");
		lblProgram.setBounds(30, 79, 76, 25);
		contentPane.add(lblProgram);
		
		JButton btnEslestir = new JButton("E\u015Fle\u015Ftir");
		btnEslestir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				
				try {
					Connection myConn=(Connection) baglanti.yap();
					Statement myStat=(Statement) myConn.createStatement();
					program p=new program();
					
				    p.setProgram_adi((String)comboProgram.getModel().getSelectedItem());
					ResultSet rs=myStat.executeQuery("select * from program p where p.program_adi='"+p.getProgram_adi()+"' and bolum_id in  (Select bolum_id from bolum where bolum_adi='"+(String)comboBolum.getModel().getSelectedItem()+"')");
					table.setModel(DbUtils.resultSetToTableModel(rs));

				} catch (SQLException e2) {
					// TODO Auto-generated catch block
					e2.printStackTrace();
				}
				
			}
		});
		btnEslestir.setBounds(159, 140, 89, 23);
		contentPane.add(btnEslestir);
		
		table = new JTable();
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
			},
			new String[] {
				"B\u00F6l\u00FCm_id", "B\u00F6l\u00FCm Ad\u0131", "Program_id", "Program Ad\u0131"
			}
		));
		table.setBounds(10, 195, 477, 234);
		contentPane.add(table);
	}
}
