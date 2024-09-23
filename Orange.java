import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Orange extends Food
{
    /**
     * Oranges are bonus fruit that are worth more points but will not end 
     * the game if they are not collected.
     */
    private int speed = 3;
    
    public Orange()
    {
        super(5);
    }
    
    public void act()
    {
        setLocation(getX(), getY() + speed);
        
        MyWorld world = (MyWorld) getWorld();
        if(getY() >= world.getHeight())
        {
            world.removeObject(this);
            world.createFood();
        }
    }
    
    public void setSpeed(int spd)
    {
        speed = spd; 
    }
}
