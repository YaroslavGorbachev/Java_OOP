package Unit.Сlose_combat;

import java.util.ArrayList;


import Unit.man;


public class Farmer<man> extends Character {

    public Farmer(int hp, int maxHp, int minAttack, int maxAttack,int def,int speed,int x,int y) {
        super(hp,maxHp,minAttack,maxAttack,def,speed,x,y);
        this.cartridges = cartridges;
        super.name = name;
    }
    public Farmer (String string,int x ,int y){
        super(50,50,2,5,10,15,x,y);
        super.name= name;
}

    
    @Override
    public String getInfo() {
        return String.format("Имя: %s  Hp: %d Урон: %d Защита: %d %2d Скорость %2d Фермер",
        this.name, this.hp,this.maxHp,this.minAttack,maxAttack, this.def, this.speed,this.getClass().getSimpleName());
        }
    @Override
    public void step(ArrayList<Unit.man> t1, ArrayList<Unit.man> t2) {
        if (state.equals("Die")) {hp = 0; return;}
        if (!state.equals("Die")) state = "Stand";
        System.out.println("Фермер " + name + " освободился");
    }
}    






    

