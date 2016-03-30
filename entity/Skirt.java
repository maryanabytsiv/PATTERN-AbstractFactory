package entity;

import interf.Clothes;

public class Skirt implements Clothes {

    @Override
    public void setType() {
        System.out.println("Skirt");
    }
}