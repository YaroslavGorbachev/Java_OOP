package Unit.Distant_Battale;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.sql.SQLOutput;



import Unit.Human;


public abstract class Archer extends Human {
    int shoots;

    public Archer (int hp, int maxHp, int minAttack, int maxAttack,int def,int speed,int shoots,String name,int x,int y){
    super(hp,maxHp,minAttack,maxAttack,def,speed, x,y);

    this.shoots = shoots;


    }
    @Override
    public void step(ArrayList<Human> t1, ArrayList<Human> t2) {
        if (state.equals("Die")) {hp = 0; return;}
        if (state.equals("DIe") || shoots == 0) return;
        int target = findNearest(t2);
        System.out.println(name + " " + getInfo() + "  ->  " + t2.get(target).name +" "+ t2.get(target).getInfo());
        float damdge = (t2.get(target).def - attack > 0) ?
                minAttack : (t2.get(target).def - attack < 0) ?
                maxAttack : ( (maxAttack+minAttack) / 2);
        t2.get(target).getDamage(damdge);

        for (int i = 0; i < t1.size(); i++) {
            if (( t1.get(i).getInfo().equals("Фермер")) && t1.get(i).state.equals("Stand")){
                System.out.println("Фермер " + t1.get(i).name + " занят");
                t1.get(i).state = "Busy";
                return;
            }
        }
        shoots --;
    }
    @Override
    public String toString() {
        return "🏹" +
                " H:" + Math.round(hp) +
                " D:" + def +
                " A:" + attack +
                " Dmg:" + Math.round(Math.abs((minAttack+maxAttack)/2)) + " " +
                state;
    }
}



    


        
    
  
    


   

