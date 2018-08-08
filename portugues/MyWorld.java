import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.concurrent.ThreadLocalRandom;
/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */


public class MyWorld extends greenfoot.World
{
    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(800, 600, 1, false);
        
        showText("Usa las flechas para mover al Oso", 200, 20);
        showText("Presiona la barra espaciadora para disparar y descubrir las palabras", 300, 40);
        addObject(new Oso(), 30, 200);
        addObject(new Apple(), randomX(), randomY());
        addObject(new Aviao(), randomX(), randomY());
        addObject(new SuperO(), randomX(), randomY());
    }
    public int randomX(){
        int random= ThreadLocalRandom.current().nextInt(60, 798 + 1);
        return random;
    }
    public int randomY(){
        int random= ThreadLocalRandom.current().nextInt(60, 598 + 1);
        return random;
    }
}
