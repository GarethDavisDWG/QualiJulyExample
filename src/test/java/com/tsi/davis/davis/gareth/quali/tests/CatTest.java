package com.tsi.davis.davis.gareth.quali.tests;


import com.tsi.davis.davis.gareth.quali.Cat;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Assertions.*;

public class CatTest {

    @Test
    public void test_get_cat_name(){
        Cat testCat = new Cat();
        assertEquals("Tibbles",testCat.getName(),"The cats names were not the same");

    }

    @Test
    public void test_get_cat_age(){
        Cat testCat = new Cat();
        assertEquals(5.5, testCat.getAge());

    }



}
