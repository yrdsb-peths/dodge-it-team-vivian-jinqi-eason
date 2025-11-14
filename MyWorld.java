import greenfoot.*;

public class MyWorld extends World {
    private int ammo = 0;
    private Bee bee;
    public MyWorld() {
        super(600, 400, 1);

        Bee bee = new Bee();
        addObject(bee, 300, 350);
        Ammo ammo = new Ammo();
        addObject(ammo, Greenfoot.getRandomNumber(600), 350);
        Bullet b = new Bullet();
        Enemy a = new Enemy();
        addObject(a,300,50);
        
    }
    public void act()
    {
        if(Greenfoot.getRandomNumber(150) < 1)
            {
             addObject(new Ammo(), Greenfoot.getRandomNumber(600), 350);    
            }
    }
    public void showAmmo(int ammo)
    {
        showText("Ammo: " + ammo, 520, 50);
    }
}
