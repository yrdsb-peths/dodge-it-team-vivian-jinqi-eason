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
    private int ammo = 0;
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
            shoot();
            ammo--;
            ((MyWorld)
            getWorld()).showAmmo(ammo);
        }
        if(isTouching(Ammo.class) && ammo < 3)
        {
            ammo++;
            ((MyWorld)
            getWorld()).showAmmo(ammo);
            getWorld().removeObject(getOneIntersectingObject(Ammo.class));
            
        }
    }
    private void shoot()
    {
        Bullet b = new Bullet();
        getWorld().addObject(b, getX(), getY() - 30);
            
    }
}
