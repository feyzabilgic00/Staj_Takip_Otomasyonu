package DecoratorPatternDesign;

public abstract class bolumDecorator implements bolum{
	
	private bolum newbolum;
	
	public bolumDecorator(bolum newbolum) {
		
		this.newbolum=newbolum;
	}

	@Override
	public String bolumGorev() {
	
		return newbolum.bolumGorev();
	}

	@Override
	public String bolumMaasi() {
		
		return newbolum.bolumMaasi();
	}

}
