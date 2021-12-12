package Brick.Break.Brick.Crack.Directions;

import org.junit.jupiter.api.Test;

import java.awt.*;

import static org.junit.jupiter.api.Assertions.*;

/**
 * This class contains all the unit testing for DirectionUp class.
 */
class DirectionUpTest {

    DirectionUp directionUp = new DirectionUp();

    /**
     * This test case is used to test the expected X start location.
     */
    @Test
    void getXStartLocationTest(){
        assertEquals(20, directionUp.setStartLocation(new Point(), new Rectangle(20,30, 4, 5)).getX());
    }

    /**
     * This test case is used to test the expected Y start location.
     */
    @Test
    void getYStartLocationTest(){
        assertEquals(35, directionUp.setStartLocation(new Point(), new Rectangle(20,30, 4, 5)).getY());
    }

    /**
     * This test case is used to test the expected X end location.
     */
    @Test
    void getXEndLocationTest(){
        assertEquals(24, directionUp.setEndLocation(new Point(), new Rectangle(20,30, 4, 5)).getX());
    }

    /**
     * This test case is used to test the expected Y end location.
     */
    @Test
    void getYEndLocationTest(){
        assertEquals(35, directionUp.setEndLocation(new Point(), new Rectangle(20,30, 4, 5)).getY());
    }

}