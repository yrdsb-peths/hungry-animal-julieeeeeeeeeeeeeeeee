import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Seal extends Actor
{
    public void act()
    {
        if(Greenfoot.isKeyDown("left"))
        {
            move(-3);
        }
        if(Greenfoot.isKeyDown("right"))
        {
            move(3);
        }
        
        eat();
    }
    
    public void eat()
    {
        if(isTouching(Cupcake.class))
        {
            removeTouching(Cupcake.class);
            MyWorld world = (MyWorld) getWorld();
            world.createCupcake();
            world.increaseScore();
        }
    }
}
