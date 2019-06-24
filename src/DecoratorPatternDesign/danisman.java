package DecoratorPatternDesign;

public class danisman extends bolumDecorator {

	public danisman(bolum newbolum) {
		super(newbolum);
		
	}
	public String bolumGorev() {
		return super.bolumGorev()+"danýþman öðrencinin staj iþlemlerini yapar";
	}
    public String bolumMaasi() {
		String maas=null;
		return super.bolumMaasi()+maas;
    		
    }
}
