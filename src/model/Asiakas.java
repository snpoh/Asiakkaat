package model;

public class Asiakas {
	private int asiakasid;
	private String enimi, snimi, puhelin, sposti;
	public Asiakas() {
		super();
	}
	public Asiakas(int asiakasid, String enimi, String snimi, String puhelin, String sposti) {
		super();
		this.asiakasid = asiakasid;
		this.enimi = enimi;
		this.snimi = snimi;
		this.puhelin = puhelin;
		this.sposti = sposti;
		
	}
	public int getAsiakasid() {
		return asiakasid;
	}
	public void setAsiakasid(int asiakasid) {
		this.asiakasid = asiakasid;
	}
	public String getEnimi() {
		return enimi;
	}
	public void setEnimi(String enimi) {
		this.enimi = enimi;
	}
	public String getSnimi() {
		return snimi;
	}
	public void setSnimi(String snimi) {
		this.snimi = snimi;
	}
	public String getPuhelin() {
		return puhelin;
	}
	public void setPuhelin(String puhelin) {
		this.puhelin = puhelin;
	}
	public String getSposti() {
		return sposti;
	}
	public void setSposti(String sposti) {
		this.sposti = sposti;
	}
	
	@Override
	public String toString() {
		return "Asiakas [asikasid=" + asiakasid + "enimi=" + enimi + ", snimi=" + snimi + ", puhelin=" + puhelin + ", sposti=" + sposti
				+ "]";
	}
	
	

}
