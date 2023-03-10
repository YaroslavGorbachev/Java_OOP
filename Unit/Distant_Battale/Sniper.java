package Unit.Distant_Battale;

import java.util.ArrayList;

import Unit.Human;

public class Sniper extends Archer {

   
    public Sniper(String name,int x,int  y){
        super(150,150,12,15,5,5,22,name,x,y);
        super.name= name;
    }
    
    @Override
    public String getInfo() {
        return String.format("Имя: %s  Hp: %d Урон: %d Защита: %d %2d Скорость %2d Снайпер",
        this.name, this.hp, this.maxHp, this.minAttack,this.maxAttack, this.def, this.speed, this.shoots, this.getClass().getSimpleName());
    }



    @Override
    public void step(ArrayList<Human> t1, ArrayList<Human> t2) {
        super.step(t1, t2);
    }
}