package com.tsi.davis.davis.gareth.quali;

public class Cat extends Mammal{

    ///////////////////////Attributes///////////////////////////////

    private int killTotal;


    ///////////////////////Constructor//////////////////////////////

    public Cat(String name, double age){
        super(name, age);
    }

    public Cat(double age){
        this("Tibbles",age);
    }

    public Cat(){
        this(5.5);
    }







    ///////////////////////Methods/////////////////////////////////
    public void brushTeeth() throws DangerousAnimalException{

    }

    @Override
    public String toString() {
        return "I am "+this.getName()+" and I am "+this.getAge()+" years old";
    }


}
