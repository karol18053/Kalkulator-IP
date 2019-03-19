package kalkulator_ip;

import java.util.ArrayList;
import java.util.List;

public class Pelne {

	public List<Integer> siec = new ArrayList<Integer>(4);
	public ArrayList<Integer> maskaPodsieci = new ArrayList<Integer>();

	public int hosty;
	public List<String> wynik = new ArrayList<>();

	public void Licz_hosty(List<Integer> siec) {

		maskaPodsieci.add(0);
		maskaPodsieci.add(0);
		maskaPodsieci.add(0);
		maskaPodsieci.add(0);
		maskaPodsieci.add(0);
		maskaPodsieci.add(0);
		maskaPodsieci.add(0);
		maskaPodsieci.add(0);
		maskaPodsieci.add(0);
		maskaPodsieci.add(0);
		maskaPodsieci.add(0);
		maskaPodsieci.add(0);
		maskaPodsieci.add(0);
		maskaPodsieci.add(0);
		maskaPodsieci.add(0);
		maskaPodsieci.add(0);
		maskaPodsieci.add(65533);
		maskaPodsieci.add(32765);
		maskaPodsieci.add(16381);
		maskaPodsieci.add(8179);
		maskaPodsieci.add(4093);
		maskaPodsieci.add(2045);
		maskaPodsieci.add(1021);
		maskaPodsieci.add(509);
		maskaPodsieci.add(253);
		maskaPodsieci.add(125);
		maskaPodsieci.add(61);
		maskaPodsieci.add(29);
		maskaPodsieci.add(13);
		maskaPodsieci.add(5);
		maskaPodsieci.add(1);

		int liczbaHostow = hosty;
		int adres_sieci = 0;

		adres_sieci = sprawdzAdres(siec, hosty);

		for (int i = 24; i < 31; i++) {

			int maska = (int) maskaPodsieci.get(i);

			if (liczbaHostow >= maska && adres_sieci <= 255 && liczbaHostow <= 255) {

				liczbaHostow = liczbaHostow - maska;

				wynik.add("Adres sieci: " + adres_sieci + " Maska: /" + i + " Adres rozgłoszeniowy: "
						+ (adres_sieci + maska + 2) + " Pierwszy: " + (adres_sieci + 1) + " Ostatni: "
						+ (adres_sieci + maska) + " Liczba hostów: " + maska);

				adres_sieci += maska + 3;
				i--;

			}
		}

	}

	public int sprawdzAdres(List<Integer> siec, int hosty) {

		maskaPodsieci.add(0);
		maskaPodsieci.add(0);
		maskaPodsieci.add(0);
		maskaPodsieci.add(0);
		maskaPodsieci.add(0);
		maskaPodsieci.add(0);
		maskaPodsieci.add(0);
		maskaPodsieci.add(0);
		maskaPodsieci.add(0);
		maskaPodsieci.add(0);
		maskaPodsieci.add(0);
		maskaPodsieci.add(0);
		maskaPodsieci.add(0);
		maskaPodsieci.add(0);
		maskaPodsieci.add(0);
		maskaPodsieci.add(0);
		maskaPodsieci.add(65533);
		maskaPodsieci.add(32765);
		maskaPodsieci.add(16381);
		maskaPodsieci.add(8179);
		maskaPodsieci.add(4093);
		maskaPodsieci.add(2045);
		maskaPodsieci.add(1021);
		maskaPodsieci.add(509);
		maskaPodsieci.add(253);
		maskaPodsieci.add(125);
		maskaPodsieci.add(61);
		maskaPodsieci.add(29);
		maskaPodsieci.add(13);
		maskaPodsieci.add(5);
		maskaPodsieci.add(1);

		int adres = 0;

		int liczbaHostow = hosty;

		if (siec.get(3) == 0 && hosty <= 255) {
			adres = 0;
			return adres;
		}

		if (siec.get(3) > 0 && hosty <= 255) {
			for (int i = 24; i < 31; i++) {
				int maska = (int) maskaPodsieci.get(i);

				if (liczbaHostow >= maska) {
					liczbaHostow = liczbaHostow - maska;

					adres = maska + 3;
					i--;
					return adres;
				}

			}

		}

		return adres;
	}

}
