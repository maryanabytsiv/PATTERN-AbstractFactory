package entity;

import interf.Clothes;

public class Shorts implements Clothes {

    @Override
    public void setType() {
        System.out.println("Shorts");
    }
}
