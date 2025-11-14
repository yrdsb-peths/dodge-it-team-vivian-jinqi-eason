import greenfoot.*;

public class MyWorld extends World {
    private int ammo = 0;
    private Bee bee;
    public MyWorld() {
        super(600, 400, 1);

        Bee bee = new Bee();
        addObject(bee, 300, 350);
        Coin coin = new Coin();
        addObject(coin, Greenfoot.getRandomNumber(600), 350);
    }
    public void act()
    {
        if(Greenfoot.getRandomNumber(100) < 1)
            {
             addObject(new Coin(), Greenfoot.getRandomNumber(600), 350);    
            }
    }
    public void addAmmo(int number)
    {
        if(ammo <= 3)
        {
            ammo += number;    
        }
    }
}
