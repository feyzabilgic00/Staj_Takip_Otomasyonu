package DecoratorPatternDesign;

public class danisman extends bolumDecorator {

	public danisman(bolum newbolum) {
		super(newbolum);
		
	}
	public String bolumGorev() {
		return super.bolumGorev()+"dan��man ��rencinin staj i�lemlerini yapar";
	}
    public String bolumMaasi() {
		String maas=null;
		return super.bolumMaasi()+maas;
    		
    }
}
