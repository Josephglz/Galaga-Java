import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class metioro here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class metioro extends Actor
{
    /**
     * Act - do whatever the metioro wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
       move(2);
       World m=getWorld();
       if (getX()>m.getWidth()-5||getX()<05){
           turn(180);
           if (Greenfoot.getRandomNumber(100)<90){
           turn(Greenfoot.getRandomNumber(90-45));
        }
       }    
        if(getY()>=m.getHeight()-5||getY()<=5) {
        turn(180);
        if(Greenfoot.getRandomNumber(100)<90){
        turn(Greenfoot.getRandomNumber(90-45));
        }
       }
       destruccion();
}

    public void destruccion(){
        if(this.isTouching(disparo.class)){
            removeTouching(metioro.class);
            getWorld().addObject(new metioro(),Greenfoot.getRandomNumber(600),Greenfoot.getRandomNumber(400));
        }
       }
    }
