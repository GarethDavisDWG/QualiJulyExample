package com.tsi.davis.davis.gareth.quali;

public abstract class Mammal extends Animal{

    private String name;

    public Mammal (String name, double age){
        super(age);
        this.name = name;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
