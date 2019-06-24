package Entity;

import java.util.List;

import ObserverPatternDesign.stajGozlemcisi;

public abstract class bolumm implements Cloneable, stajGozlemcisi {

	protected String bolum_id;
	private String bolum_adi;
	// private List<program>program;
	private List<komisyon_uyeleri> komisyon_uyeleri;
	private String program;

	abstract void cekmek();

	public bolumm() {
	
	}

	public bolumm(String bolum_id, String bolum_adi, String program, List<Entity.komisyon_uyeleri> komisyon_uyeleri) {
		this.bolum_id = bolum_id;
		this.bolum_adi = bolum_adi;

		this.program = program;
		this.komisyon_uyeleri = komisyon_uyeleri;
	}

	public String getBolum_id() {
		return bolum_id;
	}

	public void setBolum_id(String bolum_id) {
		this.bolum_id = bolum_id;
	}

	public String getBolum_adi() {
		return bolum_adi;
	}

	public void setBolum_adi(String bolum_adi) {
		this.bolum_adi = bolum_adi;
	}

	public String getProgram() {
		return program;
	}

	public void setProgram(String program) {
		this.program = program;
	}

	public List<komisyon_uyeleri> getKomisyon_uyeleri() {
		return komisyon_uyeleri;
	}

	public void setKomisyon_uyeleri(List<komisyon_uyeleri> komisyon_uyeleri) {
		this.komisyon_uyeleri = komisyon_uyeleri;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((bolum_id == null) ? 0 : bolum_id.hashCode());
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
		bolumm other = (bolumm) obj;
		if (bolum_id == null) {
			if (other.bolum_id != null)
				return false;
		} else if (!bolum_id.equals(other.bolum_id))
			return false;
		return true;
	}

	public Object clone() {
		Object clone = null;
		try {
			clone = super.clone();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return clone();
	}

	public void gozlemciEkle(stajGozlemcisi gozlemci) {
		// TODO Auto-generated method stub

	}

	public void gozlemcilereHaberVer() {
		// TODO Auto-generated method stub

	}

	public void guncelle(String stajDurumu) {
		// TODO Auto-generated method stub

	}
}
