package valute;

import java.util.GregorianCalendar;

public class Valute {
	private String naziv;
	private String skraceniNaziv;
	private double prodajniKurs;
	private double kupovniKurs;
	private double srednjiKurs;
	private GregorianCalendar datum;
	
	public GregorianCalendar getDatum() {
		return datum;
	}
	public void setDatum(GregorianCalendar datum) throws Exception {
		if(datum == null) {
			throw new Exception();
		}
		this.datum = datum;
	}
	public String getNaziv() {
		return naziv;
	}
	public void setNaziv(String naziv) throws Exception {
		if(naziv.isEmpty() || naziv == null) {
			throw new Exception();
		}
		this.naziv = naziv;
	}
	public String getSkraceniNaziv() {
		return skraceniNaziv;
	}
	public void setSkraceniNaziv(String skraceniNaziv) throws Exception {
		if(skraceniNaziv.isEmpty() || skraceniNaziv == null) {
			throw new Exception();
		}
		this.skraceniNaziv = skraceniNaziv;
	}
	public double getProdajniKurs() {
		return prodajniKurs;
	}
	public void setProdajniKurs(double prodajniKurs) throws Exception {
		if(prodajniKurs <= 0) {
			throw new Exception();
		}
		this.prodajniKurs = prodajniKurs;
	}
	public double getKupovniKurs() {
		return kupovniKurs;
	}
	public void setKupovniKurs(double kupovniKurs) throws Exception {
		if(kupovniKurs <= 0) {
			throw new Exception();
		}
		this.kupovniKurs = kupovniKurs;
	}
	public double getSrednjiKurs() {
		return srednjiKurs;
	}
	public void setSrednjiKurs(double srednjiKurs) throws Exception {
		if(srednjiKurs <= 0) {
			throw new Exception();
		}
		this.srednjiKurs = srednjiKurs;
	}
	
	

	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((datum == null) ? 0 : datum.hashCode());
		long temp;
		temp = Double.doubleToLongBits(kupovniKurs);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + ((naziv == null) ? 0 : naziv.hashCode());
		temp = Double.doubleToLongBits(prodajniKurs);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + ((skraceniNaziv == null) ? 0 : skraceniNaziv.hashCode());
		temp = Double.doubleToLongBits(srednjiKurs);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		return result;
	}
	

	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (!(obj instanceof Valute))
			return false;
		Valute other = (Valute) obj;
		if (datum == null) {
			if (other.datum != null)
				return false;
		} else if (!datum.equals(other.datum))
			return false;
		if (Double.doubleToLongBits(kupovniKurs) != Double.doubleToLongBits(other.kupovniKurs))
			return false;
		if (naziv == null) {
			if (other.naziv != null)
				return false;
		} else if (!naziv.equals(other.naziv))
			return false;
		if (Double.doubleToLongBits(prodajniKurs) != Double.doubleToLongBits(other.prodajniKurs))
			return false;
		if (skraceniNaziv == null) {
			if (other.skraceniNaziv != null)
				return false;
		} else if (!skraceniNaziv.equals(other.skraceniNaziv))
			return false;
		if (Double.doubleToLongBits(srednjiKurs) != Double.doubleToLongBits(other.srednjiKurs))
			return false;
		return true;
	}
	

	public String toString() {
		return "Valute [naziv=" + naziv + ", skraceniNaziv=" + skraceniNaziv + ", prodajniKurs=" + prodajniKurs
				+ ", kupovniKurs=" + kupovniKurs + ", srednjiKurs=" + srednjiKurs + ", datum=" + datum + "]";
	}
	
	
}
