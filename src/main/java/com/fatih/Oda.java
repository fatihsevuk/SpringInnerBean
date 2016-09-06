package com.fatih;

public class Oda {
	
	private String tip;
	private Klima klimaTipi;
	
	public String getTip() {
		return tip;
	}
	
	public void setTip(String tip) {
		this.tip = tip;
	}
	
	public Klima getKlimaTipi() {
		return klimaTipi;
	}

	public void setKlimaTipi(Klima klimaTipi) {
		this.klimaTipi = klimaTipi;
	}
	
	@Override
	public String toString() {
		return "Oda [tip=" + tip + ", klimaTipi=" + klimaTipi + "]";
	}
	
	
	

}
