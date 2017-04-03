import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Esta clase define una langosta. Las langostas viven en la playa o en el mar. Se comen a los cangrejos.
 */
public class Lobster extends Animal
{
    public void act()
 {    
     move();
     lookForCrab();
     turnAtEdge();
     randomTurn();
}

/**
 * Comprueba si descubrimos un cangrejo. 
 * SI lo vemos, nos lo comemos. Si no, no hacemos nada.
 */
public void lookForCrab()
{
   if (canSee(Crab.class))
   { 
       eat(Crab.class);
       Greenfoot.playSound("bu.wav");
       Greenfoot.stop();
    }
    
}

/**
 * Realiza un giro cuando se encuentra en el borde.
 */
public void turnAtEdge()
{
    if ( atWorldEdge())
        {
        turn(20);
    }
}

/**
 * Realiza un giro aleatoriamente.
 */
public void randomTurn()
{
      if ( Greenfoot.getRandomNumber(100) < 10)
    {
    turn(Greenfoot.getRandomNumber(90)-45);
}
}   

}
