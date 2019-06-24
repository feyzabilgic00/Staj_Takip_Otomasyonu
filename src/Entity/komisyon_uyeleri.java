package Entity;

public class komisyon_uyeleri extends bolumm{
private String komisyon_id;
private String komisyon_baskani;
private String uye1;
private String uye2;


public komisyon_uyeleri() {

}

@Override
 void cekmek() {
System.out.println("komisyon_uyeleri:cekmek()metodu");
}

public komisyon_uyeleri(String komisyon_id, String komisyon_baskani, String uye1, String uye2) {
	this.komisyon_id = komisyon_id;
	this.komisyon_baskani = komisyon_baskani;
	this.uye1 = uye1;
	this.uye2 = uye2;
    
	
}

public String getKomisyon_id() {
	return komisyon_id;
}

public void setKomisyon_id(String komisyon_id) {
	this.komisyon_id = komisyon_id;
}

public String getKomisyon_baskani() {
	return komisyon_baskani;
}

public void setKomisyon_baskani(String komisyon_baskani) {
	this.komisyon_baskani = komisyon_baskani;
}

public String getUye1() {
	return uye1;
}

public void setUye1(String uye1) {
	this.uye1 = uye1;
}

public String getUye2() {
	return uye2;
}

public void setUye2(String uye2) {
	this.uye2 = uye2;
}


@Override
public int hashCode() {
	final int prime = 31;
	int result = 1;
	result = prime * result + ((komisyon_id == null) ? 0 : komisyon_id.hashCode());
	return result;
}

@Override
public boolean equals(Object obj) {
	if (this == obj)
		return true;
	if (obj == null)
		return false;
	if (getClass() != obj.getClass())
		return false;
	komisyon_uyeleri other = (komisyon_uyeleri) obj;
	if (komisyon_id == null) {
		if (other.komisyon_id != null)
			return false;
	} else if (!komisyon_id.equals(other.komisyon_id))
		return false;
	return true;
}


}
