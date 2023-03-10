package Unit.Distant_Battale;

import java.util.ArrayList;

import Unit.Human;

public class Crossbowman extends Archer{




    public Crossbowman (String name,int x,int  y){
        super(50,150,12,5,7,5,22,name,x,y);
       super.name = name;
    }

    @Override
    public String getInfo() {
        return String.format("Имя: %s  Hp: %d Урон: %d Защита: %d %2d Скорость %2d Арбалетчик",
        this.name, this.hp, this.maxHp, this.minAttack,this.maxAttack, this.def, this.speed, this.shoots, this.getClass().getSimpleName());
    }

    public void step(ArrayList<Human> t1 , ArrayList<Human> t2){
        super.step(t1, t2);
    }





}
