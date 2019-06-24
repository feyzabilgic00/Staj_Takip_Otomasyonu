package DecoratorPatternDesign;

public class komisyon_uye extends bolumDecorator{

	public komisyon_uye(bolum newbolum) {
		super(newbolum);
		
	}
	
	public String bolumGorev() {
		return super.bolumGorev()+"komisyon �yelerinin g�revi staj� onaylar";
	}
    public String bolumMaasi() {
		String maas=null;
		return super.bolumMaasi()+maas;
    		
    }
}
