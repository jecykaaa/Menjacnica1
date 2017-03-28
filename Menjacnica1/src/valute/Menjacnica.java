package valute;

import java.util.GregorianCalendar;
import java.util.LinkedList;

public class Menjacnica implements MenjacnicaInterfejs {

	LinkedList<Valute> valute = new LinkedList<>();
	
	public void dodajKursValuteZaOdredjeniDan(String naziv, String skraceniNaziv, double prodajni, double kupovni, double srednji, GregorianCalendar datum) {
		Valute valuta;
		try {
			valuta = new Valute(naziv, skraceniNaziv, prodajni, kupovni, srednji, datum);
			valute.add(valuta);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}


	public void obrisiKursValuteZaOdredjeniDan(String naziv, String skraceniNaziv, double prodajni, double kupovni, double srednji, GregorianCalendar datum) {
		Valute valuta;
		try {
			valuta = new Valute(naziv, skraceniNaziv, prodajni, kupovni, srednji, datum);
			for (int i = 0; i < valute.size(); i++) {
				if(valuta.equals(valute.get(i)))
					valute.remove(i);
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	
	public Valute pronadjiIVratiKursValuteZaOdredjeniDan(GregorianCalendar datum) {
		try {
			for (int i = 0; i < valute.size(); i++) {
				if(valute.get(i).getDatum().compareTo(datum) == 0)
					return valute.get(i);
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

}
