package Unit.Magical;
import Unit.man;
import java.util.ArrayList;

public abstract class magical extends man {
    int mana,maxMana;
    static String name;
   
    public magical (int hp, int maxHp, int minAttack, int maxAttack, int def, int speed, int maxMana, int mana, int x, int y, String name){
    super(hp,maxHp,minAttack,maxAttack,def,speed,x,y);
    this.mana = mana;
    this.maxMana = maxMana; 
}

    
@Override
public void step(ArrayList t1, ArrayList t2) {

}

   


    
}
