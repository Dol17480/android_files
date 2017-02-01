package com.example.user.tddintro;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;
/**
 * Created by user on 07/11/2016.
 */

public class RobotTest {

    Robot robot;

    @Before
    public void before(){
        robot = new Robot("C3PO", "Gold");
    }

    @Test
    public void testRobotSetUp() {
        assertEquals("C3PO", robot.getName());
        assertEquals("Gold", robot.getColour());
    }

    @Test
    public void testCheckBattery(){
        assertEquals(100.0, robot.getBattery(), 0.1);
    }

    @Test
    public void testCanMakeDrink(){
        robot.makeDrink("tea");
        assertEquals(90.0, robot.getBattery(), 0.1);
        assertEquals("I am making tea", robot.makeDrink("tea"));
    }

    @Test
    public void testCanWashDishes(){
        robot.washDishes();
        assertEquals(70.0, robot.getBattery(), 0.1);
        assertEquals("I am washing the dishes", robot.washDishes());
    }

    @Test
    public void testCanDoDusting(){
        robot.doDusting();
        assertEquals(80.0, robot.getBattery(), 0.1);
        assertEquals("I am dusting", robot.doDusting());
    }

    @Test
    public void testCanRecharge(){
        robot.doDusting();
        assertEquals(80.0, robot.getBattery(), 0.1);
        robot.recharge();
        assertEquals(100.0, robot.getBattery(), 0.1);
    }



}
