import greenfoot.*;
public class Coin extends Actor
{
    public void act()
    {

    }
}
    private void spawnCoin()
    {
        Coin coin = new Coin();
        int x = Greenfoot.getRandomNumber(getWidth());  
        int y = Greenfoot.getRandomNumber(getHeight()); 
        addObject(coin, x, y);
    }
    public void respawnCoin()
    {
        spawnCoin();
    }
}