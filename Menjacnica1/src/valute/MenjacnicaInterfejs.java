package valute;

import java.util.GregorianCalendar;

public interface MenjacnicaInterfejs {
	public void dodajKursValuteZaOdredjeniDan(double kurs, GregorianCalendar datum);
	public void obrisiKursValuteZaOdredjeniDan(double kurs, GregorianCalendar datum);
	public double pronadjiIVratiKursValuteZaOdredjeniDan(double kurs, GregorianCalendar datum);
}
