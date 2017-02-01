package com.example.user.bears;

import org.junit.Before;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;

/**
 * Created by user on 19/11/2016.
 */

public class BearTest {

    Bear bear;
    Salmon salmon;

    @Before
    public void before(){
        bear = new Bear("Baloo", 25, 95.62, 6.1);
    }

    @Test
    public void hasName(){
        assertEquals( "Baloo", bear.getName() );
    }

    @Test
    public void hasAge(){
        assertEquals( 25, bear.getAge() );
    }

    @Test
    public void readyToHibernateIfGreaterThan80(){
        assertEquals( true, bear.readyToHibernate() );
    }

    @Test
    public void hasHeight() {
        assertEquals(6.1, bear.getHeight(), 0.01);
    }

    @Test
    public void bellyStartsEmpty(){
        assertEquals(0, bear.foodCount());
    }

    @Test
    public void canEatSalmon(){
        bear.eat(salmon);
        assertEquals(1, bear.foodCount());
    }


}
