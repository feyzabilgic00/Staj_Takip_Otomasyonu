package DecoratorPatternDesign;

public class komisyon_uye extends bolumDecorator{

	public komisyon_uye(bolum newbolum) {
		super(newbolum);
		
	}
	
	public String bolumGorev() {
		return super.bolumGorev()+"komisyon üyelerinin görevi stajý onaylar";
	}
    public String bolumMaasi() {
		String maas=null;
		return super.bolumMaasi()+maas;
    		
    }
}
