package kalkulator_ip;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Architekt {

	static List<Integer> liczba_hostow_architekt = new ArrayList<Integer>(100);
	static List<Integer> adres = new ArrayList<Integer>(4);
	public static List<String> sieci = new ArrayList<>(20);

	static int y = 40;
	static JFrame frame2;
	static JPanel panel = new JPanel();
	public static Color kolor = Color.GRAY;

	public static void initialize1() {

		frame2 = new JFrame();
		frame2.setBounds(0, 0, 950, 400);
		frame2.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
		frame2.getContentPane().add(panel, BorderLayout.CENTER);
		frame2.setLocationRelativeTo(null);
		frame2.setResizable(false);
		panel.setLayout(null);
		frame2.setVisible(true);
		panel.setBackground(kolor);

		JLabel lbladres = new JLabel(
				"Pobrany adres: " + adres.get(0) + "." + adres.get(1) + "." + adres.get(2) + "." + adres.get(3));
		lbladres.setFont(new Font("Tahoma", Font.BOLD, 18));
		lbladres.setBounds(20, 10, 250, 22);
		panel.add(lbladres);

	}

	public static void Sortuj_liste_hostow() {

		Collections.sort(liczba_hostow_architekt);
		Collections.reverse(liczba_hostow_architekt);

	}
	
	public static void Sortuj_liste_sieci() {

		Collections.sort(sieci);
		Collections.reverse(sieci);

	}

	static void Licz_hosty(List<Integer> liczba_hostow_wymagana, int procet, int siec, int i) {

		int licznik = i;
		int liczba_sieci = liczba_hostow_wymagana.size();
		int liczba_hostow = (int) liczba_hostow_architekt.get(i);
		int procet_wolnych = procet / 100;
		int liczba_hostow_wym = (liczba_hostow * (100 + procet_wolnych)) / 100;
		int adres_sieci = 0;
		int adres_rozgloszeniowy = 0;
		int pierwszy = 0;
		int ostatni = 0;
		int następna_siec = siec;
		// String maska = "255.255.255.0";

		if (liczba_hostow_wym <= 2 && następna_siec < 255 && liczba_sieci >= 0) {

			adres_sieci += następna_siec;
			pierwszy = adres_sieci + 1;
			ostatni = adres_sieci + 2;
			adres_rozgloszeniowy = ostatni + 1;
			następna_siec = adres_rozgloszeniowy + 1;

//			 System.out.println("Maska sieci: 255.255.255.252");
//			 System.out.println("Adres sieci: " + adres_sieci);
//			 System.out.println("Pierwszy adres hosta: " + pierwszy);
//			 System.out.println("Ostatni adres hosta: " + ostatni);
//			 System.out.println("Adres rozgłoszeniowy: " +
//			 adres_rozgloszeniowy);

			JLabel lbladres1 = new JLabel("Maska: 255.255.255.252, " + "Adres sieci: ." + adres_sieci + ", Pierwszy: ."
					+ pierwszy + ", Ostatni: ." + ostatni + ", Rozgłoszeniowy: ." + adres_rozgloszeniowy + ", Liczba hostów: " + liczba_hostow_wym);
			lbladres1.setFont(new Font("Tahoma", Font.BOLD, 14));
			lbladres1.setBounds(20, y, 850, 25);
			panel.add(lbladres1);
			y += 20;

			liczba_sieci--;

			Licz_hosty(liczba_hostow_wymagana, procet, następna_siec, ++licznik);

		}

		else if (liczba_hostow_wym <= 6 && następna_siec < 255 && liczba_sieci >= 0) {

			adres_sieci += następna_siec;
			pierwszy = adres_sieci + 1;
			ostatni = adres_sieci + 6;
			adres_rozgloszeniowy = ostatni + 1;
			następna_siec = adres_rozgloszeniowy + 1;

			// System.out.println("Maska sieci: 255.255.255.248");
			// System.out.println("Adres sieci: " + adres_sieci);
			// System.out.println("Pierwszy adres hosta: " + pierwszy);
			// System.out.println("Ostatni adres hosta: " + ostatni);
			// System.out.println("Adres rozgłoszeniowy: " +
			// adres_rozgloszeniowy);

			JLabel lbladres2 = new JLabel(
					"Maska sieci: 255.255.255.248, " + "Adres sieci: ." + adres_sieci + ", Pierwszy: ." + pierwszy
							+ ", Ostatni: ." + ostatni + ", Rozgłoszeniowy: ." + adres_rozgloszeniowy + ", Liczba hostów: " + liczba_hostow_wym);
			lbladres2.setFont(new Font("Tahoma", Font.BOLD, 14));
			lbladres2.setBounds(20, y, 850, 25);
			panel.add(lbladres2);
			y += 20;

			liczba_sieci--;

			Licz_hosty(liczba_hostow_wymagana, procet, następna_siec, ++licznik);

		}

		else if (liczba_hostow_wym <= 14 && następna_siec < 255 && liczba_sieci >= 0) {

			adres_sieci += następna_siec;
			pierwszy = adres_sieci + 1;
			ostatni = adres_sieci + 14;
			adres_rozgloszeniowy = ostatni + 1;
			następna_siec = adres_rozgloszeniowy + 1;

			// System.out.println("Maska sieci: 255.255.255.240");
			// System.out.println("Adres sieci: " + adres_sieci);
			// System.out.println("Pierwszy adres hosta: " + pierwszy);
			// System.out.println("Ostatni adres hosta: " + ostatni);
			// System.out.println("Adres rozgłoszeniowy: " +
			// adres_rozgloszeniowy);

			JLabel lbladres3 = new JLabel(
					"Maska sieci: 255.255.255.240, " + "Adres sieci: ." + adres_sieci + ", Pierwszy: ." + pierwszy
							+ ", Ostatni: ." + ostatni + ", Rozgłoszeniowy: ." + adres_rozgloszeniowy + ", Liczba hostów: " + liczba_hostow_wym);
			lbladres3.setFont(new Font("Tahoma", Font.BOLD, 14));
			lbladres3.setBounds(20, y, 850, 25);
			panel.add(lbladres3);
			y += 20;

			liczba_sieci--;

			Licz_hosty(liczba_hostow_wymagana, procet, następna_siec, ++licznik);

		}

		else if (liczba_hostow_wym <= 30 && następna_siec < 255 && liczba_sieci >= 0) {

			adres_sieci += następna_siec;
			pierwszy = adres_sieci + 1;
			ostatni = adres_sieci + 30;
			adres_rozgloszeniowy = ostatni + 1;
			następna_siec = adres_rozgloszeniowy + 1;

			// System.out.println("Maska sieci: 255.255.255.224");
			// System.out.println("Adres sieci: " + adres_sieci);
			// System.out.println("Pierwszy adres hosta: " + pierwszy);
			// System.out.println("Ostatni adres hosta: " + ostatni);
			// System.out.println("Adres rozgłoszeniowy: " +
			// adres_rozgloszeniowy);

			JLabel lbladres4 = new JLabel(
					"Maska sieci: 255.255.255.224, " + "Adres sieci: ." + adres_sieci + ", Pierwszy: ." + pierwszy
							+ ", Ostatni: ." + ostatni + ", Rozgłoszeniowy: ." + adres_rozgloszeniowy + ", Liczba hostów: " + liczba_hostow_wym);
			lbladres4.setFont(new Font("Tahoma", Font.BOLD, 14));
			lbladres4.setBounds(20, y, 850, 25);
			panel.add(lbladres4);
			y += 20;

			liczba_sieci--;

			Licz_hosty(liczba_hostow_wymagana, procet, następna_siec, ++licznik);
		}

		else if (liczba_hostow_wym <= 62 && następna_siec < 255 && liczba_sieci >= 0) {

			adres_sieci += następna_siec;
			pierwszy = adres_sieci + 1;
			ostatni = adres_sieci + 62;
			adres_rozgloszeniowy = ostatni + 1;
			następna_siec = adres_rozgloszeniowy + 1;

			// System.out.println("Maska sieci: 255.255.255.192");
			// System.out.println("Adres sieci: " + adres_sieci);
			// System.out.println("Pierwszy adres hosta: " + pierwszy);
			// System.out.println("Ostatni adres hosta: " + ostatni);
			// System.out.println("Adres rozgłoszeniowy: " +
			// adres_rozgloszeniowy);

			JLabel lbladres5 = new JLabel(
					"Maska sieci: 255.255.255.192, " + "Adres sieci: ." + adres_sieci + ",   Pierwszy: ." + pierwszy
							+ ",   Ostatni: ." + ostatni + ", Rozgłoszeniowy: ." + adres_rozgloszeniowy + ", Liczba hostów: " + liczba_hostow_wym);
			lbladres5.setFont(new Font("Tahoma", Font.BOLD, 14));
			lbladres5.setBounds(20, y, 850, 25);
			panel.add(lbladres5);
			y += 20;

			liczba_sieci--;

			// System.out.println("liczba sieci: " + liczba_sieci);
			Licz_hosty(liczba_hostow_wymagana, procet, następna_siec, ++licznik);

		}

		else if (liczba_hostow_wym <= 126 && następna_siec < 255 && liczba_sieci >= 0) {

			adres_sieci += następna_siec;
			pierwszy = adres_sieci + 1;
			ostatni = adres_sieci + 126;
			adres_rozgloszeniowy = ostatni + 1;
			następna_siec = adres_rozgloszeniowy + 1;

			// System.out.println("Maska sieci: 255.255.255.128");
			// System.out.println("Adres sieci: " + adres_sieci);
			// System.out.println("Pierwszy adres hosta: " + pierwszy);
			// System.out.println("Ostatni adres hosta: " + ostatni);
			// System.out.println("Adres rozgłoszeniowy: " +
			// adres_rozgloszeniowy);

			JLabel lbladres6 = new JLabel(
					"Maska sieci: 255.255.255.128, " + "Adres sieci: ." + adres_sieci + ",     Pierwszy: ." + pierwszy
							+ ",      Ostatni: ." + ostatni + ", Rozgłoszeniowy: ." + adres_rozgloszeniowy + ", Liczba hostów: " + liczba_hostow_wym);
			lbladres6.setFont(new Font("Tahoma", Font.BOLD, 14));
			lbladres6.setBounds(20, y, 850, 25);
			panel.add(lbladres6);
			y += 20;

			liczba_sieci--;

			Licz_hosty(liczba_hostow_wymagana, procet, następna_siec, ++licznik);

		}

		else if (liczba_hostow_wym <= 254 && następna_siec < 255 && liczba_sieci >= 0) {

			adres_sieci += następna_siec;
			pierwszy = adres_sieci + 1;
			ostatni = adres_sieci + 254;
			adres_rozgloszeniowy = ostatni + 1;
			następna_siec = adres_rozgloszeniowy + 1;

			// System.out.println("Maska sieci: 255.255.255.0");
			// System.out.println("Adres sieci: " + adres_sieci);
			// System.out.println("Pierwszy adres hosta: " + pierwszy);
			// System.out.println("Ostatni adres hosta: " + ostatni);
			// System.out.println("Adres rozgłoszeniowy: " +
			// adres_rozgloszeniowy);

			JLabel lbladres7 = new JLabel(
					"Maska sieci: 255.255.255.0, " + "Adres sieci: ." + adres_sieci + ", Pierwszy: ." + pierwszy
							+ ", Ostatni: ." + ostatni + ", Rozgłoszeniowy: ." + adres_rozgloszeniowy + ", Liczba hostów: " + liczba_hostow_wym);
			lbladres7.setFont(new Font("Tahoma", Font.BOLD, 14));
			lbladres7.setBounds(20, y, 850, 25);
			panel.add(lbladres7);
			y += 20;

			liczba_sieci--;

			Licz_hosty(liczba_hostow_wymagana, procet, następna_siec, ++licznik);

		}

	}

}
