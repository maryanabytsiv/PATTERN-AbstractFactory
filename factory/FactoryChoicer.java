package factory;

public class FactoryChoicer {

    public static final Integer COLOR_FACTORY = 1;
	public static final Integer CLOTHES_FACTORY = 2;

	public static AbstractFactory getFactory(Integer number){
        if (number == COLOR_FACTORY) {
            return new ColorFactory();
		}
		if (number == CLOTHES_FACTORY){
			return new ClothesFactory();
		}
		return null;

	}

}
