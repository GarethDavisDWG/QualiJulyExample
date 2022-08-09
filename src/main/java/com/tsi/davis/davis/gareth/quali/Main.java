package com.tsi.davis.davis.gareth.quali;

public class Main {

    public static void main(String[] args){

        Cat cat = new Cat("Snuggles",6);
        System.out.println("I am "+cat.getName()+" and I am "+cat.getAge()+" years old");
        Cat cat1 = new Cat();
        System.out.println("I am "+cat1.getName()+" and I am "+cat1.getAge()+" years old");
        System.out.println(cat1);
        if(cat.equals(cat1)){
            System.out.println("THE SAME CATS WOW");
        }
        Animal cat3 = cat.breed(cat1);
        Cat cat4 = (Cat) cat.breed(cat1);
        try {
               Cat cat5 = (Cat) cat3.breeds(cat4);
        }
        catch (Exception e){

        }

    }

}
