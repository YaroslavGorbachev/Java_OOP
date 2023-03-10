package Unit.Magical;

import Unit.Human;

import java.util.ArrayList;

public class Mag extends magical  {



    public Mag(int hp, int maxHp, int minAttack, int maxAttack,int def,int speed,int mana, int maxMana,String name,int x,int y) {
        super(hp,maxHp,minAttack,maxAttack,def,speed,x,y,mana, maxMana,name);
        super.name = name;
    }
    public Mag(String name,int x,int  y){
        this(75,75,18,20,5,15,150,150,name,x,y);
    }
    @Override
    public String getInfo() {
        return String.format("Имя: %s  Hp: %d Урон: %d Защита: %d %2d Скорость %2d Маг",
        this.name, this.hp, this.maxHp, this.minAttack,this.maxAttack, this.def, this.speed, this.mana, this.maxMana, this.getClass().getSimpleName());
    }

    @Override
    public void step(ArrayList<Human> t1, ArrayList<Human> t2) {
        if (state.equals("Die")) {
            hp = 0;
            return;
        }
        for (int i = 0; i < t1.size(); i++) {
            if (t1.get(i).hp < t1.get(i).maxHp) {
                t1.get(i).getDamage(maxAttack);
                System.out.println(name + " " + getInfo() + "  ->  " + t1.get(i).name + " " + t1.get(i).getInfo());
                break;
            }
        }
    }

    @Override
    public String toString() {
        return "\uD83E\uDDD9" +
                " H:" + Math.round(hp) +
                " D:" + def +
                " A:" + attack +
                " Dmg:" + Math.round(Math.abs((minAttack+maxAttack)/2)) + " " +
                state;
    }
}