import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Mujer here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Mujer extends Actor
{
    /**
     * Act - do whatever the Mujer wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
        if(isTouching(Pao.class)){
         getWorld().showText("Mulher", getX(), getY());
         //Greenfoot.playSound("pop.wav");
        }
    }    
}
