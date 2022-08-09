package com.tsi.davis.davis.gareth.quali;

import java.lang.reflect.InvocationTargetException;
import java.util.Objects;

public abstract class Animal {

    private double age;

    public Animal(double age){
        this.age = age;
    }

    public double getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Animal animal = (Animal) o;
        return age == animal.age;
    }

    public Animal breed(Animal partner ) {

        Animal babyAnimal = null;

        try {
            babyAnimal = partner.getClass().getDeclaredConstructor().newInstance();
            throw new Exception();
        }
        catch(NoSuchMethodException nse ){

        }
        catch(Exception e){

        }
        finally {
            return babyAnimal;
        }

    }

    public Animal breeds(Animal partner ) throws IllegalAccessException,NoSuchMethodException,InstantiationException,IllegalArgumentException, InvocationTargetException {

        Animal babyAnimal = null;

         return   babyAnimal = partner.getClass().getDeclaredConstructor().newInstance();

    }

    @Override
    public int hashCode() {
        return Objects.hash(age);
    }
}
