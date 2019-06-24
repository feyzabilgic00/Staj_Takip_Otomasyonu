package Entity;



import java.util.Observable;
import java.util.Observer;

import ObserverPatternDesign.stajGozlemcisi;

public class danisman extends ogrencii implements Observer{
	
private String danisman_id;
private String bolum_id;

public danisman() {
	
	
}


@Override
void cekmek() {
System.out.println("danisman:cekmek()metodu");
}
public danisman(String danisman_id, String bolum_id) {
	
	this.danisman_id = danisman_id;
	this.bolum_id = bolum_id;
}

public String getDanisman_id() {
	return danisman_id;
}

public void setDanisman_id(String danisman_id) {
	this.danisman_id = danisman_id;
}

public String getBolum_id() {
	return bolum_id;
}

public void setBolum_id(String bolum_id) {
	this.bolum_id = bolum_id;
}


@Override
public void update(Observable arg0, Object arg1) {
	// TODO Auto-generated method stub
	
}

@Override
public void gozlemciEkle(stajGozlemcisi gozlemci) {
	// TODO Auto-generated method stub
	
}

@Override
public void gozlemcilereHaberVer() {
	// TODO Auto-generated method stub
	
}
}
