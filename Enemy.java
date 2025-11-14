import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class enemy here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Enemy extends Actor
{
    /**
     * Act - do whatever the enemy wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        if(isTouching(Enemy.class))
        {
        World w = getWorld();
        Enemy e = (Enemy) getOneIntersectingObject(Enemy.class); 
        w.removeObject(e);
        w.removeObject(this);
        
        w.addObject(new Enemy(), Greenfoot.getRandomNumber(getWorld().getWidth()), 0);
        }
    }
}
