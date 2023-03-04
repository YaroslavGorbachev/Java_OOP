package Unit.Distant_Battale;
import java.util.ArrayList;
import java.util.Random;

import Unit.Vector2D;
import Unit.man;
import Unit.Сlose_combat.Farmer;

public abstract class Archer extends man{
    int shoots;

    public Archer (int hp, int maxHp, int minAttack, int maxAttack,int def,int speed,int shoots,String name,int x,int y){
    super(hp,maxHp,minAttack,maxAttack,def,speed, x,y);

    this.shoots = shoots;

    
}
    @Override
    public void step(ArrayList<man> t1, ArrayList<man> t2) {
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

//@Override
//public void step(ArrayList<man> t1, ArrayList<man> t2) {
//    if (this.hp >= 0 || this.shoot == 0) {
//        Random rnd = new Random();
//        if (t1.contains(this)) {
//            int min = 20;
//            int tmp;
//            int index = 0;
//            for (int i = 0; i < t2.size(); i++) {
//                tmp = Vector2D.getDistance(this, (man) t2.get(i));
//                if (min > tmp) {
//                    min = tmp;
//                    index = i;
//                }
//            }
//            System.out.println(this.toString());
//            System.out.println(t2.get(index));
//            System.out.printf("%s стреляет в %s\n", this.name, t2.get(index).getName());
//            t2.get(index).hp = t2.get(index).hp - rnd.nextInt(this.minAttack, this.maxAttack);
//            if (searchFermer(t1)) this.shoot--;
//            System.out.println(this.toString());
//            System.out.println(t2.get(index));
//
//
//
//        } else {
//            int min = 0;
//            int tmp;
//            int index = 0;
//            for (int i = 0; i < t1.size(); i++) {
//                tmp = Vector2D.getDistance(this, (man) t1.get(i));
//                if (min > tmp) {
//                    min = tmp;
//                    index = i;
//                }
//            }
//            System.out.println(t1.get(index));
//            System.out.printf("%s стреляет в %s\n", this.name, t2.get(index).getName());
//            System.out.println(this.toString());
//            t1.get(index).hp = t1.get(index).hp - rnd.nextInt(this.minAttack, this.maxAttack);
//            if (searchFermer(t2)) this.shoot--;
//            System.out.println(this.toString());
//            System.out.println(t1.get(index));
//
//
//        }
//    }
//}
//boolean searchFermer(ArrayList<man> team){
//    boolean search = true;
//
//    for (int i = 0; i < team.size(); i++) {
//        if (team.get(i) instanceof Farmer){
//            search = false;
//        }
//    }
//    return search;
//}
}


    


        
    
  
    


   

