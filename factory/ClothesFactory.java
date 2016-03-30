package factory;

import entity.Hat;
import entity.Shorts;
import entity.Skirt;
import entity2.Red;
import entity2.Yellow;
import interf.Clothes;
import interf.Color;

public class ClothesFactory extends AbstractFactory {

	@Override
    public Clothes getType(String type) {

		if (type.equals("Hat")){
			return new Hat();
		}
		if (type.equals("Shorts")){
			return new Shorts();
		}
		if (type.equals("Skirt")){
			return new Skirt();
		}
		return null;
	}

	@Override
	public Color getColor(String color) {

        if (color.equals("Red")) {
            return new Red();
        }
        if (color.equals("Yellow")) {
            return new Yellow();
        }
        return null;
	}

}
