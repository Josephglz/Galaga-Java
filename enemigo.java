import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class enemigo here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class enemigo extends Actor
{
    /**
     * Act - do whatever the enemigo wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        move(4);
        if(Greenfoot.getRandomNumber(100)<10){
            turn(Greenfoot.getRandomNumber(90)-45);
        }
        turnAtEdge();
        randomMovement();
    }
    
    private void randomMovement(){
        if(Greenfoot.getRandomNumber(100)<10){
            turn(Greenfoot.getRandomNumber(90)-45);
        }
    }
    
        public void turnAtEdge()
    {
        if(isAtEdge()){
            turn(180);
        }
    }
}
