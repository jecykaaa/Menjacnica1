package valute;

import java.util.GregorianCalendar;

public interface MenjacnicaInterfejs {
	public void dodajKursValuteZaOdredjeniDan(double prodajni, double kupovni, double srednji, GregorianCalendar datum);
	public void obrisiKursValuteZaOdredjeniDan(double prodajni, double kupovni, double srednji, GregorianCalendar datum);
	public double pronadjiIVratiKursValuteZaOdredjeniDan(double prodajni, double kupovni, double srednji, GregorianCalendar datum);
}
