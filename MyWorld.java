import greenfoot.*;
public class MyWorld extends World {
    public MyWorld() {
        super(600, 400, 1);
        addObject(new Bee(), 300, 200);
    }
    public void spawnCoin() {
        int x = Greenfoot.getRandomNumber(600);
        int y = Greenfoot.getRandomNumber(400);
        addObject(new Coin(), x, y);
    }
}
