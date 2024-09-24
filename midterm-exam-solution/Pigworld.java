// WARNING: This file is auto-generated and any changes to it will be overwritten
import lang.stride.*;
import java.util.*;
import greenfoot.*;

/**
 * 
 */
public class Pigworld extends World
{

    /**
     * Constructor for objects of class Pigworld.
     */
    public Pigworld()
    {
        super(600, 400, 1);
        prepare();
    }

    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        Pig pig =  new Pig();
        addObject(pig, 156, 234);
        Burger burger =  new Burger();
        addObject(burger, 417, 88);
        Burger burger2 =  new Burger();
        addObject(burger2, 319, 196);
        Snake snake =  new Snake();
        addObject(snake, 548, 354);
        Burger burger3 =  new Burger();
        addObject(burger3, 190, 361);
    }
}
