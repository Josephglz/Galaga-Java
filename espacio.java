import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class espacio here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class espacio extends World
{
    /**
     * Constructor for objects of class espacio.
     * 
     */
    public espacio()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
        nave n1=new nave ();
        addObject(n1,50,300);
        int i=0;
        while (i<10){
            int xcoord = Greenfoot.getRandomNumber(getWidth());
            int ycoord = Greenfoot.getRandomNumber(getHeight());
            addObject(new metioro(), xcoord, ycoord);
            i=i+1;
        }
        crearenemigo();
    }
    
    public void crearenemigo(){
        Greenfoot.delay(30);
            int xcoord = Greenfoot.getRandomNumber(getWidth());
            int ycoord = Greenfoot.getRandomNumber(getHeight());
            addObject(new enemigo(), xcoord, ycoord);
    }
    
    private nave nave = new nave();
    
    public nave getnave(){
        return nave;
    }
    
    private int vidas = 2;
    
    public int getvidas(){
        return vidas;
    }
    
    public void updateVidas(){
        vidas++;
    }
}
