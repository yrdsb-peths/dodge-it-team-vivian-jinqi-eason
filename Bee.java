import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Bee here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Bee extends Actor
{
    /**
     * Act - do whatever the Bee wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        if(Greenfoot.isKeyDown("left"))
        {
            move(-5);    
        }
        if(Greenfoot.isKeyDown("right"))
        {
            move(5);    
        }
        if(Greenfoot.isKeyDown("f"))
        {
            
        }
    }
    public void catchAmmo()
    {
        ((MyWorld)getWorld()).addAmmo(1);
    }
    private void shoot()
    {
        
        
    }
}
