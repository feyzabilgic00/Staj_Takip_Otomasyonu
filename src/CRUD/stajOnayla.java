package CRUD;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JTextField;
import com.toedter.calendar.JCalendar;
import javax.swing.JComboBox;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class stajOnayla extends JFrame {

	private JPanel contentPane;
	private JTextField txtOgrenciNo1;
	private JTextField txtOgrenciNo2;
	private JTextField txtAd�;
	private JTextField txtSoyad�;
	private JTextField txtStajDurumu;
	private JTextField txtBolum;
	private JTextField txtProgram;
	private JTextField txtEgtmOgrtmY�l;
	private JTextField txtStajYeri;
	private JTextField txtStajAdresi;
	private JTextField txtKomisyonBaskan�;
	private JTextField txtUye1;
	private JTextField txtUye2;

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
		setBounds(100, 100, 628, 897);
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
		
		JLabel lblAd� = new JLabel("Ad\u0131:");
		lblAd�.setBounds(10, 91, 100, 14);
		contentPane.add(lblAd�);
		
		JLabel lblSoyad� = new JLabel("Soyad\u0131:");
		lblSoyad�.setBounds(10, 127, 100, 14);
		contentPane.add(lblSoyad�);
		
		JLabel lblStajDurumu = new JLabel("Staj Durumu:");
		lblStajDurumu.setBounds(10, 152, 100, 14);
		contentPane.add(lblStajDurumu);
		
		JLabel lblBolum = new JLabel("B\u00F6l\u00FCm\u00FC:");
		lblBolum.setBounds(10, 190, 100, 14);
		contentPane.add(lblBolum);
		
		JLabel lblProgram = new JLabel("Program\u0131:");
		lblProgram.setBounds(10, 227, 100, 14);
		contentPane.add(lblProgram);
		
		JLabel lblEgtmOgrtmY�l = new JLabel("E\u011Fitim \u00D6\u011Fretim Y\u0131l\u0131:");
		lblEgtmOgrtmY�l.setBounds(10, 265, 100, 14);
		contentPane.add(lblEgtmOgrtmY�l);
		
		JLabel lblBaslamaBitisTarihi = new JLabel("Staj Ba\u015Flama/Biti\u015F Tarihi:");
		lblBaslamaBitisTarihi.setBounds(10, 349, 117, 14);
		contentPane.add(lblBaslamaBitisTarihi);
		
		JLabel lblKabulEdilenGunSay�s� = new JLabel("Kabul Edilen G\u00FCn Say\u0131s\u0131:");
		lblKabulEdilenGunSay�s�.setBounds(10, 484, 117, 14);
		contentPane.add(lblKabulEdilenGunSay�s�);
		
		JLabel lblStajYeri = new JLabel("Staj Yeri:");
		lblStajYeri.setBounds(10, 520, 100, 14);
		contentPane.add(lblStajYeri);
		
		JLabel lblStajAdresi = new JLabel("Staj Adresi:");
		lblStajAdresi.setBounds(10, 557, 100, 14);
		contentPane.add(lblStajAdresi);
		
		JLabel lblStajKomisyonBaskan� = new JLabel("Staj Komisyon Ba\u015Fkan\u0131:");
		lblStajKomisyonBaskan�.setBounds(10, 597, 117, 14);
		contentPane.add(lblStajKomisyonBaskan�);
		
		JLabel lblStajKomisyonuye1 = new JLabel("Staj Komisyon \u00DCye:");
		lblStajKomisyonuye1.setBounds(10, 622, 100, 14);
		contentPane.add(lblStajKomisyonuye1);
		
		JLabel lblStajKomisyonuye2 = new JLabel("Staj Komisyon \u00DCye:");
		lblStajKomisyonuye2.setBounds(10, 647, 100, 14);
		contentPane.add(lblStajKomisyonuye2);
		
		JButton btnOgrenciOnayla = new JButton("\u00D6\u011Frenci Onayla");
		btnOgrenciOnayla.setBounds(30, 703, 126, 23);
		contentPane.add(btnOgrenciOnayla);
		
		txtOgrenciNo1 = new JTextField();
		txtOgrenciNo1.setBounds(138, 21, 227, 20);
		contentPane.add(txtOgrenciNo1);
		txtOgrenciNo1.setColumns(10);
		
		txtOgrenciNo2 = new JTextField();
		txtOgrenciNo2.setColumns(10);
		txtOgrenciNo2.setBounds(138, 53, 227, 20);
		contentPane.add(txtOgrenciNo2);
		
		txtAd� = new JTextField();
		txtAd�.setColumns(10);
		txtAd�.setBounds(138, 84, 227, 20);
		contentPane.add(txtAd�);
		
		txtSoyad� = new JTextField();
		txtSoyad�.setColumns(10);
		txtSoyad�.setBounds(138, 115, 227, 20);
		contentPane.add(txtSoyad�);
		
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
		
		txtEgtmOgrtmY�l = new JTextField();
		txtEgtmOgrtmY�l.setColumns(10);
		txtEgtmOgrtmY�l.setBounds(138, 259, 227, 20);
		contentPane.add(txtEgtmOgrtmY�l);
		
		JCalendar calendar = new JCalendar();
		calendar.setBounds(148, 310, 191, 153);
		contentPane.add(calendar);
		
		JCalendar calendar_1 = new JCalendar();
		calendar_1.setBounds(378, 310, 191, 153);
		contentPane.add(calendar_1);
		
		txtStajYeri = new JTextField();
		txtStajYeri.setColumns(10);
		txtStajYeri.setBounds(138, 517, 227, 20);
		contentPane.add(txtStajYeri);
		
		txtStajAdresi = new JTextField();
		txtStajAdresi.setColumns(10);
		txtStajAdresi.setBounds(138, 554, 227, 20);
		contentPane.add(txtStajAdresi);
		
		txtKomisyonBaskan� = new JTextField();
		txtKomisyonBaskan�.setColumns(10);
		txtKomisyonBaskan�.setBounds(138, 594, 227, 20);
		contentPane.add(txtKomisyonBaskan�);
		
		txtUye1 = new JTextField();
		txtUye1.setColumns(10);
		txtUye1.setBounds(138, 619, 227, 20);
		contentPane.add(txtUye1);
		
		txtUye2 = new JTextField();
		txtUye2.setColumns(10);
		txtUye2.setBounds(138, 644, 227, 20);
		contentPane.add(txtUye2);
		
		JComboBox comboKabulEdilenGunSay�s� = new JComboBox();
		comboKabulEdilenGunSay�s�.setBounds(137, 481, 228, 20);
		contentPane.add(comboKabulEdilenGunSay�s�);
		
		JButton btnGetir = new JButton("Getir");
		btnGetir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				
				
				
				
				
			}
		});
		btnGetir.setBounds(397, 20, 80, 28);
		contentPane.add(btnGetir);
	}
}
