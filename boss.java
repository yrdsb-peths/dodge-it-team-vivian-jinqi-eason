import greenfoot.*;  

public class Boss extends Actor
{
    private int health = 50;
    private int speed = 2;

    public void act()
    {
        movePattern();
        checkHit();
        checkDeath();
    }

    public void movePattern()
    {
        setLocation(getX() + speed, getY());

        if (getX() <= 20 || getX() >= getWorld().getWidth() - 20)
        {
            speed = -speed;
        }
    }

    public void checkHit()
    {
        Coin b = (Coin)getOneIntersectingObject(Coin.class);
        if (b != null)
        {
            health -= 5;
            getWorld().removeObject(b);
        }
    }

    public void checkDeath()
    {
        if (health <= 0)
        {
            getWorld().removeObject(this);
        }
    }
}
