package kalkulator_ip;

import javax.swing.JTabbedPane;
import javax.swing.JTextField;
import javax.swing.JPanel;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JComponent;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

public class Kalkulator extends JPanel {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	WynikGUI wynikGUI = new WynikGUI();
	private JComponent panel1 = makePanel();
	private JComponent panel2 = makePanel();
	private JComponent panel3 = makePanel();
	public static JFrame frame = new JFrame("Kalkulator IP by: K. Cie\u017C & B. Cholewa");
	public Color kolor = Color.GRAY;

	// zakładka 1
	private static JTextField textField_Adres_Sieci_Pelne;
	private static JTextField textField_Liczba_Hostow_Pelne;
	JLabel lblWynik_Wolne;
	// zakładka 2
	private static JTextField textField_Adres_Sieci_Wolne;
	private static JTextField textField_Liczba_Hostow_Wolne;
	private static JTextField textField_Liczba_Procent_Wolne;
	// private static JTextPane textPane;
	// zakładka3
	private static JTextField textField_Adres_Sieci;
	private static JTextField textField_Numer_Podsieci;
	private static JTextField textField_Liczba_Hostow1;

	private static JTextField textField_Procent_Wolnych;

	public Kalkulator() {
		super(new GridLayout(1, 1));

		JTabbedPane tabbedPane = new JTabbedPane();

		panel1.setPreferredSize(new Dimension(500, 300));// zakładka 1
		panel1.setBackground(kolor);
		tabbedPane.addTab("1.Podejście z pełnymi sieciami", null, panel1,
				"Sieci są możliwie pełne, nie ma wolnych adersów");
		panel1.setLayout(null);
		///////////////////////////////

		JLabel lblKalkulatorIp_pelne = new JLabel("Kalkulator IP - pełne sieci");
		lblKalkulatorIp_pelne.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblKalkulatorIp_pelne.setBounds(10, 11, 250, 49);
		panel1.add(lblKalkulatorIp_pelne);

		JLabel lblPdajAdresSieci_pelne = new JLabel("Podaj adres sieci: ");
		lblPdajAdresSieci_pelne.setBounds(10, 103, 110, 35);
		panel1.add(lblPdajAdresSieci_pelne);

		JLabel lblLiczbaHostw_pelne = new JLabel("Liczba host\u00F3w:");
		lblLiczbaHostw_pelne.setBounds(10, 136, 102, 28);
		panel1.add(lblLiczbaHostw_pelne);

		JButton btnOblicz_pelne = new JButton("Oblicz");
		btnOblicz_pelne.setBounds(10, 170, 89, 23);
		panel1.add(btnOblicz_pelne);
		btnOblicz_pelne.addActionListener(new PrzyciskListenerObliczPelne());
		// return btnOblicz;

		textField_Adres_Sieci_Pelne = new JTextField();
		textField_Adres_Sieci_Pelne.setBounds(113, 109, 136, 20);
		panel1.add(textField_Adres_Sieci_Pelne);
		textField_Adres_Sieci_Pelne.setColumns(10);

		textField_Liczba_Hostow_Pelne = new JTextField();
		textField_Liczba_Hostow_Pelne.setBounds(113, 140, 86, 20);
		panel1.add(textField_Liczba_Hostow_Pelne);
		textField_Liczba_Hostow_Pelne.setColumns(10);

		///////////////////////////////
		panel2.setPreferredSize(new Dimension(500, 300));// zakładka 2
		panel2.setBackground(kolor);
		tabbedPane.addTab("2.Podejście z wolnymi adresami", null, panel2, "Zostają wolne adresy w wyliczonej sieci ");
		panel2.setLayout(null);

		///////////////////////////////
		//// Zakładka 2 Początek
		JLabel lblKalkulatorIp_Wolne = new JLabel("Kalkulator IP - wolne hosty");
		lblKalkulatorIp_Wolne.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblKalkulatorIp_Wolne.setBounds(10, 11, 250, 49);
		panel2.add(lblKalkulatorIp_Wolne);

		JLabel lblPdajAdresSieci_Wolne = new JLabel("Podaj adres sieci: ");
		lblPdajAdresSieci_Wolne.setBounds(10, 103, 110, 35);
		panel2.add(lblPdajAdresSieci_Wolne);

		JLabel lblLiczbaHostw_Wolne = new JLabel("Liczba hostów:");
		lblLiczbaHostw_Wolne.setBounds(10, 136, 102, 28);
		panel2.add(lblLiczbaHostw_Wolne);

		JLabel lblLiczbaWolnych_Wolne = new JLabel("Procent wolnych hostów:");
		lblLiczbaWolnych_Wolne.setBounds(10, 169, 148, 28);
		panel2.add(lblLiczbaWolnych_Wolne);

		JButton btnOblicz_Wolne = new JButton("Oblicz");
		btnOblicz_Wolne.setBounds(10, 220, 89, 23);
		panel2.add(btnOblicz_Wolne);
		btnOblicz_Wolne.addActionListener(new PrzyciskListenerObliczWolne());

		textField_Adres_Sieci_Wolne = new JTextField();
		textField_Adres_Sieci_Wolne.setBounds(155, 109, 136, 20);
		panel2.add(textField_Adres_Sieci_Wolne);
		textField_Adres_Sieci_Wolne.setColumns(10);

		textField_Liczba_Hostow_Wolne = new JTextField();
		textField_Liczba_Hostow_Wolne.setBounds(155, 140, 86, 20);
		panel2.add(textField_Liczba_Hostow_Wolne);
		textField_Liczba_Hostow_Wolne.setColumns(10);

		textField_Liczba_Procent_Wolne = new JTextField();
		textField_Liczba_Procent_Wolne.setBounds(155, 171, 86, 20);
		panel2.add(textField_Liczba_Procent_Wolne);
		textField_Liczba_Procent_Wolne.setColumns(10);

		// Zakładka 2 koniec

		///////////////////////////////
		panel3.setPreferredSize(new Dimension(500, 300));// zakładka 3
		panel3.setBackground(kolor);
		tabbedPane.addTab("3.Podejście architekta", null, panel3, "Projektowanie sieci");
		panel3.setLayout(null);

		////////////////////////////////

		JLabel lblKalkulatorIp = new JLabel("Kalkulator IP - podejście architekta");
		lblKalkulatorIp.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblKalkulatorIp.setBounds(10, 11, 350, 49);
		panel3.add(lblKalkulatorIp);

		JLabel lblPdajAdresSieci = new JLabel("Podaj adres sieci: ");
		lblPdajAdresSieci.setBounds(10, 103, 110, 35);
		panel3.add(lblPdajAdresSieci);

		JLabel lblLiczbaPodsieci = new JLabel("Numer podsieci do zmiany:");
		lblLiczbaPodsieci.setBounds(10, 196, 200, 28);
		panel3.add(lblLiczbaPodsieci);

		JLabel lblLiczbaHostw = new JLabel("Liczba host\u00F3w:");
		lblLiczbaHostw.setBounds(10, 133, 102, 35);
		panel3.add(lblLiczbaHostw);

		JLabel lblProcent = new JLabel("Procent wolych adresów:");
		lblProcent.setBounds(10, 166, 145, 35);
		panel3.add(lblProcent);

		JButton btnOblicz = new JButton("Oblicz");
		btnOblicz.setBounds(10, 240, 89, 23);
		panel3.add(btnOblicz);
		btnOblicz.addActionListener(new PrzyciskListenerObliczArchitekt());

		JButton btnDodaj = new JButton("Dodaj hosty");
		btnDodaj.setBounds(150, 140, 100, 23);
		panel3.add(btnDodaj);
		btnDodaj.addActionListener(new PrzyciskListenerDodajArchitekt());

		JButton btnZmien = new JButton("Zmień");
		btnZmien.setBounds(170, 240, 80, 23);
		panel3.add(btnZmien);
		btnZmien.addActionListener(new PrzyciskListenerZmienArchitekt());
		// return btnOblicz;

		textField_Adres_Sieci = new JTextField();
		textField_Adres_Sieci.setBounds(113, 109, 136, 20);
		panel3.add(textField_Adres_Sieci);
		textField_Adres_Sieci.setColumns(10);

		textField_Numer_Podsieci = new JTextField();
		textField_Numer_Podsieci.setBounds(170, 202, 80, 20);
		panel3.add(textField_Numer_Podsieci);
		textField_Numer_Podsieci.setColumns(10);

		textField_Liczba_Hostow1 = new JTextField();
		textField_Liczba_Hostow1.setBounds(113, 140, 30, 20);
		panel3.add(textField_Liczba_Hostow1);
		textField_Liczba_Hostow1.setColumns(10);

		textField_Procent_Wolnych = new JTextField();
		textField_Procent_Wolnych.setBounds(170, 172, 80, 20);
		panel3.add(textField_Procent_Wolnych);
		textField_Procent_Wolnych.setColumns(10);

		////////////////////////////////

		// Add the tabbed pane to this panel.
		add(tabbedPane);

	}

	public static void main(String[] args) {

		javax.swing.SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				GUI();
			}
		});
	}

	protected JComponent makePanel() {
		JPanel panel = new JPanel(false);

		panel.setLayout(new GridLayout(1, 1));

		return panel;
	}

	private static void GUI() {
		// Make sure we have nice window decorations.
		// JFrame.setDefaultLookAndFeelDecorated(true);

		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setBounds(0, 0, 500, 300);
		frame.setLocationRelativeTo(null);
		frame.setResizable(false);

		// Create and set up the content pane.
		JComponent newContentPane = new Kalkulator();
		newContentPane.setOpaque(true); // content panes must be opaque
		frame.getContentPane().add(new Kalkulator(), BorderLayout.CENTER);

		// Display the window.
		frame.pack();
		frame.setVisible(true);
	}

	private class PrzyciskListenerObliczPelne implements ActionListener {

		public void actionPerformed(ActionEvent event) {

			try {
				Pelne p = new Pelne();
				p.hosty = Integer.parseInt(textField_Liczba_Hostow_Pelne.getText());
				p.Licz_hosty(p.siec = pobierzLiczbyZeStringa(textField_Adres_Sieci_Pelne.getText()));
				wynikGUI.initialize();
				for (int i = 0; i <= p.wynik.size() - 1; i++) {
					wynikGUI.textArea.append(p.wynik.get(i) + "\n");
				}
			} catch (IndexOutOfBoundsException e) {

			}

		}

	}

	// Zakładka 2 Przycisk Oblicz
	private class PrzyciskListenerObliczWolne implements ActionListener {

		public void actionPerformed(ActionEvent event) {

			try {
				int procent = Integer.parseInt(textField_Liczba_Procent_Wolne.getText());
				int liczbaHostow = Integer.parseInt(textField_Liczba_Hostow_Wolne.getText());
				int liczbaCalkowita = (liczbaHostow * (100 + procent)) / 100;
				Wolne wolne = new Wolne();
				wolne.hosty = liczbaCalkowita;
				wolne.Licz_hosty(wolne.siec = pobierzLiczbyZeStringa(textField_Adres_Sieci_Wolne.getText()));
				wynikGUI.initialize();
				for (int i = 0; i <= wolne.wynik.size() - 1; i++) {
					wynikGUI.textArea.append(wolne.wynik.get(i) + "\n");
				}
			} catch (IndexOutOfBoundsException e) {

			}
		}

	}

	private class PrzyciskListenerDodajArchitekt implements ActionListener {

		public void actionPerformed(ActionEvent event) {

			int hosty = Integer.parseInt(textField_Liczba_Hostow1.getText());
			// wynikGUI.frame.setVisible(false);
			Architekt.liczba_hostow_architekt.add(hosty);

			Architekt.sieci.add(Integer.toString(hosty));

			wynikGUI.initialize();
			wynikGUI.frame.setBounds(139, 210, 300, 300);
			Architekt.Sortuj_liste_sieci();
			for (int i = 0; i <= Architekt.sieci.size() - 1; i++) {

				wynikGUI.textArea.append("Sieć " + (i + 1) + " Liczba hostów: " + Architekt.sieci.get(i) + "\n");
			}
		}
	}

	private class PrzyciskListenerObliczArchitekt implements ActionListener {

		public void actionPerformed(ActionEvent event) {

			int procet = Integer.parseInt(textField_Procent_Wolnych.getText());

			Architekt.Sortuj_liste_hostow();
			Architekt.adres = pobierzLiczbyZeStringa(textField_Adres_Sieci.getText());

			try {

				Architekt.initialize1();
				Architekt.Licz_hosty(Architekt.liczba_hostow_architekt, procet, 0, 0);
			} catch (IndexOutOfBoundsException e) {

			}

		}
	}

	private class PrzyciskListenerZmienArchitekt implements ActionListener {

		public void actionPerformed(ActionEvent event) {

			int hosty = Integer.parseInt(textField_Liczba_Hostow1.getText());
			int numer = Integer.parseInt(textField_Numer_Podsieci.getText()) - 1;
			int procet = Integer.parseInt(textField_Procent_Wolnych.getText());

			Architekt.liczba_hostow_architekt.set(numer, hosty);

			Architekt.Sortuj_liste_hostow();
			Architekt.adres = pobierzLiczbyZeStringa(textField_Adres_Sieci.getText());

			Architekt.frame2.setVisible(false);

			Architekt.sieci.set(numer, Integer.toString(hosty));

			wynikGUI.initialize();
			wynikGUI.frame.setBounds(139, 210, 300, 300);
			Architekt.Sortuj_liste_sieci();
			for (int i = 0; i <= Architekt.sieci.size() - 1; i++) {

				wynikGUI.textArea.append("Sieć " + (i +1)  + " Liczba hostów: " + Architekt.sieci.get(i) + "\n");
			}

			try {
				Architekt.initialize1();

				JLabel lbladres = new JLabel("Po zmaianach:");
				lbladres.setFont(new Font("Tahoma", Font.BOLD, 18));
				lbladres.setBounds(20, Architekt.y + 20, 250, 22);
				Architekt.panel.add(lbladres);
				Architekt.y += 40;

				Architekt.Licz_hosty(Architekt.liczba_hostow_architekt, procet, 0, 0);
			} catch (IndexOutOfBoundsException e) {

			}

		}
	}

	private static List<Integer> pobierzLiczbyZeStringa(String s) {
		List<Integer> l = new ArrayList<Integer>();
		char[] liczby = s.toCharArray();
		for (int i = 0; i < liczby.length; i++) {
			if (Character.isDigit(liczby[i])) {
				String num = "";
				while (i < liczby.length && Character.isDigit(liczby[i])) {
					num += liczby[i++];
				}
				l.add(Integer.parseInt(num));
			}
		}
		return l;
	}

}
