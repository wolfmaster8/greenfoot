import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Oso here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Oso extends Actor
{
    /**
     * Act - do whatever the Oso wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    World w;
    public void act() 
    {
        
        // Add your action code here.
        movement();
        select();
        
    }    
    
    public void movement(){
        if(Greenfoot.isKeyDown("Up")){
            setLocation(getX(), getY() -10);
        }
        
        if(Greenfoot.isKeyDown("Down")){
            setLocation(getX(), getY() +10);
        }
        
        if(Greenfoot.isKeyDown("Left")){
            setLocation(getX()-10, getY() );
        }
        
        if(Greenfoot.isKeyDown("Right")){
            setLocation(getX()+10, getY() );
        }
    }
    
    public void select(){
     World w= getWorld();   
     
     if(Greenfoot.isKeyD("space")){
         w.addObject(new Pao(), getX(), getY());
        }
    }
}
