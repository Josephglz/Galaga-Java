import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class nave here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class nave extends Actor
{
    int fireCount = 0;
    int lives;
    public void act()
    {
        teclas();
        fireCount();
        morir();
    }
    
    public nave(){
        lives=2;
    }
    
    public void teclas(){
        if(Greenfoot.isKeyDown("up")){
            setLocation(getX(), getY()-3);
        }
        if(Greenfoot.isKeyDown("down")){
            setLocation(getX(), getY()+3);
        }
        if(Greenfoot.isKeyDown("space") && fireCount == 30){
           this.getWorld().addObject(new disparo(), getX(), getY() - 1) ;
           fireCount = 0 ;
        }
    }
    
    public void fireCount(){
        if(fireCount < 30){
            fireCount++ ;
        }
        else{
            fireCount = 30 ;
        }
    }
    
    private void morir(){
        if(isTouching(enemigo.class)){
            setLocation(20,20);
            lives--;
            if(lives<0){
                Greenfoot.stop();
            }
        }
    }

        private void vidas(){
        getWorld().showText("VIDAS : " + lives, 78, 380);
    }
}
            