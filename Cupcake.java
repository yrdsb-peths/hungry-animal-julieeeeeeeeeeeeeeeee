import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Cupcake extends Actor
{
    public void act()
    {
        int x = getX();
        int y = getY() + 2;
        setLocation(x, y);
        
        MyWorld world = (MyWorld) getWorld();
        if(getY() >= world.getHeight())
        {
            world.gameOver();
            world.removeObject(this);
        }
    }
}
