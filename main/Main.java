package main;

import factory.AbstractFactory;
import factory.FactoryChoicer;
import interf.Clothes;
import interf.Color;

public class Main {

	public static void main(String[] args) {

		AbstractFactory closeFactory = FactoryChoicer.getFactory(2);
		Clothes hats = closeFactory.getType("Hat");
        Color color = closeFactory.getColor("Red");
		hats.setType();
        color.set();

        System.out.println("\n");

		Clothes shorts = closeFactory.getType("Shorts");
        Color color1 = closeFactory.getColor("Yellow");
		shorts.setType();
        color1.set();

        System.out.println("\n");

		Clothes skirt = closeFactory.getType("Skirt");
        Color color3 = closeFactory.getColor("Yellow");
		skirt.setType();
        color3.set();

        System.out.println("\n");

		AbstractFactory colorFactory = FactoryChoicer.getFactory(1);
		Color red = colorFactory.getColor("Red");
		red.set();

		Color green = colorFactory.getColor("Green");
		green.set();

		Color yellow = colorFactory.getColor("Yellow");
		yellow.set();

	}

}
