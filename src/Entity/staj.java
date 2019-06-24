package Entity;

public class staj {

	private String stajId;
	private String stajBaslamaTarihi;
	private String stajBitisTarihi;
	private String kabulEdilenGunSayýsý;
	private String stajYeri;
	private String stajAdresi;
	private String ogrenci_no;
	private String komisyon_id;
	
	public staj() {
		
		
	}

	public staj(String stajId, String stajBaslamaTarihi, String stajBitisTarihi, String kabulEdilenGunSayýsý,
			String stajYeri, String stajAdresi, String ogrenci_no, String komisyon_id) {
		
		this.stajId = stajId;
		this.stajBaslamaTarihi = stajBaslamaTarihi;
		this.stajBitisTarihi = stajBitisTarihi;
		this.kabulEdilenGunSayýsý = kabulEdilenGunSayýsý;
		this.stajYeri = stajYeri;
		this.stajAdresi = stajAdresi;
		this.ogrenci_no = ogrenci_no;
		this.komisyon_id = komisyon_id;
	}

	public String getStajId() {
		return stajId;
	}

	public void setStajId(String stajId) {
		this.stajId = stajId;
	}

	public String getStajBaslamaTarihi() {
		return stajBaslamaTarihi;
	}

	public void setStajBaslamaTarihi(String stajBaslamaTarihi) {
		this.stajBaslamaTarihi = stajBaslamaTarihi;
	}

	public String getStajBitisTarihi() {
		return stajBitisTarihi;
	}

	public void setStajBitisTarihi(String stajBitisTarihi) {
		this.stajBitisTarihi = stajBitisTarihi;
	}

	public String getKabulEdilenGunSayýsý() {
		return kabulEdilenGunSayýsý;
	}

	public void setKabulEdilenGunSayýsý(String kabulEdilenGunSayýsý) {
		this.kabulEdilenGunSayýsý = kabulEdilenGunSayýsý;
	}

	public String getStajYeri() {
		return stajYeri;
	}

	public void setStajYeri(String stajYeri) {
		this.stajYeri = stajYeri;
	}

	public String getStajAdresi() {
		return stajAdresi;
	}

	public void setStajAdresi(String stajAdresi) {
		this.stajAdresi = stajAdresi;
	}

	public String getOgrenci_no() {
		return ogrenci_no;
	}

	public void setOgrenci_no(String ogrenci_no) {
		this.ogrenci_no = ogrenci_no;
	}

	public String getKomisyon_id() {
		return komisyon_id;
	}

	public void setKomisyon_id(String komisyon_id) {
		this.komisyon_id = komisyon_id;
	}


}