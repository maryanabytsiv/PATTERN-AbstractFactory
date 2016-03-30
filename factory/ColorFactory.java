package factory;

import entity2.Green;
import entity2.Red;
import entity2.Yellow;
import interf.Color;
import interf.Clothes;

public class ColorFactory extends AbstractFactory {

	@Override
	public Clothes getType(String type) {
		return null;
	}

	@Override
	public Color getColor(String color) {
		if (color.equals("Red")){
			return new Red();
		}
		if (color.equals("Yellow")){
				return new Yellow();
		}
		if (color.equals("Green")){
			return new Green();
		}
		return null;
	}

}
