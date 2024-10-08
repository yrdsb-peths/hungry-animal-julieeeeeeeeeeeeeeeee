import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class MyWorld extends World
{
    public int score = 0;
    Label scoreLabel; 
    int level = 1;
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1, false);
        Elephant s = new Elephant();
        addObject(s, 300, 350);
        
        
        scoreLabel = new Label(0, 80);
        addObject(scoreLabel, 50, 50);
        
        createFood();
    }
    
    public void gameOver()
    {
        Label gameOverLabel = new Label("Game Over", 100);
        addObject(gameOverLabel, 300, 200);
    }
    
    public void increaseScore(int value)
    {
        score += value;
        scoreLabel.setValue(score);
    }
    
    public void createFood()
    {
        int rand = Greenfoot.getRandomNumber(5);
        Food food; 
        if(rand == 0)
        {
            food = new Orange();
        }
        else
        {
            food = new Apple();
        }
        int x = Greenfoot.getRandomNumber(600);
        addObject(food, x, 0);
    }
}