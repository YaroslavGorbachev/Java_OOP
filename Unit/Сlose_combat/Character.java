package Unit.Сlose_combat;
import Unit.man;

import java.util.ArrayList;


public abstract class Character extends man{
    
    int cartridges;
    int stealth;
    String name;
    
    public Character (int hp, int maxHp, int minAttack, int maxAttack,int def,int speed,int x,int y) {
    super(hp,maxHp,minAttack,maxAttack,def,speed,x,y);
    }      
    public int getCartridges() {
        return cartridges;
    }

    public int getStealth() {
        return stealth;
    }
    @Override
    public void step(ArrayList<man> t1, ArrayList<man> t2) {

    }
}