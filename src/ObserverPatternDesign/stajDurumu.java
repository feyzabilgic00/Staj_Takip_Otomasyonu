package ObserverPatternDesign;
import java.util.ArrayList;
import java.util.List;
public abstract class stajDurumu implements Observer {
	
	private final List<stajGozlemcisi> gozlemciListesi=new ArrayList<stajGozlemcisi>();
	private String stajDurumu;
	
	@Override
	public void gozlemcilereHaberVer(){
    System.out.println("Staj bilgileriniz güncellenmiþtir");
}
	public void gozlemciEkle(stajGozlemcisi gozlemci) {
		gozlemciListesi.add(gozlemci);
		
	}
	public void stajDurumuDegistir(final String stajDurumu) {
		this.stajDurumu=stajDurumu;
		gozlemcilereHaberVer();
		
	}
}