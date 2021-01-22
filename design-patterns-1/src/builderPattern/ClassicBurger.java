package builderPattern;

public class ClassicBurger extends Burger {

	@Override
	public float price() {
		return 25.0f;
	}
	
	@Override
	public String name() {
		return "Classic Burger";
	}

}
