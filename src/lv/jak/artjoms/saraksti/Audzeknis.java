package lv.jak.artjoms.saraksti;

public class Audzeknis {
 
	public String vards;
	public String uzvards;
	public int kurs;

	public Audzeknis() {}
	public  Audzeknis(String vards,String uzvards, int kurs) {
		setVards(vards);
		setUzvards(uzvards);
		setKurs(kurs);
		
		
	}
	public String getVards() {
		return vards;
	}
	public void setVards(String vards) {
		this.vards = vards;
	}
	public String getUzvards() {
		return uzvards;
	}
	public void setUzvards(String uzvards) {
		this.uzvards = uzvards;
	}
	public int getKurs() {
		return kurs;
	}
	public void setKurs(int kurs) {
		this.kurs = kurs;
	}
	
		
	}



