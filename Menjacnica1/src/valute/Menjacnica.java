package valute;

import java.util.GregorianCalendar;
import java.util.LinkedList;

public class Menjacnica implements MenjacnicaInterfejs {
	LinkedList<Valute> valute = new LinkedList<>();
	
	public void dodajKursValuteZaOdredjeniDan(String naziv, String skraceniNaziv, double prodajni, double kupovni, double srednji, GregorianCalendar datum) {
		Valute valuta = new Valute();
		try {
			valuta.setNaziv(naziv);
			valuta.setSkraceniNaziv(skraceniNaziv);
			valuta.setProdajniKurs(prodajni);
			valuta.setKupovniKurs(kupovni);
			valuta.setProdajniKurs(prodajni);
			valuta.setDatum(datum);
			valute.add(valuta);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}


	public void obrisiKursValuteZaOdredjeniDan(String naziv, String skraceniNaziv, double prodajni, double kupovni, double srednji, GregorianCalendar datum) {
		Valute valuta = new Valute();
		try {
			valuta.setNaziv(naziv);
			valuta.setSkraceniNaziv(skraceniNaziv);
			valuta.setProdajniKurs(prodajni);
			valuta.setKupovniKurs(kupovni);
			valuta.setProdajniKurs(prodajni);
			valuta.setDatum(datum);
			
			for (int i = 0; i < valute.size(); i++) {
				if(valuta.equals(valute.get(i)))
					valute.remove(i);
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	
	public Valute pronadjiIVratiKursValuteZaOdredjeniDan(GregorianCalendar datum) {
		Valute valuta = new Valute();
		try {
			for (int i = 0; i < valute.size(); i++) {
				if(valute.get(i).getDatum() == datum)
					return valute.get(i);
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

}
