package Entity;
import java.util.Hashtable;
public class bolumCache {
	
	public static Hashtable<String,bolumm> bolummMap = new Hashtable<String,bolumm>();
	  
	public static bolumm getBolumm(String bolumId){
	        bolumm cachedBolumm = bolummMap.get(bolumId);
	        
	        return  (bolumm) cachedBolumm.clone();
	    }
	   public static void bellekYukle(){
	        
	        danisman d = new danisman();
	        d.setBolum_id("bolum_id");
	        bolummMap.put(d.getBolum_id(),d);
	        
	        program p= new program();
	        p.setBolum_id("bolum_id");
	        bolummMap.put(p.getBolum_id(), p);
	        
	        komisyon_uyeleri k = new komisyon_uyeleri();
	        k.setBolum_id("bolum_id");
	        bolummMap.put(k.getBolum_id(), k);
	        
	        
	    }
}
