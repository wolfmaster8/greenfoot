import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Papas here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Papas extends Actor
{
    /**
     * Act - do whatever the Papas wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
        if(isTouching(Pao.class)){
         getWorld().showText("Batatas Fritas", getX(), getY());
         //Greenfoot.playSound("pop.wav");
        }
    }    
}
