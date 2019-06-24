package Entity;
import java.util.List;


public class ogrencii extends bolumm{
private String ogrenci_no;
private String adi;
private String soyadi;
private String bolum;
private String program;
private String egtm_ogrtm_yýl;
private String staj_durumu;
private String stajId;
private String stajDurumu;


public ogrencii() {
	
}

public ogrencii(String ogrenci_no, String adi, String soyadi,String bolum,String program,
		String egtm_ogrtm_yýl,String staj_durumu,String stajId) {

	this.ogrenci_no = ogrenci_no;
	this.adi = adi;
	this.soyadi = soyadi;
	this.bolum=bolum;
	this.program = program;
	this.egtm_ogrtm_yýl = egtm_ogrtm_yýl;
	this.staj_durumu=staj_durumu;
	this.stajId=stajId;
}

public String getOgrenci_no() {
	return ogrenci_no;
}

public void setOgrenci_no(String ogrenci_no) {
	this.ogrenci_no = ogrenci_no;
}

public String getAdi() {
	return adi;
}

public void setAdi(String adi) {
	this.adi = adi;
}

public String getSoyadi() {
	return soyadi;
}

public void setSoyadi(String soyadi) {
	this.soyadi = soyadi;
}


public String getBolum() {
	return bolum;
}

public void setBolum(String bolum) {
	this.bolum = bolum;
}

public String getProgram() {
	return program;
}

public void setProgram(String program) {
	this.program = program;
}

public String getEgtm_ogrtm_yýl() {
	return egtm_ogrtm_yýl;
}

public void setEgtm_ogrtm_yýl(String egtm_ogrtm_yýl) {
	this.egtm_ogrtm_yýl = egtm_ogrtm_yýl;
}

public String getStaj_durumu() {
	return staj_durumu;
}

public void setStaj_durumu(String staj_durumu) {
	this.staj_durumu = staj_durumu;
}


public String getStajId() {
	return stajId;
}

public void setStajId(String stajId) {
	this.stajId = stajId;
}

@Override
void cekmek() {
	// TODO Auto-generated method stub
	
}
@Override
public void guncelle(String stajDurumu) {
	this.stajDurumu=stajDurumu;
	
}
public void bildirim(String mesaj) {
	
	System.out.println(mesaj+"");
}


}
