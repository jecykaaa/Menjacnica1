package valute;

import java.util.GregorianCalendar;

public interface MenjacnicaInterfejs {
	public void dodajKursValuteZaOdredjeniDan(String naziv, String skraceniNaziv, double prodajni, double kupovni, double srednji, GregorianCalendar datum);
	public void obrisiKursValuteZaOdredjeniDan(String naziv, String skraceniNaziv, double prodajni, double kupovni, double srednji, GregorianCalendar datum);
	public Valute pronadjiIVratiKursValuteZaOdredjeniDan(GregorianCalendar datum);
}
