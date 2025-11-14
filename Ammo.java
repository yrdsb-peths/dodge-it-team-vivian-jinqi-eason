import greenfoot.*;
public class Ammo extends Actor
{
    public void act()
    {
        setLocation(getX(), getY());
        if(isTouching(Bee.class))
        {
            Bee bee = (Bee) getOneIntersectingObject(Bee.class);
            getWorld().removeObject(this);
        }
    }
}
