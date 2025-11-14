import greenfoot.*;
public class Coin extends Actor
{
    public void act()
    {
        setLocation(getX(), getY());
        if(isTouching(Bee.class))
        {
            Bee bee = (Bee) getOneIntersectingObject(Bee.class);
            bee.catchAmmo();
            getWorld().removeObject(this);
        }
    }
}
