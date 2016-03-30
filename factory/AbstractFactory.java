package factory;

import interf.Clothes;
import interf.Color;

public abstract class AbstractFactory {

    public abstract Clothes getType(String type);

    public abstract Color getColor(String color);
}