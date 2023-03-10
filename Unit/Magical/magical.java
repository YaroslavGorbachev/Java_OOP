package Unit.Magical;
import Unit.Human;
import java.util.ArrayList;

public abstract class magical extends Human {
    int mana,maxMana;
    static String name;
   
    public magical (int hp, int maxHp, int minAttack, int maxAttack, int def, int speed, int maxMana, int mana, int x, int y, String name){
    super(hp,maxHp,minAttack,maxAttack,def,speed,x,y);
    this.mana = mana;
    this.maxMana = maxMana; 
}



@Override
    public void step(ArrayList<Human> t1, ArrayList<Human> t2) {
        if (state.equals("Die")) {hp = 0; return;}
        for (int i = 0; i < t1.size(); i++) {
            if (t1.get(i).hp < t1.get(i).maxHp){
                t1.get(i).getDamage(maxAttack);
                System.out.println(name + " " + getInfo() + "  ->  " + t1.get(i).name +" "+ t1.get(i).getInfo());
                break;
            }
        }
    }

   


    
}
