import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class MyWorld extends World
{
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1);
        Seal s = new Seal();
        addObject(s, 300, 350);
    }
    
    public void createCupcake()
    {
        Cupcake cupcake = new Cupcake();
        int x = Greenfoot.getRandomNumber(600);
        int y = Greenfoot.getRandomNumber(100);
        addObject(cupcake, x, 7);
    }
}