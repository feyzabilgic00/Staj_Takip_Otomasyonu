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

import Entity.bolumm;
import Entity.program;
import Utility.baglanti;

import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.SQLException;
import java.awt.event.ActionEvent;

public class programEkle extends JFrame {

	private JPanel contentPane;
	private JTable table;
	private JLabel lblProgramId;
	private JLabel lblProgramAdi;
	private JLabel lblBolumId;
	private JTextField txtProgramId;
	private JTextField txtProgramAdý;
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
					programEkle frame = new programEkle();
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
	public programEkle() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 453, 415);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(27, 214, 400, 127);
		contentPane.add(scrollPane);
		
		table = new JTable();
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null, null},
				{null, null, null},
				{null, null, null},
				{null, null, null},
			},
			new String[] {
				"New column", "New column", "New column"
			}
		));
		table.setBounds(71, 35, 333, 85);
		scrollPane.setViewportView(table);
		
		lblProgramId = new JLabel("Program Id:");
		lblProgramId.setBounds(40, 28, 86, 29);
		contentPane.add(lblProgramId);
		
		lblProgramAdi = new JLabel("Program Ad\u0131:");
		lblProgramAdi.setBounds(40, 68, 86, 29);
		contentPane.add(lblProgramAdi);
		
		lblBolumId = new JLabel("B\u00F6l\u00FCm Id:");
		lblBolumId.setBounds(40, 112, 86, 29);
		contentPane.add(lblBolumId);
		
		txtProgramId = new JTextField();
		txtProgramId.setBounds(136, 32, 144, 20);
		contentPane.add(txtProgramId);
		txtProgramId.setColumns(10);
		
		txtProgramAdý = new JTextField();
		txtProgramAdý.setColumns(10);
		txtProgramAdý.setBounds(136, 72, 144, 20);
		contentPane.add(txtProgramAdý);
		
		txtBolumId = new JTextField();
		txtBolumId.setColumns(10);
		txtBolumId.setBounds(136, 112, 144, 20);
		contentPane.add(txtBolumId);
		
		btnKaydet = new JButton("Kaydet");
		btnKaydet.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				try {
					Connection myConn=(Connection) baglanti.yap();
					Statement myStat=(Statement) myConn.createStatement();
					program p=new program();
					p.setProgram_id(txtProgramId.getText());
					
					p.setProgram_adi(txtProgramAdý.getText());
					p.setBolum_id(txtBolumId.getText());
					
					
				    myStat.executeUpdate("insert into program(program_id,program_adi,bolum_id) values('"+p.getProgram_id()+"','"+p.getProgram_adi()+"','"+p.getBolum_id()+"')");
				    //System.out.println(sql_sorgu);
					}catch(SQLException e1) {
						System.out.println(e1);
						}
				
				
			}
		});
		btnKaydet.setBounds(40, 151, 86, 29);
		contentPane.add(btnKaydet);
		
		btnGuncelle = new JButton("G\u00FCncelle");
		btnGuncelle.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
				try {
					Connection myConn=(Connection) baglanti.yap();
					Statement myStat=(Statement) myConn.createStatement();
					program p=new program();
					p.setProgram_id(txtProgramId.getText());
					
					p.setProgram_adi(txtProgramAdý.getText());
					p.setBolum_id(txtBolumId.getText());
					
					 myStat.executeUpdate("update program set program_adi='"+p.getProgram_adi()+"',bolum_id='"+p.getBolum_id()+"' where program_id="+p.getProgram_id());

				} catch (SQLException e2) {
					// TODO Auto-generated catch block
					e2.printStackTrace();
				}
				
				
				
			}
		});
		btnGuncelle.setBounds(146, 151, 86, 29);
		contentPane.add(btnGuncelle);
		
		btnSil = new JButton("Sil");
		btnSil.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				try {
					Connection myConn=(Connection) baglanti.yap();
					Statement myStat=(Statement) myConn.createStatement();
					program p=new program();
					p.setProgram_id(txtProgramId.getText());
					
					p.setProgram_adi(txtProgramAdý.getText());
					p.setBolum_id(txtBolumId.getText());
					
					 myStat.executeUpdate("delete from program where program_id="+p.getProgram_id());

				} catch (SQLException e1) {
				
					e1.printStackTrace();
				}
				
				
			}
		});
		btnSil.setBounds(259, 151, 86, 29);
		contentPane.add(btnSil);
		//contentPane.add(table);
	}

}
