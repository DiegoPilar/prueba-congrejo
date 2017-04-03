import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Esta clase define una langosta. Las langostas viven en la playa o en el mar. Se comen a los cangrejos.
 */
public class Lobster extends Animal
{
 private World mundo;
 public Lobster(){
    GusanoComidoe=0;
}
    public void act()
 {   
     mundo=getWorld();
     mundo.showText("Jugador " +GusanoComidoe , 500,50);
     move();
     lookForCrab();
     lookForWorm();
     turnAtEdge();
     randomTurn();
     Fin_del_juego(GusanoComidoe);
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
 * Comprueba si se come un gusano y lo desaparece
 */
public void lookForWorm()
{
   if (canSee(Worm.class))
   { 
       eat(Worm.class);
       Greenfoot.playSound("bite.wav");
       
       GusanoComidoe= GusanoComidoe + 1;
        mundo.showText("Enemig " +GusanoComidoe , 500,50);
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
